package CC151_IO_Char;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * ���ı���ȡ
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		// ���� Դ
		String src ="E:/others/char.txt";
		//ѡ����
		Reader reader =null;
		try {
			reader=new FileReader(src);
			//��ȡ
			char [] flush =new char[10];
			int len=0;
			while (-1!=(len=reader.read(flush))) {
				String str=new String(flush,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Դ�ļ������ڣ�");
		} catch (IOException e) {
			System.out.println("��ȡʧ�ܣ�");
			e.printStackTrace();
		}finally{
			if (null!=reader) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("�ر�ʧ�ܣ�");
					e.printStackTrace();
				}
			}
		}
		

	}

}
