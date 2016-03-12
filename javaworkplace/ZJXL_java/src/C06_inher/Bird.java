package C06_inher;
/*
 * 接口：鸭子问题
 */
public class Bird {

	public void run() {
		System.out.println("飞飞飞飞");
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
		System.out.println("游游游游游");
	}
	public void cook() {
		System.out.println("烤鸭");
	}
}

interface ISwim{
	public abstract void swim();
}
interface IFood{
	public abstract void cook();
}