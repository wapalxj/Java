package edu.ynu.lab3;

import java.util.Scanner;

public class AverageNumbers2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("������һ����β�����֣�");
		int nums=in.nextInt();
		System.out.println("������������Ϊ�� "+nums);
		double sum=0.0;
		int i=0;
		while(true)
		{
			if(i++>=nums){break;}
			sum+=i;
		}
		double avg=sum/nums;

		System.out.println("��whileѭ�������1��"+nums+"��ƽ����Ϊ�� "+avg);

		System.out.println("�¹𺣣�20121120138");

}




	}


