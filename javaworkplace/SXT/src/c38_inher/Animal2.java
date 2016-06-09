package c38_inher;

import c37.This;

//测试组合
public class Animal2 {
	private String eyes="eyes";
	
	
	public void run()
	{
		System.out.println("跑呀跑");
	}
	public void eat()
	{
		System.out.println("吃吃！");
	}
	public void sleep()
	{
		System.out.println("zzzzz");
	}
	public void getEyes() {
		System.out.println("I have "+this.eyes);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird2 b2 =new Bird2();
		b2.run();
		b2.animal2.eat();
		b2.getEyes();
	}

}
 class Bird2 extends Animal2{
	 Animal2 animal2=new Animal2();
	 
	public Bird2 () {
		
	} 
	public void getEyes() {
		super.getEyes();
	}
	public void run()
	{
		animal2.run();//也可以调用父类的run
		System.out.println("飞呀飞");//重写
	}
	
	public void eggSheng()
	{
		System.out.println("我是卵生");
	}
}