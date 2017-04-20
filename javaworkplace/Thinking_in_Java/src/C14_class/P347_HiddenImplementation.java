package C14_class;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sun.swing.internal.plaf.basic.resources.basic;

import C14_class_P346_interface_type.A;
import C14_class_P346_interface_type.HiddenC;


public class P347_HiddenImplementation {

	/**对接口更严苛的控制，防止使用接口之外的方法：包访问权限
	 * @param args
	 * 对C14_class_P346_interface_type包的HiddenC的测试
	 * 
	 * //然后通过反射，同样可以访问到！！！
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class HiddenImplementation{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		A a=HiddenC.maekeA();
		a.f();
		System.out.println(a.getClass().getName());
		//Compile error:can not find symbol
//		if (a instanceof C) {
//			C c= (C)a;
//			c.g();
//		}
		//然后通过反射，同样可以访问到！！！
		callHiddenMethod(a, "g");
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
		
	}
	
	static void callHiddenMethod(Object a,String methodName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method g=a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}
}