package CC143_IO_File;

import java.io.File;
import java.util.Arrays;

/*
 * 输出子孙级目录或者文件的名称(绝对路径)
 * 1.listFiles()
 * 2.递归
 * 
 * static listRoots()根路径
 */
public class Demo05 {

	public static void main(String[] args) {
		String path ="F:/others/p5";
		File par =new File(path);
		Name(par);
		
//		打印所有盘符根路径
		File[] roots=File.listRoots();
		System.err.println(Arrays.toString(roots));

	}
	//输出路径
	public static void Name(File src) {
		if (null==src||!src.exists()) {
			return;
		}
		System.err.println(src.getAbsolutePath());
		if (src.isDirectory()) {
			for (File sub : src.listFiles()) {
				Name(sub);
			}
		}
	}

}



