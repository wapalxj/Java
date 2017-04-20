package C12_Exception;

import java.util.List;

public class P251_case {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InheritingException ie=new InheritingException();
		try {
			ie.f();
		} catch (SimpleException e1) {
//			System.out.println("catch-----");
//			e1.printStackTrace();
			e1.printStackTrace(System.err);
			
		}
		List<String> list=null;
		System.out.println(list.size());
	}
}

class SimpleException extends Exception{}
class InheritingException {
	public void f() throws SimpleException {
		System.out.println("InheritingException-----f()");
		throw new SimpleException();
	}
}