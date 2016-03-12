package c72_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test1Exception2 {

	/**
	 * 异常的测试：1.异常捕获try/catch
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader=null;
		try {
			reader =new FileReader("d:/a.txt");//(FileNotFoundException异常
			char c=(char)reader.read();//抛出了IO异常
			char c2=(char)reader.read();
			System.out.println(""+c+c2);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {//IOException是FileNotFoundException的父类，所以放下面
			
			e.printStackTrace();
		}finally{
			try {
				if (reader!=null) {
					reader.close();	
				}	
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}

}
