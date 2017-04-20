package C14_class;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

public class P321_cese_generic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Class<Number> nClass=int.class;
		Class<?> class1=int.class;
		class1=double.class;
		
		Class<? extends Number> class2=int.class;
		class2=double.class;
		
		FilledList<CountedInteger> fl=new FilledList<>(CountedInteger.class);
		System.out.println(fl.create(14));
	}
}

class CountedInteger{
	private static long counter;
	private final long id=counter++;
	@Override
	public String toString() {
		return Long.toString(id);
	}
}

class FilledList<T>{
	private Class<T> type;
	public FilledList(Class<T> type) {
		this.type=type;
	}
	public List<T> create(int nums) {
		List<T> result=new ArrayList<>();
		for (int i = 0; i < nums; i++) {
			try {
				result.add(type.newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}