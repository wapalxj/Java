package c56_strBuilder;

public class Test {

	/**
	 * 可变字符序列:strBuilder和strBuffer
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();//字符初始长度为16
		StringBuilder sb1 =new StringBuilder(32);//字符初始长度为32
		StringBuilder sb2 =new StringBuilder("abcd");//字符初始长度为32,value[]={'a','b','c','d','\u0000','\u0000','\u0000'……}
		sb2.append("efg");
		sb2.append(true);
		sb2.append(123).append(456);//append方法可形成一个方法链，因为它的返回值是this
		System.out.println(sb2);
	}

}
