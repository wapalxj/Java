package c45_poly;

public class Animalv {
	public void voice () {
		System.out.println("��ͨ����Ľ���");
	}
	
}

class Cat extends Animalv{
	public void voice () {
		System.out.println("����");
	}
	public void catchMouse () {
		System.out.println("ץ����");
	}
}

class Dog extends Animalv{
	public void voice () {
		System.out.println("������");
	}
	public void careDoor () {
		System.out.println("���ţ�");
	}
}
class Pig extends Animalv{
	public void voice () {
		System.out.println("�ߺߺ�");
	}
}