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
		
		System.out.println("请输入3个名字存放在我这里:");
		
		for(int i=0;i<3;i++)
		{
			name[i]=in.nextLine();
		
		}
		
		System.out.println("请输入一句话，我要看看你有没有在里面:");
		String myname=in.nextLine();
		for(int i=0;i<3;i++)
		{
			if(myname.contains(name[i]))
			{
				isExsit=true;
				System.out.println("你的名字 "+ name[i]+" 被发现了哦!");
				
			}
		}
			if(isExsit!=true)
			{
				System.out.println("你的名字没有被找到!");
			}
			
		
	
	}
}
