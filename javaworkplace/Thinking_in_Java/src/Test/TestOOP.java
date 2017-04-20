package Test;


public class TestOOP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Ch();
	}

}

class Pa{
	public Pa() {
	}
	
	protected void onCreate(String bundle){
		System.out.println("Test.Pa---onCreate");
	}
}


class Ch extends Pa{ 
	
	public Ch() {
		onCreate("vnix");
	}
//	@Override
//	protected void onCreate(String bundle) {
//		//super.onActivityCreate(bundle);
//		System.out.println("Test.Ch---onCreate");
//	}
}