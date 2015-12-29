package CC157_OtherStream_BasicDataType;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
public class DataDemo02 {

	public static void main(String[] args) throws IOException {
		byte[] data=write();
		read(data);
		System.out.println(data.length);
	}
	
	
	/*
	 *数据+类型 输出到字节数组中
	 */
	public static byte[] write() throws IOException {
		//目标数组
		byte[] dest =null;
		double point=2.5;
		long num=1000;
		String str="数据类型";
		//选择流：DataOutputStream
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		DataOutputStream dos =new DataOutputStream(
				new BufferedOutputStream(bos)
		);
		//操作
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		
		dos.flush();
		
		dest=bos.toByteArray();
		
		dos.close();
		return dest;
	}
	/*
	 * 从字节数组中读取数据+类型
	 */
	public static void read(byte[] src) throws IOException {
		//选择流：DataInputStream
		DataInputStream dis =new DataInputStream(
				new BufferedInputStream(new ByteArrayInputStream(src))
		);
		//操作:读取的顺序必须与写出一致（并且必须存在）,不一致可能会出现问题
		double num1=dis.readDouble();
		long num2=dis.readLong();
		String str=dis.readUTF();
		
		dis.close();
		System.out.println(num1+" "+num2+" "+str);
		
	}

}
