package Test;

public class Static {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Child().name();
	}

}


class Parent{
	public static void name() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	public static void name() {
		System.out.println("Child");
	}
}