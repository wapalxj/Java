package edu.ynu.lab4_OOP;
import java.util.Scanner;

public class String1 {
		
	private String inputStr;  //������ַ���
	private String sub_inputStr;//��ȡ���ִ�
	private int subLenth;//��ȡ�Ӷεĳ���
	
	public  String1(String inputStr) {
		this.inputStr=inputStr;
	}
	public void strLenth() 
	{
		System.out.println("length of string is "+this.inputStr.length());
	}
	
	public void strSub(int n) 
	{
		this.subLenth=n;
		this.sub_inputStr=this.inputStr.substring(0,n);
	}
	
	public void strPrint() 
	{
		System.out.println("first "+this.subLenth+" bytes of string are "+this.sub_inputStr);
	}
	
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		
		System.out.println("������һ����: ");
		String1 str=new String1(in.nextLine());
		
		System.out.println("������һ������: ");
		int n= in.nextInt();
		
		
		str.strSub(n);
		str.strPrint();
		
		System.out.println("�¹� 20121120138");
		
	}
}
