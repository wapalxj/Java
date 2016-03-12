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
//			Thread.sleep(3000);//程序暂停3秒钟
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		/**
		 * 空指针异常
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
