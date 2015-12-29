package edu.ynu.lab8;

public class Actor extends Person{
	private final String career  ="actor";

	
	@Override
	public void say() {
		System.out.print("I am a "+this.career);
		
	}

	@Override
	public void play() {
		System.out.println("I am playing a part");
	} 

	
}
