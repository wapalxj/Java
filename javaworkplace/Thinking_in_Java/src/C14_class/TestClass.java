package C14_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Class c=Class.forName("C14_class.A");
			Constructor ct=c.getConstructors()[0];
			ct.newInstance(new Object[] { Integer.valueOf(50) });
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class A{
//public A(){}
	public A(int a){
		
	}
}