package edu.ynu.lab7;

import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("########�¹�20121120138###########");
		System.out.println("������Ҫѡ��Ŀγ̣�1-5����");
		int a=in.nextInt();
		CollegeCourse course=new CollegeCourse(a);
		Lab lab=new Lab(a);
		System.out.println("The cost of your course is $"+course.Cost());
		System.out.println("there is a $"+lab.Cost()+" lab fee");
		System.out.println("The cost of your course is $"+(course.Cost()+lab.Cost()));
		System.out.println("########�¹�20121120138###########");

	}

}
