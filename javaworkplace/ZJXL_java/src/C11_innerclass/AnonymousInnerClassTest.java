package C11_innerclass;


public class AnonymousInnerClassTest {
	public static void main(String[] args) {
		AnonymousInnerClassTest obj=new AnonymousInnerClassTest();
		//使用匿名内部类语法创建MyInterface接口对象
		obj.ShowAnonymousInnerClassUsage(new MyInterface(){
			@Override
			public void func() {
				System.out.println("匿名内部类的方法执行");
			
			}
		
		});
		//匿名内部类访问外部类的字段
		obj.InnerVisitOuterField();
		

	}
	
	public int outerField=100;
	public void ShowAnonymousInnerClassUsage(MyInterface obj){
		obj.func();
	}
	
	/**
	 * 演示匿名内部类访问外部类的字段
	 */
	public void InnerVisitOuterField(){
		MyInterface mi=new MyInterface(){

			@Override
			public void func() {
				//访问外部类的字段
				AnonymousInnerClassTest.this.outerField++;
				System.out.println(outerField);
			}
			
		};
		mi.func();
	}

}

interface MyInterface{
	void func();
}


