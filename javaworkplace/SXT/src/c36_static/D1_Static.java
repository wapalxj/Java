package c36_static;

//static:类变量，类方法
public class D1_Static {
	String name;
	int id;
	static int age;

	public static void main(String[] args) {
		D1_Static.age=50;
		System.out.println(D1_Static.age);
		D1_Static c1=new D1_Static();

		System.out.println(c1.age);
	}

	public static void prints() {
		System.out.println(age);
//		this.id=2;静态的方法改变对象的状态。
//		study();错误，静态的方法中不能调用非静态方法或字段
//		以上说明：static是属于类的，对象可以改变static的状态，
//		但是static不可以改变对象状态
	}

	public void sayHello(String sname) {
		prints();
		study();
		System.out.println(sname+": hello!");
	}
	
	public void study() {
		System.out.println("studying!");
	}
	

}
