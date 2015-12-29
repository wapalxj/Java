package edu.ynu.lab5;

public class Circle {
	 private double radius;
	 private double area; 
	 private double diameter;
	 
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double computeDiameter() {
		return this.radius*2;
	}
	
	public double computeArea() {
		return Math.pow(this.radius, 2)*Math.PI;
	} 
	
	
}
