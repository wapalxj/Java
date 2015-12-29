package CC152_IO_buffered;
/*
 *�ַ�������+�������������ܷ�����̬��
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class bufCharDemo {

	public static void main(String[] args) {
		// ����Դ
		String src ="E:/others/char.txt";
		File dest =new File("E:/others/char3.txt");
		//ѡ����
		//ʹ�������������ܷ�����̨���Դ��в���д�ɣ�Reader reader =null;Writer wr=null;
		BufferedReader reader =null;
		BufferedWriter wr=null;	
		try {
			reader=new BufferedReader(new FileReader(src));
			wr=new BufferedWriter(new FileWriter(dest));//���׷��������FileWriter(dest,true)
			//��ȡ
//			
//			char [] flush =new char[1024];
//			int len=0;
//			while (-1!=(len=reader.read(flush))) {
//				wr.write(flush,0,len);
//			}
			//���ж�ȡ:�����ķ���
			String line =null;
			while (null!=(line=reader.readLine())) {
				wr.write(line);
				wr.newLine();//����
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
