package CC146_IO_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 1��������ϵ ��File���� ��Դͷ+Ŀ�ĵ�
2��ѡ����  ��  �ļ������ InputStream FileInputStream
				     �ļ������  OutputStream FileOutputStream
3��������   ����
                       byte[] car =new byte[1024]
				Int len=0;
				While(-1!=(len=������.read(flush))){
					�����.write(flush,0,len)
				}
				
				�����.flush()


4���ͷ���Դ���ر�������
 */
public class CopyFile {

	public static void main(String[] args)  {
		
		String src ="F:/others/me.jpg";
		String dest ="F:/others/newJpg.jpg";
		try {
			copyFile(src,dest);
		} catch ( FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�������");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("����ʧ�ܻ���ر���ʧ��");
		}
	}

	/*
	 * �ļ��Ŀ���
	 * Դ�ļ�·��
	 * Ŀ���ļ�·��
	 * IOException
	 */
	public static void copyFile(String srcPath,String destPath) throws FileNotFoundException,IOException {
		//1��������ϵ ��File����Դ(�������)��Ŀ��(�ļ����Բ�����)
		File src =new File(srcPath);
		File dest =new File(destPath);
		if (!src.isFile()) {
			System.out.println("ֻ�ܿ����ļ�������");
			throw new IOException("ֻ�ܿ����ļ�������");
		}
		
		//2.ѡ����:
		InputStream is =new FileInputStream(src);
		OutputStream os=new FileOutputStream(dest);
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

