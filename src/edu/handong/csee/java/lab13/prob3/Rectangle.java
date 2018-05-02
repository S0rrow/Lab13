package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{
	private double length = 0.0;
	private double width = 0.0;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getlength() {
		return length;
	}
	
	public double getwidth() {
		return width;
	}
	
	public double CalcArea() {
		return length * width;
	}
	
	public double CalcPerimeter() {
		return length * 2 + width * 2;
	}

}
