package c72_Exception;
/**
 * ���еļ̳��಻�����ʱ�򣬿��Զ���̳���
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
