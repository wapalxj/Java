package CC130_OtherCollection_Properties;

import java.util.Properties;


/*
 * Properties��Դ�����ļ��Ķ�д
 * 1.key��valueֻ�����ַ���
 * 2.�洢���ȡ
 */
public class Demo01 {

	public static void main(String[] args) {
		Properties pro =new Properties();
		//�洢
		pro.setProperty("vero","Alicc");
		pro.setProperty("vnix","Alicc");
		pro.setProperty("vvvv","Alicc");
		pro.setProperty("veeee","Alicc");
		
		
		String str=pro.getProperty("vero","test");
		String str2=pro.getProperty("vcccc","test");
		System.out.println(str);//����vero��Ӧ���ַ���ֵ����ʹ���Լ���ֵ
		System.out.println(str2);//������vcccc��Ӧ���ַ���ֵ����ʹ�ø�����test
	}

}
