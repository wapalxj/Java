package c65_DateClass_Charp4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test3Calendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=new GregorianCalendar();
//		System.out.println(c.getTime());
//		Date d=c.getTime();
//		System.out.println(d);
//		
		c.set(2014, Calendar.APRIL, 1, 10, 12);
//		Date d2=c.getTime();
//		System.out.println(d2);
//		
//		
//		c.set(Calendar.YEAR, 2014);
		
//		c.setTime(new Date());
		
		
		Date d3=c.getTime();
		System.out.println(d3);
		System.out.println(c.get(Calendar.YEAR));
		
		
		c.add(Calendar.YEAR, 30);//c中增加30年
		System.out.println(c.get(Calendar.YEAR));
	}

}
