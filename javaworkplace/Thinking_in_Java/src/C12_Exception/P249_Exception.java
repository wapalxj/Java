package C12_Exception;

public class P249_Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			throw new NullPointerException("xxxxxxxxxxxxxxx");
//			System.out.print("----------------");//unResearchable
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			int c=1/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//上面的异常被捕获，继续执行下面的程序，不被捕获则终止
		int a=100;
		int b=10;
		System.out.print(a/b);
	}

}
