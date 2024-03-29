package C11_innerclass;


public class LocalInnerClassTest {
	public static void main(String[] args) {
		TestLocalInnerClass();
	}
	//一个使用了本地内部类的静态方法
	private static void TestLocalInnerClass(){
		 // 定义于方法体内部的内部类
		class MyLocalInnerClass{
			private int field=100;
			private void printValue(){
				System.out.println(field);
			}
		};    //注意要加入一个分号
		//本地内部类要实例化之后才能使用
		MyLocalInnerClass localObj=new MyLocalInnerClass();
		localObj.printValue();
	}
}
