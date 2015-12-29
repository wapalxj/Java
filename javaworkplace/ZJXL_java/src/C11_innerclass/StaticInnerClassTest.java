package C11_innerclass;

/*
 * 内部类2：静态内部类
 */
public class StaticInnerClassTest {
	
	public static void main(String[] args) {
		TopClass.NestedClass.visit();
	}
}

class TopClass{
	
	private static void func(){
		System.out.println("TopClass.func");
	}
	private static int topClassValue=100;
	//静态内部类
	
	static class NestedClass{
	
		public static  void visit(){
			//调用外部类的静态方法
			func();
			//存取外部类的静态字段
			System.out.println(topClassValue);
		}
	}
}
