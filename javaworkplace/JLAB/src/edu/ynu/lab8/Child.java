package edu.ynu.lab8;

public class Child extends Person {
	private final String rank ="child";

	@Override
	public void say() {
		System.out.print("I am a "+this.rank);
		
	}

	@Override
	public void play() {
		System.out.println("I am playing a game");
		
	} 
	
	
}