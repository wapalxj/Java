package C14_class;

import java.util.Random;

public class P319_ClassInitialization {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		
		ClassInitialization.main(args);
	}

}

class Initable{
	static final int staticFinal=47;
	static final int staticFinal2=ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Initable");
	}
}

class Initable2{
	static int staticNonFinal=147;
	static {
		System.out.println("Initializing Initable2");
	}
}

class Initable3{
	static int staticNonFinal=74;
	static {
		System.out.println("Initializing Initable3");
	}
}

class ClassInitialization{
	public static Random rand =new Random(47);
	public static void main(String[] args) throws ClassNotFoundException {
		Class initable=Initable.class;
		System.out.println("After creating Initable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticNonFinal);
		Class initable3=Class.forName("C14_class.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}
}