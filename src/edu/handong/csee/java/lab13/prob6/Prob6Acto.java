package edu.handong.csee.java.lab13.prob6;

public class Prob6Acto {
	public static void main(String[] args) {
		acto();
	}
	
	public static void acto() {
		UpPoint point1 = new UpPoint(3, 3);
		DownPoint point2 = new DownPoint(2, 5);
		DownPoint point3 = new DownPoint(4, 7);
		UpPoint point4 = new UpPoint(9, 12);
		Printer.print(point1);
		Printer.print(point2);
		Printer.print(point3);
		Printer.print(point4);
	}
}
