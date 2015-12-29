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
 * �ļ�����
 * 1.����:������Դ�ļ�·����Ŀ���ļ�·��
 */
public class FileUtil {
	public static void copyFile(String srcPath,String destPath) throws FileNotFoundException,IOException {
		//1��������ϵ ��File����Դ(�������)��Ŀ��(�ļ����Բ�����)
		File src =new File(srcPath);
		File dest =new File(destPath);
		copyFile(src,dest);
	}
	/*
	 * �ļ�����
	 * ������Դ�ļ���File����Ŀ���ļ���File����
	 */
	public static void copyFile(File src,File dest) throws FileNotFoundException,IOException {
		
		if (!src.isFile()) {
			System.out.println("ֻ�ܿ����ļ�������");
			throw new IOException();
		}
		//���destΪ�Ѿ����ڵ��ļ��У����ܽ������ļ���ͬ�����ļ���
//		if (dest.isDirectory()) {
//			System.out.println("���ܽ������ļ���ͬ�����ļ�������");
//			throw new IOException("���ܽ������ļ���ͬ�����ļ�������");
//		}
		//��Դ�ļ�������Ŀ���ļ�����,���dest��������ʧ��
		
		if (dest.isDirectory()) {
			dest =new File(dest,src.getName());
		}
		
		//2.ѡ����:
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
