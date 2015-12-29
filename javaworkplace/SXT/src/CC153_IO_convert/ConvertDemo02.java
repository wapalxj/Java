package CC153_IO_convert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * ת�������ֽ�ת�ַ�
 * 1.�������OutputStreamWriter:����
 * 2.�������InputStreamReader������
 */
public class ConvertDemo02 {

	public static void main(String[] args) throws IOException {
		//�ڲ�ʹ���ֽ���InputStreamReaderָ�������ַ�����Դ�ļ��Ѿ�����ΪUTF-8��
		BufferedReader br=new BufferedReader(
				new InputStreamReader(//�˴���Ϊת����
				//��GBK��ȡ		
//				new FileInputStream(new File("E:/others/char.txt")),"GBK")
				//��UTF-8��ȡ
						new FileInputStream(new File("E:/others/char.txt")),"UTF-8")
		);
		//д��
//		BufferedWriter bw=new BufferedWriter(new FileWriter("E:/others/char4.txt"));
		BufferedWriter bw=new BufferedWriter(
				new OutputStreamWriter(
						
						new FileOutputStream(new File("E:/others/char4.txt")),"GBK")
				
				
		);
		String info=null;
		while (null!=(info=br.readLine())) {
			System.out.println(info);
			bw.write(info,0,info.length());
			bw.newLine();//����
		}

		bw.flush();
		bw.close();
		br.close();
		
	}

}
