package C12_Exception;

public class P258Z_rethrow {

	/**
	 * @param args
	 * @throws SimpleException2 
	 */
	public static void main(String[] args) {
		try {
			throw new SimpleException2();
		} catch (SimpleException2 e) {
			e.printStackTrace();
			try {//rethrow
				throw e;
			} catch (SimpleException2 e1) {
				e1.printStackTrace();
			}
		}
	}

}
class SimpleException2 extends Exception{}
class InheritingException2 {
	public void f() throws SimpleException2 {
		System.out.println("InheritingException-----f()");
		throw new SimpleException2();
	}
}