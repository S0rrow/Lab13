package edu.handong.csee.java.lab13.prob6;

public class Printer {// declare class to print out the strings of object.
	public static void print(Object object) {// declare a method with parameter in object as string to print.
		String string = object.toString();// change object to string.
		if(object instanceof CapitalPrint) {// if object is instance of class implemented by CapitalPrint,
			string = string.toUpperCase();// change the string to upper case.
		}
		System.out.println(string);// print out the string.
	}
}
