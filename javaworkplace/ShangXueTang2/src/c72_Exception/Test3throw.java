package c72_Exception;

import java.io.File;
import java.io.FileNotFoundException;

public class Test3throw {

	/**
	 * 异常3：throw:手动抛出异常(很少使用，了结即可)
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
