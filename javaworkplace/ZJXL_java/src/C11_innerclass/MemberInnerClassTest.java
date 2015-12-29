package C11_innerclass;


public class MemberInnerClassTest {
	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		outer.testInnerClass();
		
//		InnerClass 不为private时
//		OuterClass.InnerClass a =new OuterClass().new InnerClass();
//		a.visit();
	}
}

class OuterClass{
	private int outerValue=100;
	private void printValue(){
		System.out.println(outerValue);
		
	}
	private static void outerStaticMethod(String info){
		System.out.println(info);
	}
	
	public void testInnerClass(){
		//外部类可以访问内部类的私有成员
		innerObject.innerClassField++;
		innerObject.innerClassMethod();
		innerObject.visit();

	}
	
	private InnerClass innerObject=new InnerClass();
	/**
	 * 成员内部类
	 * @author JinXuLiang
	 *
	 */
	private class InnerClass{
		private int innerClassField=200;
		int a=100;
		public void visit(){
			outerValue=200;  //访问外部类的私有字段
			printValue();//调用外部类的私有实例方法
			//调用外部类的私有静态方法
			outerStaticMethod("From InnerClass Object");
		}
		private void innerClassMethod(){
			System.out.println("InnerClass.innerClassMethod");
		}
	}
}
