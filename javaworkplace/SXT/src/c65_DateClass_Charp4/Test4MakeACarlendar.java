package c65_DateClass_Charp4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test4MakeACarlendar {

	/**
	 * ��ӡ�������ڵ�ĳ������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inS=new Scanner(System.in);
		String dString=inS.nextLine();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=format.parse(dString);
			Calendar calendar =new GregorianCalendar();
			calendar.setTime(date);
			
			int day=calendar.get(Calendar.DATE);
			
			
			calendar.set(Calendar.DATE, 1);
//			calendar.get(Calendar.DAY_OF_WEEK);
			
			int maxDate=calendar.getActualMaximum(Calendar.DATE);
			int nowWeek=calendar.get(Calendar.DAY_OF_WEEK);
			
			
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			
			for (int i = 0; i < nowWeek-1; i++) {
			
				System.out.print("\t");
			}
	
			for (int i = 1; i <= maxDate; i++) {
				if(i==day)
				{
					System.out.print("*");
				}
				System.out.print(i+"\t");
			
				if(calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
				{
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
