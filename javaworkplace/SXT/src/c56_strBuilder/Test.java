package c56_strBuilder;

import java.util.Arrays;

public class Test {

	/**
	 * �ɱ��ַ�����:strBuilder��strBuffer
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();//�ַ���ʼ����Ϊ16
		StringBuilder sb1 =new StringBuilder(32);//�ַ���ʼ����Ϊ32
		StringBuilder sb2 =new StringBuilder("abcd");//�ַ���ʼ����Ϊ16+4=20,value[]={'a','b','c','d','\u0000','\u0000','\u0000'����}
//		sb2.append("efg");
//		sb2.append(123).append(456);//append�������γ�һ������������Ϊ���ķ���ֵ��this
		System.out.println(sb2);
		System.out.println("sb2.length "+sb2.capacity());
		sb2.append("222");
		sb2.append("222");
		System.out.println("sb2.length "+sb2.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb1.capacity());
		
		//JDkԴ��������������һ�δ��룬�ɼ��ǺϷ���
		int []a= {1,2,3};
		int newCapacity =10;
		a = Arrays.copyOf(a, newCapacity);//��append����������ʱ��ΪJDKStringBuilder�����ݷ�ʽ
		System.out.println(a.length);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
		MyStringBuilder msb=new MyStringBuilder("ooooo");
		System.out.println(msb);
		System.out.println(msb.length());
		System.out.println(msb.capacity());
	}

}
