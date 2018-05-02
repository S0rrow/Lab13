package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {
	public abstract double CalcArea();
	public abstract double CalcPerimeter();
	public void ShowData() {
		System.out.println("\nArea : " + CalcArea() + "\nPerimeter : " + CalcPerimeter());
	}
}
