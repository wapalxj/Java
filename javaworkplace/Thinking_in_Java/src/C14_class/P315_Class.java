package C14_class;

public class P315_Class {

	/**
	 * @param args
	 * 当程序创建第一个对类的静态成员的引用时，就会加载这个类，static初始化是在加载时进行的
	 */
	public static void main(String[] args) {
//		new Vero();
		System.out.println(Vero.a);
//		System.out.println("----------");
		try {
			Class.forName("C14_class.Vero");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class Vero{
	static int a=1000;
	static int b=say(0);
	int c=say(10000000);
	static{
		System.out.println("static---Vero");
	}
	
	public static int say (int n) {
		System.out.println("Vero----say()---"+n);
		return a;
	}
}
