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
		Date d2 =new Date(1000);//��1970��1��1��00:00:00�����1000����
		System.out.println(d2.toGMTString());//�иܱ�ʾ��������
		
	}

}
