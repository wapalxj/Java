package c72_Exception;

public class Test1Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1/0;//Unchecked exception-->runtime exception
//		
		/**
		 * Checked exception
		 */
//		try {
//			Thread.sleep(3000);//≥Ã–Ú‘›Õ£3√Î÷”
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		/**
		 * ø’÷∏’Î“Ï≥£
		 */
		Computer c=null;
		c.start();
		
	}

}

class Computer{
	void start(){
		System.out.println("s");
	}
}
