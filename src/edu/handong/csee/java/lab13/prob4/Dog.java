package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{// declare a class that defines dog inherits animal and implements pet
	@Override
	public String food() {// override abstract method that returns string
		return "Sausage";// return food for dog as string.
	}
}
