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
	 *����+���� ������ֽ�������
	 */
	public static byte[] write() throws IOException {
		//Ŀ������
		byte[] dest =null;
		double point=2.5;
		long num=1000;
		String str="��������";
		//ѡ������DataOutputStream
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		DataOutputStream dos =new DataOutputStream(
				new BufferedOutputStream(bos)
		);
		//����
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		
		dos.flush();
		
		dest=bos.toByteArray();
		
		dos.close();
		return dest;
	}
	/*
	 * ���ֽ������ж�ȡ����+����
	 */
	public static void read(byte[] src) throws IOException {
		//ѡ������DataInputStream
		DataInputStream dis =new DataInputStream(
				new BufferedInputStream(new ByteArrayInputStream(src))
		);
		//����:��ȡ��˳�������д��һ�£����ұ�����ڣ�,��һ�¿��ܻ��������
		double num1=dis.readDouble();
		long num2=dis.readLong();
		String str=dis.readUTF();
		
		dis.close();
		System.out.println(num1+" "+num2+" "+str);
		
	}

}
