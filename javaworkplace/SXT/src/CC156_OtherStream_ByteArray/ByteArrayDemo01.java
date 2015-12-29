package CC156_OtherStream_ByteArray;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;



/*
 * �ֽ�����ڵ���
 */
public class ByteArrayDemo01 {

	public static void main(String[] args) throws IOException {
		read(write());

	}
	/**
	 * ���������������ļ�������һ��
	 * @throws IOException 
	 */
	public static void read(byte[] src) throws IOException {
		//����Դ��src
		//ѡ�������ֽ�����������(��������������ʹ�ö�̬)
		InputStream is =new BufferedInputStream(
				new ByteArrayInputStream(src)
		);
		//����
		byte[] flush =new byte[1024];
		int len=0;
		while (-1!=(len=is.read(flush))) {
			System.out.println(new String(flush,0,len));

		}
		//�ͷ�
		is.close();
	}
	public static byte[] write() throws IOException {
		//Ŀ�ĵ�
		byte[] dest;
		//ѡ����:�ֽ����������(����������������ʹ�ö�̬)
		ByteArrayOutputStream bos =new ByteArrayOutputStream ();
		//д��
		String msg="����";
		byte[] info=msg.getBytes();
		bos.write(info,0,info.length);
		//��ȡ
		dest=bos.toByteArray();
		bos.close();
		return dest;
	}

}
