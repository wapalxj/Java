package c72_Exception;

import java.io.File;
import java.io.FileNotFoundException;

public class Test3throw {

	/**
	 * �쳣3��throw:�ֶ��׳��쳣(����ʹ�ã��˽ἴ��)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/tt.txt");
		if (!f.exists()) {
			try {
				throw new FileNotFoundException("File can not be found!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
