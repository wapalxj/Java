package c72_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1ReadFile {

	/**
	 * �쳣���ԣ�
	 * ִ��˳��
	 * 1.ִ��try,catch,������ֵ��ֵ���������أ�
	 * 2.ִ��finally
	 * 3.return(returnֻ��һ��ֵ����ִ�е�return�Ḳ����ִ�е�
	 * ����finally��return "fff"�Ḳ��ǰ���return��
	 * ����finally��һ�㲻��return
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =new Test1ReadFile().openFile();
		System.out.println(str);
	}
	
	String openFile(){
		try {
			System.out.println("aaa");
			FileInputStream fis=new FileInputStream("d:/a.txt");//���򿪵��ļ����ɴ���ģ�����׳��쳣
			int a=fis.read();
			System.out.println("bbb");
			return "step1";
		} catch (FileNotFoundException e) {
			System.out.println("catching!!!!!");
//			e.printStackTrace();
			return "step2";
		}catch (IOException e) {
//			e.printStackTrace();
			return "step3";
		}finally{
			System.out.println("finally!!!");
			//return "fff";
		}
	}

}
