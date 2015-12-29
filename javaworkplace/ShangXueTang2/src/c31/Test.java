package c31;

public class Test {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		s1.name="s1";
		s1.age=18;
		
		Computer c1=new Computer();
		c1.brand="lenovo";
		
		s1.computer=c1;
		
		System.out.println(s1.computer.brand);
		
	}

}
