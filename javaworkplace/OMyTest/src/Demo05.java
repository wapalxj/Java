

import java.io.File;
import java.util.Arrays;

/*
 * 
 * 
 * 2.递归查找某个盘符下的.java文件
 * 
 * 
 */
public class Demo05 {

	public static void main(String[] args) {
		String path ="E:/";
		File par =new File(path);
		Name(par);


	}
	//输出路径
	public static void Name(File src) {
		if (null==src||!src.exists()) {
			return;
		}
		if (src.getName().endsWith(".java")) {
			System.err.println(src.getName());
		}
//		System.err.println(src.getAbsolutePath());
		if (src.isDirectory()) {
			for (File sub : src.listFiles()) {
				Name(sub);
			}
		}
	}

}



