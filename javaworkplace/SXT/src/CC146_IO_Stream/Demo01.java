package CC146_IO_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import jdk.internal.org.xml.sax.InputSource;

/*һ����ȡ�ļ�
 * 1��������ϵ ��File����
2��ѡ����  ��  �ļ������� InputStream FilenputStream
3������   �����С+read\write
4���ͷ���Դ���ر�

 */
public class Demo01 {

	public static void main(String[] args) {
		//1��������ϵ ��File����:Դͷ
		File src =new File("F:/others/xp.txt");
		//2��ѡ����:�ļ������� 
		InputStream is=null;
		try {
			is =new FileInputStream(src);
			//3������ :���϶�ȡ:ÿ�ζ�10���ֽڣ���������
			byte[] car =new byte[10];
			int len=0;//����ʵ�ʶ�ȡ��С
			//ѭ����ȡ
			try {
				while (-1!=(len=is.read(car))) {
					//��������ֽ�����ת��Ϊ�ַ���
//					System.err.println("car: "+car.toString());
					String info=new String(car,0,len);
					System.err.println(info);
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("�ļ�������");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("��ȡ�ļ�ʧ��");
		}finally{
			//4.�ͷ�
			if (null!=is) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("�ر��ļ�������ʧ��");
				}
				
			}
		}
	}

}
