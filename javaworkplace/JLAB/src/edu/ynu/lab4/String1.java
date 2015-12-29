package edu.ynu.lab4;

import java.util.Scanner;

public class String1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		System.out.println("请输入一个串: ");
		String str= in.nextLine();
		System.out.println("请输入一个数字: ");
		int n=in.nextInt();
		
		System.out.println("length of str is : "+ str.length());
		
		String str2=str.substring(0,n);
		
		System.out.println("first "+ n +" bytes of string : "+ str2);
		
		System.out.println("穆桂海，20121120138");

	}

}
