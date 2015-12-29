package edu.ynu.lab8;

public class Student extends Person{
	private final String career  ="student";

	@Override
	public void play() {
		System.out.println("I am studying,not playing! ");
	}

	@Override
	public void say() {
		System.out.print("I am a "+this.career);	
	}

	
}
