package c65_DateClass_Charp4;
import java.util.Date;
public class Test1Date {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d =new Date();
		System.out.println(d);
		Date d2 =new Date(1000);//从1970年1月1肉00:00:00向后走1000毫秒
		System.out.println(d2.toGMTString());//有杠表示不建议用
		
	}

}
