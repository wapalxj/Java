package c65_DateClass_Charp4;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2DateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DateFormat�����鿴Դ��
		DateFormat df =new SimpleDateFormat("yyyy-MM-dd");//������д�ַ�������ʽ
		DateFormat df2 =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		DateFormat df3 =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,���ڱ���ĵĵ�w��,���ڱ��µĵ�W�ܣ�");
		DateFormat dfn =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,���ڱ���ĵĵ�w��,���ڱ��µĵ�W�ܣ�");
		Date d =new Date(123123123L);
		Date dn =new Date();
		
		String str =df.format(d);
		System.out.println(str);
		
		String str2 =df2.format(d);
		System.out.println(str2);
		
		String str3 =df3.format(d);
		System.out.println(str3);
		
		String str4 =dfn.format(dn);
		System.out.println(str4);
		
		System.out.println("#######################");
		
		
		
		
		String str5 ="1977-7-7";
		DateFormat dd =new SimpleDateFormat("yyyy-MM-dd");//ע����и�ʽӦ�����е�һ�£�"1977��7��7"���Ӧ"yyyy��MM��dd"
		try {
			Date dd2=dd.parse(str5);
			System.out.println(dd2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
