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
		//DateFormat不建议看源码
		DateFormat df =new SimpleDateFormat("yyyy-MM-dd");//根据缩写字符串来格式
		DateFormat df2 =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		DateFormat df3 =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,属于本年的的第w周,属于本月的第W周，");
		DateFormat dfn =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,属于本年的的第w周,属于本月的第W周，");
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
		DateFormat dd =new SimpleDateFormat("yyyy-MM-dd");//注意此行格式应和上行的一致，"1977，7，7"则对应"yyyy，MM，dd"
		try {
			Date dd2=dd.parse(str5);
			System.out.println(dd2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
