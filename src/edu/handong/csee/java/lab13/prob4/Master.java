package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;// import scanner for getting input.

public class Master {// declare class to initiate main method.
	public void feed(Pet pet) {// declare a method to print out.
		System.out.println("fed : " + pet.food());// print out what food were given to that pet.
	}
	
	public static void main(String[] args) {// declare a main method.
		acto();// initiate acto method.
	}
	
	public static void acto() {// declare a method that does what should be done in main method.
		Scanner keyboard = new Scanner(System.in);// initiate scanner to get input.
		Master master = new Master();// instantiate master class.
		Cat cat = new Cat();// instantiate cat class.
		Dog dog = new Dog();// instantiate dog class.
		System.out.println("Type in name of cat : ");// ask user to type in name of cat.
		cat.setName(keyboard.nextLine());// set name of cat as string next given in scanner.
		System.out.println("Type in name of dog : ");// ask user to type in name of dog.
		dog.setName(keyboard.nextLine());// set name of dog as string next given in scanner.
		System.out.println("Name of Cat : " + cat.getName());// print out the name of cat.
		master.feed(cat);// get what food fed to cat.
		System.out.println("Name of Dog : " + dog.getName());// print out the name of dog.
		master.feed(dog);// get what food fed to dog.
		keyboard.close();// close the scanner.
	}
}
