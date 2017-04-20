package C10_InnerClass;

public class P201_mutil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MNA mna =new MNA();
		MNA.A mnaa=mna.new A();
		MNA.A.B mnaab=mnaa.new B();
		mnaab.h();
		
		new E(){};
	}

}


class MNA {
	private void f(){};
	class A {
		private void g(){};
		public class B {
			void h(){
				g();
				f();
			};
		}
	}
}

class D{}
abstract class E{}
class Z extends D{
	E makeE(){
		return new E(){};
	}
}