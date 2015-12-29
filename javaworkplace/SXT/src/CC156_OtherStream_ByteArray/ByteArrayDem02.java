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
	 * 1.�ļ�---����---�ֽ�����
	 * @param srcPath
	 * @return
	 * @throws IOException
	 */
	public static byte[] getByteFromFile(String srcPath) throws IOException {
		//�����ļ�Դ
		File src=new File(srcPath);
		//�����ֽ�����Ŀ�ĵ�
		byte[] dest =null;
		//ѡ����
		//�ļ�������
		InputStream is=new BufferedInputStream(new FileInputStream(src));
		//�ֽ����������
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		
		//����
		byte []flush =new byte[1024];
		int len;
		while (-1!=(len=is.read(flush))) {
			//д�����ֽ���������
			bos.write(flush, 0, len);
		}
		bos.flush();
		
		//��ȡ����
		dest=bos.toByteArray();
		bos.close();
		is.close();
		return dest;
	}
	/*
	 * 2.�ֽ�����---����---�ļ�
	 */
	public static void toFileFromByteArray(byte[] src,String destPath) throws IOException {
		//����Դ
		//Ŀ�ĵ�
		File dest =new File(destPath);
		
		//ѡ����
		//�ֽ�����������
		InputStream is=new BufferedInputStream(new ByteArrayInputStream(src));
		//�ļ������
		OutputStream os=new BufferedOutputStream (new FileOutputStream(dest));
		
		//����
		byte []flush =new byte[1024];
		int len;
		while (-1!=(len=is.read(flush))) {
			//д�����ļ�
			os.write(flush, 0, len);
		}
		os.flush();
		
		//�ͷ���Դ
		os.close();
		is.close();
	}

}
