package C14_class;

public class P319_class {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(AAA.class==Class.forName("C14_class.AAA"));
		System.out.println(boolean.class==Boolean.TYPE);
	}

}

class AAA{
	
}