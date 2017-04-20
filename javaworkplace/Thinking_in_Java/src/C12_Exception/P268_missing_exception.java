package C12_Exception;

public class P268_missing_exception {

	/**
	 * Òì³£¶ªÊ§
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			try {
				throw new Exception("e111111111111");
//			}catch (Exception e) {
//				e.printStackTrace();
			}finally{
				throw new Exception("e222222222222");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
