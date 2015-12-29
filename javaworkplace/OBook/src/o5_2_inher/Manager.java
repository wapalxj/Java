package o5_2_inher;

public class Manager extends Employee{

	private double bonus;
	
	public Manager (String name,double salary) {
		super(name, salary);
		this.bonus=0;
	}
	
	public double getSalary() {
		double baseSalary=super.getSalary();
		return baseSalary+bonus;
	}
	
	public void setBonus(double b) {
		this.bonus=b;
	}
}
