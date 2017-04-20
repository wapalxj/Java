package C12_Exception;

public class P276_match_exception {

	/**
	 * 异常捕获顺序出错导致编译出错
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
