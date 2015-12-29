package CC146_IO_Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
 * 文件操作
 * 1.拷贝:参数：源文件路径，目标文件路径
 */
public class FileUtil {
	public static void copyFile(String srcPath,String destPath) throws FileNotFoundException,IOException {
		//1、建立联系 ：File对象：源(必须存在)和目的(文件可以不存在)
		File src =new File(srcPath);
		File dest =new File(destPath);
		copyFile(src,dest);
	}
	/*
	 * 文件操作
	 * 拷贝：源文件的File对象，目标文件的File对象
	 */
	public static void copyFile(File src,File dest) throws FileNotFoundException,IOException {
		
		if (!src.isFile()) {
			System.out.println("只能拷贝文件！！！");
			throw new IOException();
		}
		//如果dest为已经存在的文件夹（不能建立与文件夹同名的文件）
//		if (dest.isDirectory()) {
//			System.out.println("不能建立与文件夹同名的文件！！！");
//			throw new IOException("不能建立与文件夹同名的文件！！！");
//		}
		//将源文件拷贝到目标文件夹中,如果dest不存在则失败
		
		if (dest.isDirectory()) {
			dest =new File(dest,src.getName());
		}
		
		//2.选择流:
		InputStream is =new BufferedInputStream(new FileInputStream(src));
		OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
		//3.文件拷贝:循环：读取+写出
		byte[] flush =new byte[1024];
		int len =0;
		//读取
		while (-1!=(len=is.read(flush))) {
			//写出
			os.write(flush, 0, len);
		}
		os.flush();//强制刷出
		
		//关闭流（规则：先打开的后关闭）
		os.close();
		is.close();
	}

}
