package Test;

import java.util.Date;


public class TestTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ss=" Nov 9, 2016 10:28:35 AM  ";
		String dddString="Wed Nov 09 11:02:07 CST 2018";
		Date date=new Date(ss);
		System.out.println(date);
		
		char c='d';
		char c2='a';
		int cc=c>>'a';
		
		String error="1asd";
		try {
			Date date2=new Date(error);
			System.out.println(date2);
		} catch (Exception e) {
			System.err.println("date??");
			//e.printStackTrace();
		}
		
		
	}

}
