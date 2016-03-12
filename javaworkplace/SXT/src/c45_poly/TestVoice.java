package c45_poly;

public class TestVoice {

	public static void testVoice(Animalv c) {
		c.voice();
		if (c instanceof Cat) {//判断c上是不是Cat类的对象
			((Cat) c).catchMouse();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animalv c= new Cat();//父类引用赋值为子类对象
		Animalv d =new Dog();
		Animalv p =new Pig();
		testVoice(c);	
		testVoice(d);
		testVoice(p);
		
		Cat c2 =(Cat)c;//强制转型
		c2.catchMouse();//转换过后才能调用这个方法
		
//		Cat c3=(Cat)p;//运行出错，Pig类不能转换为Cat类
	}

}
