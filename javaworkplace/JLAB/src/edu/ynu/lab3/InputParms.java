package edu.ynu.lab3;

import java.util.Scanner;

public class InputParms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String []name=new String [3];
		boolean isExsit=false;
		
		System.out.println("������3�����ִ����������:");
		
		for(int i=0;i<3;i++)
		{
			name[i]=in.nextLine();
		
		}
		
		System.out.println("������һ�仰����Ҫ��������û��������:");
		String myname=in.nextLine();
		for(int i=0;i<3;i++)
		{
			if(myname.contains(name[i]))
			{
				isExsit=true;
				System.out.println("������� "+ name[i]+" ��������Ŷ!");
				
			}
		}
			if(isExsit!=true)
			{
				System.out.println("�������û�б��ҵ�!");
			}
			
		
	
	}
}
