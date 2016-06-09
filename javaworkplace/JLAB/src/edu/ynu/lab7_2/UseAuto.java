package edu.ynu.lab7_2;

public class UseAuto {

	public static void main(String[] args) {
		Auto ford=new Ford();
		Auto chevy=new Chevy();
		ford.setPrice(22000);
		chevy.setPrice(1);
		System.out.println("A new "+ford.getMaker()+" costs $"+ford.getPrice());
		System.out.println("A new "+chevy.getMaker()+" costs $"+chevy.getPrice());
		System.out.println("########穆桂海20121120138###########");
	}

}
