package C06_inher;
/*
 * �ӿڣ�Ѽ������
 */
public class Bird {

	public void run() {
		System.out.println("�ɷɷɷ�");
	}
	
	public static void main(String[] args) {
		Duck d =new Duck();
		d.run();
		d.swim();
		d.cook();

	}

}

class Duck extends Bird implements ISwim,IFood{
	
	public void swim() {
		System.out.println("����������");
	}
	public void cook() {
		System.out.println("��Ѽ");
	}
}

interface ISwim{
	public abstract void swim();
}
interface IFood{
	public abstract void cook();
}