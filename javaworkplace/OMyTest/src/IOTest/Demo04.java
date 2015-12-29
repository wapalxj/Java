package IOTest;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 5.操作目录：
	mkdir() //创建目录:必须确保父目录存在，如果不存在，创建失败
	mkdirs()//创建目录，如果父目录链不存在，则一同创建
	list()//文件：目录字符串形式(目录中包含的子文件、目录)
	listFires()//
	static listRoots()//

 */
public class Demo04 {

	public static void main(String[] args) {
//		String path ="E:/others/p/p1";//用于src.mkdir();
//		String path ="E:/others/p1/p2/p3/test";//用于src.mkdirs();
		String path ="E:/others/p3";//用于src.list()
		File src =new File(path);
//		src.mkdir();//创建目录:必须确保父目录存在，如果不存在，创建失败
//		src.mkdirs();
		
		if (src.isDirectory()) {
			System.out.println("====子目录文件名======");
			String [] subNames=src.list();
			for (String temp : subNames) {
				System.out.println(temp);
			}
			
			System.out.println("====子目录File对象======");
			File[]  subFiles =src.listFiles();
			for (File temp : subFiles) {
				System.out.println(temp);
			}
			
			System.out.println("====子文件.java对象======");
			//命令设计模式
			subFiles =src.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					/*
					 * dir 就代表src
					 */
//					System.out.println(dir.getAbsolutePath());
					//必须是文件（不能是文件夹）且后缀为.java
					return new File(dir,name).isFile()&&name.endsWith(".java");
				}
			});
			for (File temp : subFiles) {
				System.out.println(temp.getAbsolutePath());
			}
		}
	}

}
