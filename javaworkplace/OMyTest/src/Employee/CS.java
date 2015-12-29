package Employee;

import java.util.Arrays;

public class CS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sale s =new Sale("222", 1);
		s.print();
		
	}

}

class Sale{
	String name;
	double [] arr;
	public Sale(String name, double... arr) {
	
		this.name = name;
		this.arr = Arrays.copyOf(arr, arr.length);
	}
	
	public void print () {
		for (double d : this.arr) {
			System.out.println(d*10);
		}
	}
	
	
}