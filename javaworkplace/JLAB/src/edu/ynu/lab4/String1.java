package edu.ynu.lab4;

import java.util.Scanner;

public class String1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		System.out.println("������һ����: ");
		String str= in.nextLine();
		System.out.println("������һ������: ");
		int n=in.nextInt();
		
		System.out.println("length of str is : "+ str.length());
		
		String str2=str.substring(0,n);
		
		System.out.println("first "+ n +" bytes of string : "+ str2);
		
		System.out.println("�¹𺣣�20121120138");

	}

}
