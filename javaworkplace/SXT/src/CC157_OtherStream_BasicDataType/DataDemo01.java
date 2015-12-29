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
//		read("E:/others/data.txt");//��ȥ��ȡ
		//��ȡ��������
//		read("E:/others/datax.txt");//�ļ�δ�ҵ��쳣
//		read("E:/others/char.txt");//java.io.EOFException���Ѵﵽ�ļ�ĩβ��û�ж�ȡ���ļ����ݣ�
		read("E:/others/data.txt");
	}
	
	
	/*
	 *����+���� д���ļ�
	 */
	public static void write(String destPath) throws IOException {
		double point=2.5;
		long num=1000;
		String str="��������";
		
		//����Դ
		File dest =new File(destPath);
		//ѡ������DataOutputStream
		DataOutputStream dos =new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(dest))
		);
		//����
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		
		dos.flush();
		dos.close();
	}
	/*
	 * ���ļ��ж�ȡ����+����
	 */
	public static void read(String destPath) throws IOException {
		//����Դ
		File src =new File(destPath);
		//ѡ������DataInputStream
		DataInputStream dis =new DataInputStream(
				new BufferedInputStream(new FileInputStream(src))
		);
		//����:��ȡ��˳�������д��һ�£����ұ�����ڣ�,��һ�¿��ܻ��������
		double num1=dis.readDouble();
		long num2=dis.readLong();
		String str=dis.readUTF();
		dis.close();
		System.out.println(num1+" "+num2+" "+str);
		
	}

}
