package edu.ynu.lab4;

import java.util.Scanner;

public class StringTokenizer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("������һ���ַ��ö��Ÿ���: ");
		Scanner in =new Scanner(System.in);
		String str= in.nextLine();
	
		String []str2=str.split(",");

		for(int i=0;i<str2.length;i++)
		{
			System.out.println("String["+(i+1)+"]: "+str2[i]);
		}
		System.out.println("�¹𺣣�20121120138");
	}

}
