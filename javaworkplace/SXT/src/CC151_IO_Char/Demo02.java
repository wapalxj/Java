package CC151_IO_Char;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import jdk.jfr.events.FileWriteEvent;

/**
 * д���ļ�
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		// ����Դ
		File dest =new File("E:/others/char.txt");
		//ѡ����
		Writer wr=null;
		try {
			wr=new FileWriter(dest);//���׷��������FileWriter(dest,true)
			//д��
			String msg="JAVA\r\n����ý�弼��\r\nHTML5";
			wr.write(msg);
			wr.append("׷��һ����β");
			wr.flush();
		} catch (FileNotFoundException e) {
			System.out.println("Դ�ļ������ڣ�");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("д��ʧ�ܣ�");
			e.printStackTrace();
		}finally{
			try {
				wr.close();
			} catch (IOException e) {
				System.out.println("�ر�ʧ�ܣ�");
				e.printStackTrace();
			}
		}

	}

}
