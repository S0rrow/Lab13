package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {// declare an abstract class to give abstract methods.
	public abstract double CalcArea();// declare an abstract method to calculate area.
	public abstract double CalcPerimeter();// declare an abstract method to calculate perimeter.
	public void ShowData() {// declare a method to show data of shape.
		System.out.println("\nArea : " + CalcArea() + "\nPerimeter : " + CalcPerimeter());// print out data of a shape.
	}
}
