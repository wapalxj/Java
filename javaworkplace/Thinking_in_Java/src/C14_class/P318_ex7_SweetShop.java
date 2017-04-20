package C14_class;

public class P318_ex7_SweetShop {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		args=new String []{"C14_class.Candy","C14_class.Cookie"};
		for (int j = 0; j < args.length; j++) {
			Class.forName(args[j]);
		}
		
	}

}

class Candy{
	static { System.out.println("Loading Candy");}
}

class Gum{
	static { System.out.println("Loading Gum");}
}
class Cookie{
	static { System.out.println("Loading Cookie");}
}