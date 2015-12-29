package edu.ynu.lab3;

import java.util.Scanner;

public class AverageNumbers2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("请输入一个结尾的数字：");
		int nums=in.nextInt();
		System.out.println("输入的最大数字为： "+nums);
		double sum=0.0;
		int i=0;
		while(true)
		{
			if(i++>=nums){break;}
			sum+=i;
		}
		double avg=sum/nums;

		System.out.println("用while循环计算从1到"+nums+"的平均数为： "+avg);

		System.out.println("穆桂海，20121120138");

}




	}


