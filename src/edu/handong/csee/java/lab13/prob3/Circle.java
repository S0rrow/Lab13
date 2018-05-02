package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{
	private double radius = 0;
	
	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double CalcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double CalcPerimeter() {
		return (double)(2 * radius * Math.PI); 
	}	
}
