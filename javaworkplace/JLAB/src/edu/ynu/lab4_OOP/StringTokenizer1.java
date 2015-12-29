package edu.ynu.lab4_OOP;
import java.util.Scanner;


public class StringTokenizer1 {
	
	private String inputStr;  //输入的字符串
	private String [] strArr;//截取后的字符串数组
	
	public  StringTokenizer1 (String inputStr) {
		this.inputStr=inputStr;
	}
	
	public void split() {
		this.strArr=this.inputStr.split(",");
	}
	
	public void strPrint () {
		for(int i=0;i<this.strArr.length;i++)
		{
			System.out.println("String["+(i+1)+"]: "+this.strArr[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		
		System.out.println("请输入一个串: ");
		StringTokenizer1 str = new StringTokenizer1(in.nextLine());
		str.split();
		str.strPrint();	
		System.out.println("穆桂海 20121120138");
		
	}
}
