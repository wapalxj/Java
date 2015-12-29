package CC152_IO_buffered;

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
 * �ֽ����ļ�����+���������������
 * �����������ڵ�����new BufferedInputStream(new FileInputStream(src));
 */
public class bufByteDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void copyFile(String srcPath,String destPath) throws FileNotFoundException,IOException {
		//1��������ϵ ��File����Դ(�������)��Ŀ��(�ļ����Բ�����)
		File src =new File(srcPath);
		File dest =new File(destPath);
		if (!src.isFile()) {
			System.out.println("ֻ�ܿ����ļ�������");
			throw new IOException();
		}
		
		//2.ѡ��������������:
		InputStream is =new BufferedInputStream(new FileInputStream(src));
		OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
		//3.�ļ�����:ѭ������ȡ+д��
		byte[] flush =new byte[1024];
		int len =0;
		//��ȡ
		while (-1!=(len=is.read(flush))) {
			//д��
			os.write(flush, 0, len);
		}
		os.flush();//ǿ��ˢ��
		
		//�ر����������ȴ򿪵ĺ�رգ�
		os.close();
		is.close();
	}
}
