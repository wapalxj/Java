package edu.ynu.lab4_OOP;
import java.util.Scanner;

public class String1 {
		
	private String inputStr;  //输入的字符串
	private String sub_inputStr;//截取的字串
	private int subLenth;//截取子段的长度
	
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
		
		System.out.println("请输入一个串: ");
		String1 str=new String1(in.nextLine());
		
		System.out.println("请输入一个数字: ");
		int n= in.nextInt();
		
		
		str.strSub(n);
		str.strPrint();
		
		System.out.println("穆桂海 20121120138");
		
	}
}
