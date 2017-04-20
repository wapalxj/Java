package C10_InnerClass;

public class P212_inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class WithInner{
	class inner{}
}

class InheritInner extends WithInner.inner{
//	public InheritInner() {}
	public InheritInner(WithInner wi) {
		wi.super();
	}
}
