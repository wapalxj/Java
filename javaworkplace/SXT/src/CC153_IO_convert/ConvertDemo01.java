package CC153_IO_convert;

import java.io.UnsupportedEncodingException;

public class ConvertDemo01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		test1();
		String str="�й�";
		byte[] data=str.getBytes();
		//����2���ֽ���������
		System.out.println("�ֽ������������й���"+new String(data,0,3));
		
	}
	/*
	 * ����1.����������ַ���������ͬ����������
	 */
	public static void test1()  throws UnsupportedEncodingException{
		//����byte-->char
		String str="�й�";
		//����char-->byte
		byte[] data=str.getBytes();
		System.out.println("Ĭ�ϵ�ƽ̨����������й���"+new String(data));
		
		//�趨�����ַ���
		data =str.getBytes("utf-8");
		//��������ַ�����ͳһ���������
		System.out.println("utf-8������й���Ĭ�Ͻ�����й��� "+new String(data));
		
		System.out.println("****UTF-8******");
		//����
		byte[] data2="�й�".getBytes("utf-8");
		//����
		str=new String(data2,"utf-8");
//				str=new String(data2);//���ƶ������ʽ�����ҵ�
		System.out.println("��utf-8����ͽ�����й��� "+new String(str));
		
	}
}
