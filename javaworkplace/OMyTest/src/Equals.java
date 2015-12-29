import Employee.Employee;


public class Equals {
	public static void main(String[] args) {
		Fruit f1 =new Fruit("Apple");
		Fruit f2 =new Fruit("Apple");
		System.out.println(f1.equals(f2));
	}
}
class Fruit{
	String name;
	public Fruit(String name) {
		this.name=name;
	}
}