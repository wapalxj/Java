package edu.ynu.lab5;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Circle a=new Circle();
		Circle b=new Circle();
		System.out.println("������2���뾶��");
		a.setRadius(in.nextInt());
		b.setRadius(in.nextInt());
		System.out.println("The area of a is "+a.computeArea());
		System.out.println("The diameter of a is "+a.computeDiameter());
		System.out.println();
		System.out.println("The area of b is "+b.computeArea());
		System.out.println("The diameter of a is "+b.computeDiameter());
		System.out.println("�¹�  20121120138");
	}
}
