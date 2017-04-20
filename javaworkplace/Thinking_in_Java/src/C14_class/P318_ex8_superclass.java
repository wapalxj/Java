package C14_class;

import java.lang.reflect.Field;
import java.util.Arrays;

import sun.security.util.Cache.EqualByteArray;

public class P318_ex8_superclass {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		superClass(new Integer(10).getClass());
	}

	public static void  superClass(Class<?> c) throws ClassNotFoundException {
		if (c==null) {
			return;
		}
		System.out.println(c.getName());
		Field [] fields=c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("    "+field.toString());
		}
		
		for (Class<?> k:c.getInterfaces()) {
			System.out.println("interfaces:"+k.getInterfaces());
			superClass(k.getSuperclass());
		}
		superClass(c.getSuperclass());
	}
}
