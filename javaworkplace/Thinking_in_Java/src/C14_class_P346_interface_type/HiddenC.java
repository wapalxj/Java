package C14_class_P346_interface_type;

/**
 * 对接口更严苛的控制，防止使用接口之外的方法：包访问权限
 * @author mgh2569702
 *
 */
public class HiddenC {
	public static A maekeA() {
		return new C();
	}
}

//对接口更严苛的控制，防止使用接口之外的方法：包访问权限
class C implements A{
	@Override
	public void f() {
		System.out.println("public C.f()");
	}
	public void g() {
		System.out.println("public C.g()");
	}
	 void u() {
		System.out.println("package C.u()");
	}
	protected void v() {
			System.out.println("protected C.v()");
		}
	private void w() {
		System.out.println("private C.w()");
	}
}