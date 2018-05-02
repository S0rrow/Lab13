package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint{// declare a class to define coordinate that implements CapitalPrint interface.
	private int x, y;// declare two integer variable to store coordinate.
	public UpPoint(int x, int y) {// declare constructor.
		this.x = x;// assign parameter x to class variable x.
		this.y = y;// assign parameter y to class variable y.
	}
	
	public String toString() {// declare method to return integers as string.
		return "x : " + x + " y : " + y;// return data of coordinates as string.
	}
}