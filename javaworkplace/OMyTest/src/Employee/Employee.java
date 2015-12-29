package Employee;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public abstract class Employee {
	String name;
	String postion;
	double salary;
	
	public abstract void computeSalary();
	public abstract double getSalary();

	
}
//1.�̶�����
class Weeker extends Employee{
	int weeks;
	double perSalary;
	
	public Weeker(int weeks,double perSalary) {
		this.weeks =weeks;
		this.perSalary=perSalary;
	}
	
	public void computeSalary(){
		this.salary=this.perSalary*this.weeks;
	}
	public double getSalary() {
		return this.salary;
	}
}
//1.��ʱȡ��
class DailyWorker extends Employee{
	private int perHourSalary;//��������20��ÿСʱ
	private int hours;
	private int peraddSalary;//�Ӱ��15��ÿСʱ
	public DailyWorker(int hours,int perHourSalary,int peraddSalary) {
		this.hours =hours;
		this.peraddSalary=peraddSalary;
		this.perHourSalary=perHourSalary;
	}
	public void computeSalary(){
		 if(hours<=40){
			 this.salary=this.hours*this.perHourSalary;
			}
			else if (hours>40) {
				addSalary(hours-40);
			}
	}
	
	public void addSalary(int addHours) {
		this.salary=40*this.perHourSalary+addHours*peraddSalary;
	}
	public double getSalary() {
		return this.salary;
	}
	
}
//3.�����۶���ɵ�
class Saleman extends Employee{
	double SalesMoney;
	double  percent;
	public Saleman(int SalesMoney,double percent) {
		this.SalesMoney=SalesMoney;
		this.percent=percent;
	}
	
	public void computeSalary(){
		this.salary=this.SalesMoney*this.percent;
	}
	
	public double getSalary() {
		return this.salary;
	}
}



//4.����н�������۶����
class SalemanBasedSalary extends Employee{
	double baseSalary;
	double SalesMoney;
	double  percent;
	int weeks;
	
	
	public SalemanBasedSalary(double baseSalary,int weeks,double SalesMoney,double percent) {
		this.baseSalary=baseSalary;
		this.weeks=weeks;
		this.SalesMoney=SalesMoney;
		this.percent =percent;
	}
	
	public void computeSalary(){
		this.salary=this.baseSalary*this.weeks+this.SalesMoney*this.percent;
	}

	public void addbaseSalary(double addbaseSalary) {
		this.baseSalary+=baseSalary*addbaseSalary;
	}
	public double getSalary() {
		return this.salary;
	}
	
}
