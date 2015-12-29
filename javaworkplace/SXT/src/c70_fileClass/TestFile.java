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
		 * 创建文件
		 */
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * 删除文件
		 */
		f2.delete();
		/**
		 * 创建目录
		 */
//		f3.mkdir();//创建单层目录
		f3.mkdirs();//创建多层目录
	}

}
