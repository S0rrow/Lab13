package edu.handong.csee.java.lab13.prob6;

public class Printer {
	public static void print(Object object) {
		String string = object.toString();
		if(object instanceof CapitalPrint) {
			string = string.toUpperCase();
		}
		System.out.println(string);
	}
}
