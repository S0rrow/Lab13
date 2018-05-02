package edu.handong.csee.java.lab13.prob6;

public class Prob6Acto {// declare a class to initiate main method.
	public static void main(String[] args) {// declare main method.
		acto();// initiate acto method.
	}
	
	public static void acto() {// declare a method that does what should be done in main method.
		UpPoint point1 = new UpPoint(3, 3);// instantiate UpPoint class with x as 3, y as 3.
		DownPoint point2 = new DownPoint(2, 5);// instantiate DownPoint class with x as 2, y as 5.
		DownPoint point3 = new DownPoint(4, 7);// instantiate DownPoint class with x as 4, y as 7.
		UpPoint point4 = new UpPoint(9, 12);// instantiate UpPoint class with x as 9, y as 12.
		Printer.print(point1);// print point1.
		Printer.print(point2);// print point2.
		Printer.print(point3);// print point3.
		Printer.print(point4);// print point4.
	}
}
