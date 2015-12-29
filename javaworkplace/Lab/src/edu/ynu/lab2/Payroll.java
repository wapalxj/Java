package edu.ynu.lab2;

public class Payroll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pay=25;
		int hoursWorked = 40;
		int grossPay =pay * hoursWorked;
		double taxesWithheld=grossPay*.15;
		double netPay=grossPay-taxesWithheld;
		
		System.out.println("the grossPay is $"+grossPay);
		System.out.println("the taxesWithheld $is "+taxesWithheld);
		System.out.println("the netPay is $"+netPay);
		System.out.println("ÄÂ¹ðº££¬20121120138");
	}

}
