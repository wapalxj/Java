package C14_class_P346_interface_type;

public class InterfaceViolation {

	/**
	 * @param args
	 * C1_P346接口与类型信息
	 * instanceof检查 可以让我们使用A接口外的方法
	 */
	public static void main(String[] args) {
		A a=new B();
		a.f();
//		a.g();
		System.out.println("a的类名："+a.getClass().getSimpleName());
		if (a instanceof B) {
			//instanceof检查 可以让我们使用A接口外的方法
			((B) a).g();
		}
	}

}
class B implements A{

	@Override
	public void f() {}
	public void g() {}
}