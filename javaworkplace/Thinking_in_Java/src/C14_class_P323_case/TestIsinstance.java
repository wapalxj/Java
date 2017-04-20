package C14_class_P323_case;

public class TestIsinstance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class<Animal> a=Animal.class;
		System.out.println(a.isInstance(new Bird()));
		
		System.out.println(a.isAssignableFrom(Animal.class));
	}

}

class Animal{
	
}

class Bird extends Animal{
	
}
