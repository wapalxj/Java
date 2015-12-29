

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class Employee {
	String name;
	String postion;
	double salary;
	
	public abstract void computeSalary();
	public abstract double getSalary();

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Manager(2));
		list.add(new Saleman(3, 1000,2000,2000));
		list.add(new Worker(60));
		list.add(new DailyWorker(15));
		list.add(new PieceWorker(10));
		
		Iterator<Employee> it =list.iterator();
				while (it.hasNext()) {
					Employee em =it.next();
					em.computeSalary();
					System.out.println(em.getSalary());
				}
	
				
	}
}

class Manager extends Employee{
	int monthes;
	final double perSalary=3000;
	
	public Manager(int monthes) {
		this.monthes =monthes;
	}
	
	public void computeSalary(){
		this.salary=this.perSalary*this.monthes;
	}
	public double getSalary() {
		return this.salary;
	}
}

class Saleman extends Employee{
	final double baseSalary=1500;
	final double  percent=0.1;
	int monthes;
	double bonus;
	double[] perSaleMoney;
	
	public Saleman(int monthes,double... inputSaleMoney) {
		this.monthes=monthes;
		this.perSaleMoney=new double[inputSaleMoney.length] ;
		
		for (int i = 0; i < inputSaleMoney.length; i++) {
			this.perSaleMoney[i]=inputSaleMoney[i];
		}
		
//		System.arraycopy(perSaleMoney, 0, this.perSaleMoney , 0, perSaleMoney.length);
//		this.perSaleMoney=Arrays.copyOf(inputSaleMoney, inputSaleMoney.length);
	}
	
	public void computeSalary(){
		for (int i = 0; i < this.monthes; i++) {
			this.salary+=baseSalary+this.perSaleMoney[i]*percent;
		}
	}
	
	public double getBonus (int index) {
		if (index<0||index>monthes-1)
		try {
			throw new FileNotFoundException("check failed!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		else {
			this.bonus=this.perSaleMoney[index]*percent;
		}
		return bonus;
	}
	
	public double getSalary() {
		return this.salary;
	}
}

class Worker extends Employee{
	int days;
	private final double daysSalary=80;
	
	public Worker() {
		
	}
	public Worker(int days) {
		super();
		this.days = days;
	}

	public void computeSalary(){
		this.salary=this.days*this.daysSalary;
	}
	
	public double getSalary() {
		return this.salary;
	}
}

class DailyWorker extends Worker{
	private int perHourSalary=20;
	private int hours;
	
	public DailyWorker(int hours) {
		this.hours =hours;
	}
	public void computeSalary(){
		this.salary=this.hours*this.perHourSalary;
	}
	public double getSalary() {
		return this.salary;
	}
	
}
class PieceWorker extends Worker{
	final private int perPieceSalary=50;
	private int pieces;
	public PieceWorker(int pieces) {
		this.pieces=pieces;
	}
	public void computeSalary(){
		this.salary=this.pieces*this.perPieceSalary;
	}
	public double getSalary() {
		return this.salary;
	}
}