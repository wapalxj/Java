package edu.ynu.lab7_2;

public abstract class Auto {
	protected double Price;
	private String Maker;
	public Auto() {	
	}
	public double getPrice() {
		return Price;
	}
	public abstract void setPrice(double price);
	
	public String getMaker() {
		return Maker;
	}
	public void setMaker(String maker) {
		this.Maker = maker;
	}
}
