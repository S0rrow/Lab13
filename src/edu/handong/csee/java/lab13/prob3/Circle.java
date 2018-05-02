package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{// declare a class that defines circle and inherits Shape class.
	private double radius = 0;// declare a private double variable to store radius.
	
	public double getRadius() {// declare a getter method for radius.
		return radius;// return radius.
	}

	public Circle(double radius) {// declare a constructor with radius as parameter.
		this.radius = radius;// assign parameter to class variable.
	}
	
	public double CalcArea() {// declare a method to calculate area.
		return Math.PI * Math.pow(radius, 2);// return area of circle calculated with radius.
	}
	
	public double CalcPerimeter() {// declare a method to calculate perimeter.
		return (double)(2 * radius * Math.PI);// return perimeter of circle calculated with radius.
	}	
}
