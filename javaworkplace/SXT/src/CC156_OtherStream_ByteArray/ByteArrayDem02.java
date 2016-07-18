package CC156_OtherStream_ByteArray;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;



/*
 * 
 */
public class ByteArrayDem02 {

	public static void main(String[] args) throws IOException {
//		byte[] data=getByteFromFile("E:/others/a.txt");
//		toFileFromByteArray(data, "E:/others/ac.txt");
		byte[] data=getByteFromFile("E:/others/1.PNG");
		toFileFromByteArray(data, "E:/others/1c.PNG");
	}
	/**
	 * 1.文件---程序---字节数组
	 * @param srcPath
	 * @return
	 * @throws IOException
	 */
	public static byte[] getByteFromFile(String srcPath) throws IOException {
		//创建文件源
		File src=new File(srcPath);
		//创建字节数组目的地
		byte[] dest =null;
		//选择流
		//文件输入流
		InputStream is=new BufferedInputStream(new FileInputStream(src));
		//字节数组输出流
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		
		//操作
		byte []flush =new byte[1024];
		int len;
		while (-1!=(len=is.read(flush))) {
			//写出到字节数组流中
			bos.write(flush, 0, len);
		}
		bos.flush();
		
		//获取数据
		dest=bos.toByteArray();
		bos.close();
		is.close();
		return dest;
	}
	/*
	 * 2.字节数组---程序---文件
	 */
	public static void toFileFromByteArray(byte[] src,String destPath) throws IOException {
		//创建源
		//目的地
		File dest =new File(destPath);
		
		//选择流
		//字节数组输入流
		InputStream is=new BufferedInputStream(new ByteArrayInputStream(src));
		//文件输出流
		OutputStream os=new BufferedOutputStream (new FileOutputStream(dest));
		
		//操作
		byte []flush =new byte[1024];
		int len;
		while (-1!=(len=is.read(flush))) {
			//写出到文件
			os.write(flush, 0, len);
		}
		os.flush();
		
		//释放资源
		os.close();
		is.close();
	}

}
