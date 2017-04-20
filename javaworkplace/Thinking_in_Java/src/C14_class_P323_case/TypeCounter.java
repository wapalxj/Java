package C14_class_P323_case;

import java.util.HashMap;
import java.util.Map;
/**
 * 递归计数 
 * isAssignableFrom
 * @author mgh2569702
 *+
 */
public class TypeCounter extends HashMap<Class<?>,Integer> {
	private Class<?> baseType;
	public TypeCounter(Class<?> baseType) {
		this.baseType=baseType;
	}
	
	public void count(Object object) {
		Class<?> type=object.getClass();
		if (!baseType.isAssignableFrom(type)) {
			throw new RuntimeException(object+"incorrect type:"+type+"," +
					"should be type or subtype of"+baseType);
		}
		countClass(type);
	}

	private void countClass(Class<?> type) {
		Integer quantity=get(type);
		put(type, quantity==null ? 1:quantity+1);
		Class<?> superClass=type.getSuperclass();
		if (superClass!=null && baseType.isAssignableFrom(superClass)) {
			countClass(superClass);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder result=new StringBuilder("{");
		for (Entry<Class<?>, Integer> pair: entrySet()) {
			result.append(pair.getKey().getSimpleName());
			result.append("=");
			result.append(pair.getValue());
			result.append(", ");
		}
		result.delete(result.length()-2, result.length());
		result.append("}");
		return result.toString();
	}
}
