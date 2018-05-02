package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{// declare a class that defines cat inherits animal and implements pet
	@Override
	public String food() {// override abstract method that returns string.
		return "Fish";// return food for cat as string.
	}

}
