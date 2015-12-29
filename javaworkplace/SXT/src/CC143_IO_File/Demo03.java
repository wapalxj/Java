package CC143_IO_File;

import java.io.File;
import java.io.IOException;

/*
 *
 * 
常用方法
1.文件名
	getName()文件名、路径名
	getPath()路径名
	getAbsoluteFile()绝对路径所对应的File对象
	getAbsolutePath()绝对路名
	getParent()父目录，相对路径的父目录，可能为NULL
2.判断信息
    Exists()
	canWrite()
	isFile()
	isDirectory()
    isAbsolute()
3.长度:长度（字节数,只能读取文件的长度，不能读取文件夹，文件夹长度读取为0）
    length()
4.创建，删除
	createNewFile()
	delete()
	static createTempFile()
	deleteOnExis()
	
 */
public class Demo03 {

	public static void main(String[] args) {
		System.out.println("######test0#########");
		File src =new File("F:/oo");//文件不存在就无法判断是不是文件夹
		System.out.println(src.isDirectory());
		System.out.println("######test1#########");
		test1();
		System.out.println("######test2#########");
		test2();
		
		System.out.println("######test3#########");
		try {
			test3();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("文件创建失败");
		}

	}
//1.	
	public static void test1() {
//		File src =new File("F:/others/xp.txt");
		File src =new File("test.txt");
		System.out.println(src.getName());//返回名称
		System.out.println(src.getPath());//如果是绝对路径，返回完整路径，否咋返回相对路径
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getParent());//返回上级目录，如果是相对，则返回NULL
	}
//2.
	public static void test2() {
//		String path ="test.txt";
		String path ="F:/others/xp.txt";
		File src =new File(path);
		//是否存在
		System.out.println("是否存在:"+src.exists());
		//是否可写
		System.out.println("是否可写:"+src.canWrite());
		//isFile()isDirectory()
		if (src.isFile()) {
			System.out.println("是文件");
		}else if (src.isDirectory()) {
			System.out.println("是文件夹");
		}else{
			System.out.println("不存在");
		}
		//是否绝对路径(绝对路径以盘符开头如：E:)
		System.out.println("是否绝对路径:"+src.isAbsolute());
		//3.长度（字节数,只能读取文件的长度，不能读取文件夹，文件夹长度读取为0）
		System.out.println("长度为"+src.length());
		
	}
//4.创建删除文件
	public static void test3() throws IOException, InterruptedException {
		String path ="F:/others/com10.txt";
		File src =new File(path);
		//创建
		boolean flag =src.createNewFile();
		System.out.println(flag?"创建成功":"创建失败");
		//删除
		flag =src.delete();
		System.out.println(flag?"删除成功":"删除失败");
		
		
		//static createTempFile()
		File temp=File.createTempFile("tes", ".temp",new File("F:/others"));
		Thread.sleep(1000);
		temp.deleteOnExit();//1秒钟之后删除
		
		
	}

}
