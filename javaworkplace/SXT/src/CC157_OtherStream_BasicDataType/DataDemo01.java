package CC157_OtherStream_BasicDataType;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 */
public class DataDemo01 {

	public static void main(String[] args) throws IOException {
//		write("E:/others/data.txt");
//		read("E:/others/data.txt");//读去争取
		//读取错误的情况
//		read("E:/others/datax.txt");//文件未找到异常
//		read("E:/others/char.txt");//java.io.EOFException：已达到文件末尾（没有读取到文件内容）
		read("E:/others/data.txt");
	}
	
	
	/*
	 *数据+类型 写到文件
	 */
	public static void write(String destPath) throws IOException {
		double point=2.5;
		long num=1000;
		String str="数据类型";
		
		//创建源
		File dest =new File(destPath);
		//选择流：DataOutputStream
		DataOutputStream dos =new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(dest))
		);
		//操作
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		
		dos.flush();
		dos.close();
	}
	/*
	 * 从文件中读取数据+类型
	 */
	public static void read(String destPath) throws IOException {
		//创建源
		File src =new File(destPath);
		//选择流：DataInputStream
		DataInputStream dis =new DataInputStream(
				new BufferedInputStream(new FileInputStream(src))
		);
		//操作:读取的顺序必须与写出一致（并且必须存在）,不一致可能会出现问题
		double num1=dis.readDouble();
		long num2=dis.readLong();
		String str=dis.readUTF();
		dis.close();
		System.out.println(num1+" "+num2+" "+str);
		
	}

}
