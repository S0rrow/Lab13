package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;
public class Prob3Acto {
	public static void main(String[] args) {
		acto();
	}
	
	private static void acto() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type in radius : ");
		double radius = keyboard.nextDouble();
		Circle circle = new Circle(radius);
		System.out.println("Radius : " + circle.getRadius());
		circle.ShowData();
		System.out.println("Type in length : ");
		double length = keyboard.nextDouble();
		System.out.println("Type in width : ");
		double width = keyboard.nextDouble();
		Rectangle rectangle = new Rectangle(length, width);
		System.out.println("Length : " + rectangle.getlength() + "\nWidth : " + rectangle.getwidth());
		rectangle.ShowData();
		keyboard.close();
	}
}