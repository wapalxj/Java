package C12_Exception;

public class P276_match_exception {

	/**
	 * �쳣����˳������±������
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			throw new MyException();
//		} catch (Exception e) {
//			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}

class MyException extends Exception{
	
}
