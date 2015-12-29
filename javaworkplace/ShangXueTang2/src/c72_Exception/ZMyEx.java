package c72_Exception;
/**
 * 现有的继承类不满足的时候，可自定义继承类
 * @param args
 */
public class ZMyEx extends 	Exception {
	public ZMyEx() {
		
	}
	
	public ZMyEx(String message) {
		super(message);
	}

}

class TestMyX{
	void test()throws ZMyEx{
		
	}
	
	public static void main(String[] args) {
		try {
			new TestMyX().test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
