package CC151_IO_Char;
/**
 * ���ı��Ŀ���
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class copyFileDemo {

	public static void main(String[] args) {
		// ����Դ
		String src ="F:/others/char.txt";
		File dest =new File("F:/others/char20.txt");
		//ѡ����
		Reader reader =null;
		Writer wr=null;	
		try {
			reader=new FileReader(src);
			wr=new FileWriter(dest);//���׷��������FileWriter(dest,true)
			//��ȡ
			char [] flush =new char[10];
			int len=0;
			while (-1!=(len=reader.read(flush))) {
				wr.write(flush,0,len);
			}
			wr.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Դ�ļ������ڣ�");
		} catch (IOException e) {
			System.out.println("��ȡʧ�ܣ�");
			e.printStackTrace();
		}finally{//�ȴ򿪵ĺ�ر�
			try {
				if (null!=wr) {
					wr.close();
				}
			} catch (IOException e) {
				System.out.println("�ر�ʧ�ܣ�");
				e.printStackTrace();
			}
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
