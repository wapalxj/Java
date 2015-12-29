package c43_final;

public class Animal {

	public /*final*/ void run()//不可以被重写
	{
		System.out.println("跑呀跑");
	}
	
}
 class Bird extends Animal{

	public void run()
	{
		super.run();//也可以调用父类的run
		System.out.println("飞呀飞");//重写
	}
	
	
}