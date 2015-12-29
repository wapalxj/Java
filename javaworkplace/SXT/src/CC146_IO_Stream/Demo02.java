package CC146_IO_Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * ����д���ļ�
1��������ϵ ��File���� ��Ŀ�ĵ�
2��ѡ����  ��  �ļ������ OutputStream FileOutputStream
3������   write+flush

4���ͷ���Դ���ر�
 */
public class Demo02 {

	public static void main(String[] args) {
		//1��������ϵ ��File����Ŀ�ĵ�
		File dest =new File("F:/others/xp1.txt");
		//2.ѡ����:�ļ������
		OutputStream os =null;
		//��׷����ʽ д���ļ�:true,�������Ǹ���(��д������false)
		try {
			os=new FileOutputStream(dest,true);
			//3.����
			String str="veroVnix\r\n";
			//�ַ���ת�ֽ�����
			byte[] data= str.getBytes();
			os.write(data,0, data.length);
			
			os.flush();//ǿ��ˢ�³�ȥ
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("�ļ�δ�ҵ�");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("�ļ�д��ʧ��");
		} finally{
			//4.�ͷ���Դ
			if (null!=os) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("�ر������ʧ��");
				}
			}
		}
	}

}
