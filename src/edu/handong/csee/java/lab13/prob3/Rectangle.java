package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{// declare a class that defines rectangle and inherits Shape class.
	private double length = 0.0;// declare a private double variable to store length.
	private double width = 0.0;// declare a private double variable to store width.
	
	public Rectangle(double length, double width) {// declare a constructor.
		this.length = length;// assign length given as parameter to class variable.
		this.width = width;// assign width given as parameter to class variable.
	}
	
	public double getlength() {// declare a getter method for length.
		return length;// return length.
	}
	
	public double getwidth() {// declare a getter method for width.
		return width;// return width.
	}
	
	public double CalcArea() {// declare a method to calculate area from length and width.
		return length * width;// return area of rectangle.
	}
	
	public double CalcPerimeter() {// declare a method to calculate perimeter from length and width.
		return length * 2 + width * 2;// return perimeter of rectangle.
	}

}
