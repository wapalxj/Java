package c08_poly;
class Mammal{}
class Dog extends Mammal{}
class Cat extends Mammal{}
public class TestCast {

	public static void main(String[] args) {
		Mammal m;
		Dog d=new Dog();
		Cat c=new Cat();
		m=d;
		//d=m;
		d=(Dog)m;
		//d=c;
		//c=(Cat)m;//因为上面已经m=d了，所以运行出错


	}

}
