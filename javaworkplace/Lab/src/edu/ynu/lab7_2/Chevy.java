package edu.ynu.lab7_2;

public class Chevy extends Auto{
	public Chevy() {
		setMaker("Ford");
	}
	
	@Override
	public void setPrice(double price) {
		this.Price=price;
	}
}
