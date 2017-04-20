package c56_strBuilder;

import java.util.Arrays;

public class Test {

	/**
	 * 可变字符序列:strBuilder和strBuffer
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();//字符初始长度为16
		StringBuilder sb1 =new StringBuilder(32);//字符初始长度为32
		StringBuilder sb2 =new StringBuilder("abcd");//字符初始长度为16+4=20,value[]={'a','b','c','d','\u0000','\u0000','\u0000'……}
//		sb2.append("efg");
//		sb2.append(123).append(456);//append方法可形成一个方法链，因为它的返回值是this
		System.out.println(sb2);
		System.out.println("sb2.length "+sb2.capacity());
		sb2.append("222");
		sb2.append("222");
		System.out.println("sb2.length "+sb2.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb1.capacity());
		
		//JDk源码中有类似这样一段代码，可见是合法的
		int []a= {1,2,3};
		int newCapacity =10;
		a = Arrays.copyOf(a, newCapacity);//当append后容量不够时，为JDKStringBuilder的扩容方式
		System.out.println(a.length);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
		MyStringBuilder msb=new MyStringBuilder("ooooo");
		System.out.println(msb);
		System.out.println(msb.length());
		System.out.println(msb.capacity());

		//不能由String赋值
		//StringBuffer stringBuffer="xxxxx";
	}

}
