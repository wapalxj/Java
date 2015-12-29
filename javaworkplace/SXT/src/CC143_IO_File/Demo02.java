package CC143_IO_File;

import java.io.File;



/*
 * 相对路径与绝对路径构造File
 * 1.相对路径
 * 	 File(String parent,String child)==>File("E:/others/","xp.txt");
 * 	 File(String parent,String child)==>File(new File("E:/others/"),"xp.txt");
 * 2.绝对路径
 *	 
 */
public class Demo02 {

	public static void main(String[] args) {
		String parentPath ="F:/others/";
		String name ="xp.txt";
		//相对路径
		File src =new File(parentPath,name);
		//或者
		src =new File(new File(parentPath),name);
		//输出
		System.out.println("#####相对路径######");
		System.out.println("name: "+src.getName());
		System.out.println("path: "+src.getPath());
		
		
		//绝对路径
		System.out.println("##########绝对路径#########");
		src =new File("F:/others/xp.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
		
		//没有盘符：则以user.dir构建
		System.out.println("##########没有盘符##########");
		src =new File("test.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
	}

}
