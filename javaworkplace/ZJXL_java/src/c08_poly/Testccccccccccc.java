package c08_poly;

public class Testccccccccccc {

	public static void main(String[] args) {
		Fruit f =new Fruit();
		Apple a =new Apple();
		f=a;
		f.name++;//���౻��������ʹ�ã������ӵ��Ǹ����name
//		((Apple)f).name++;
		f.call();
		a.call();
		
		Fruit f2 =new Fruit();
		f2.call();
		
	}

}

class Fruit{
	static int name=1;
	public void call() {
		System.out.println("call me Fruit "+name);
	}
}
class Apple extends Fruit{
	int name=1;
	public void call() {
		System.out.println("call me Apple "+name);
	}

}