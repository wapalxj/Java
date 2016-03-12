package c38_inher;

public class Bird extends Animal{

	public void run()
	{
		super.run();//也可以调用父类的run
		System.out.println("飞呀飞");//重写
	}
	
	public void eggSheng()
	{
		System.out.println("我是卵生");
	}
}
