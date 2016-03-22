package c45_poly;

public class Animalv {
	public void voice () {
		System.out.println("普通动物的叫声");
	}

}

class Cat extends Animalv{
	public void voice () {
		System.out.println("喵喵");
	}
	public void catchMouse () {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animalv{
	public void voice () {
		System.out.println("汪汪汪");
	}
	public void careDoor () {
		System.out.println("看门！");
	}
}
class Pig extends Animalv{
	public void voice () {
		System.out.println("哼哼哼");
	}
}