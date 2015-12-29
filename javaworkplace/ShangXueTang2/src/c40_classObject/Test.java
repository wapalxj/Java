package c40_classObject;

import java.io.ObjectInputStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj=new Object();
		Object obj2=new Object();
		//Ãû×Ö+@+hashCode
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
		
		Mobile m = new Mobile();
		System.out.println(m.toString());
		
	}

}
