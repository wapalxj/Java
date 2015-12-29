package CC143_IO_File;

import java.io.File;
import java.io.IOException;

/*
 *
 * 
���÷���
1.�ļ���
	getName()�ļ�����·����
	getPath()·����
	getAbsoluteFile()����·������Ӧ��File����
	getAbsolutePath()����·��
	getParent()��Ŀ¼�����·���ĸ�Ŀ¼������ΪNULL
2.�ж���Ϣ
    Exists()
	canWrite()
	isFile()
	isDirectory()
    isAbsolute()
3.����:���ȣ��ֽ���,ֻ�ܶ�ȡ�ļ��ĳ��ȣ����ܶ�ȡ�ļ��У��ļ��г��ȶ�ȡΪ0��
    length()
4.������ɾ��
	createNewFile()
	delete()
	static createTempFile()
	deleteOnExis()
	
 */
public class Demo03 {

	public static void main(String[] args) {
		System.out.println("######test0#########");
		File src =new File("F:/oo");//�ļ������ھ��޷��ж��ǲ����ļ���
		System.out.println(src.isDirectory());
		System.out.println("######test1#########");
		test1();
		System.out.println("######test2#########");
		test2();
		
		System.out.println("######test3#########");
		try {
			test3();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ļ�����ʧ��");
		}

	}
//1.	
	public static void test1() {
//		File src =new File("F:/others/xp.txt");
		File src =new File("test.txt");
		System.out.println(src.getName());//��������
		System.out.println(src.getPath());//����Ǿ���·������������·������զ�������·��
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getParent());//�����ϼ�Ŀ¼���������ԣ��򷵻�NULL
	}
//2.
	public static void test2() {
//		String path ="test.txt";
		String path ="F:/others/xp.txt";
		File src =new File(path);
		//�Ƿ����
		System.out.println("�Ƿ����:"+src.exists());
		//�Ƿ��д
		System.out.println("�Ƿ��д:"+src.canWrite());
		//isFile()isDirectory()
		if (src.isFile()) {
			System.out.println("���ļ�");
		}else if (src.isDirectory()) {
			System.out.println("���ļ���");
		}else{
			System.out.println("������");
		}
		//�Ƿ����·��(����·�����̷���ͷ�磺E:)
		System.out.println("�Ƿ����·��:"+src.isAbsolute());
		//3.���ȣ��ֽ���,ֻ�ܶ�ȡ�ļ��ĳ��ȣ����ܶ�ȡ�ļ��У��ļ��г��ȶ�ȡΪ0��
		System.out.println("����Ϊ"+src.length());
		
	}
//4.����ɾ���ļ�
	public static void test3() throws IOException, InterruptedException {
		String path ="F:/others/com10.txt";
		File src =new File(path);
		//����
		boolean flag =src.createNewFile();
		System.out.println(flag?"�����ɹ�":"����ʧ��");
		//ɾ��
		flag =src.delete();
		System.out.println(flag?"ɾ���ɹ�":"ɾ��ʧ��");
		
		
		//static createTempFile()
		File temp=File.createTempFile("tes", ".temp",new File("F:/others"));
		Thread.sleep(1000);
		temp.deleteOnExit();//1����֮��ɾ��
		
		
	}

}
