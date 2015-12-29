package edu.ynu.lab3;

import java.util.Scanner;

public class ContinueLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		for(int count=1;count<=10;count++)
		{
			if(count==5)
			{
				continue;
			}
			System.out.println("count= "+count );
		}
		
		System.out.println("Used continue statement to skip printing 5 ");
		System.out.println("ÄÂ¹ðº££¬20121120138");


	}

}
