package C9_interface;

import java.util.Scanner;

public class P185_case {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=null;
		scanner.next();
	}

}

class A{
	interface B{
		void f();
	}
	public class BImp implements B{
		@Override
		public void f() {}
	} 
	private class BImp2 implements B{
		@Override
		public void f() {}
	} 
	
	public interface C{
		void f();
	}
	class CImp implements C{
		@Override
		public void f() {}
	}
	public class CImp2 implements C{
		@Override
		public void f() {}
	}
	
	private interface D{
		void f();
	}
	private class DImp implements D{
		@Override
		public void f() {}
	}
	public class DImp2 implements D{
		@Override
		public void f() {}
	}
	
}