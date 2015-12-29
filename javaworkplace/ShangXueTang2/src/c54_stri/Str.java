package c54_stri;

public class Str {

	/**
	 * 不可变字符序列
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =new String("1234");
		String str2 =new String("1234");
		
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		
		String str3 ="qwer";
		String str4 ="qwer";
		

		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		System.out.println(str4.substring(0, 2));
	}

}
