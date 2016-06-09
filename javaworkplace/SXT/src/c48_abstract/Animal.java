package c48_abstract;

public abstract class Animal {

	public abstract void run();
//	public abstract void catchS();//子类必须实现所有抽象父类的抽象方法
	
	public void breathe() {
		System.out.println("呼吸");

	}
}


 class Cat extends Animal {
	@Override
	public void run() {
		System.out.println("猫步小跑");
	}
	public void eat() {
		System.out.println("抓老鼠！");
	}
}
class Dog extends Animal {
	@Override
	public void run() {
		System.out.println("狗跑");
	}
}