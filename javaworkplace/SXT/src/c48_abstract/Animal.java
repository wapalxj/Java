package c48_abstract;

public abstract class Animal {

	public abstract void run();
//	public abstract void catchS();//�������ʵ�����г�����ĳ��󷽷�
	
	public void breathe() {
		System.out.println("����");

	}
}


 class Cat extends Animal {
	@Override
	public void run() {
		System.out.println("è��С��");
	}
	public void eat() {
		System.out.println("ץ����");
	}
}
class Dog extends Animal {
	@Override
	public void run() {
		System.out.println("����");
	}
}