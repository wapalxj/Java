package c70_fileClass;

import java.io.File;
import java.io.IOException;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("d:");
		File f2 =new File(f,"TestObject.java");
		File f3 =new File("d:/src/src/aa");
//		if (!f.isFile()) {
//			System.out.println("a file");
//		}
//		if (!f.exists()) {
//			System.out.println("a file");
//		}
		
		/**
		 * �����ļ�
		 */
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * ɾ���ļ�
		 */
		f2.delete();
		/**
		 * ����Ŀ¼
		 */
//		f3.mkdir();//��������Ŀ¼
		f3.mkdirs();//�������Ŀ¼
	}

}
