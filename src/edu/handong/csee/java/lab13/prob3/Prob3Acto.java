package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;// import scanner for getting inputs.
public class Prob3Acto {// declare a class for main method.
	public static void main(String[] args) {// declare a main method.
		acto();// initiate acto method.
	}
	
	private static void acto() {// declare a method that does what should be done in main.
		Scanner keyboard = new Scanner(System.in);// declare a scanner for input.
		System.out.println("Type in radius : ");// ask user to type in radius.
		Circle circle = new Circle(keyboard.nextDouble());// get double variable as radius from scanner and instantiate circle class.
		System.out.println("Radius : " + circle.getRadius());// print out radius given.
		circle.ShowData();// print out data of circle.
		System.out.println("Type in length : ");// ask user to type in length.
		double length = keyboard.nextDouble();// declare a double variable to store length given from scanner.
		System.out.println("Type in width : ");// ask user to type in width.
		double width = keyboard.nextDouble();// declare a double variable to store width given from scanner.
		Rectangle rectangle = new Rectangle(length, width);// instantiate rectangle with length and width given.
		System.out.println("Length : " + rectangle.getlength() + "\nWidth : " + rectangle.getwidth());// print out length and width given.
		rectangle.ShowData();// print out data of rectangle.
		keyboard.close();// close the scanner.
	}
}