package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;

public class Master {
	public void feed(Pet pet) {
		System.out.println("fed : " + pet.food());
	}
	
	public static void main(String[] args) {
		acto();
	}
	
	public static void acto() {
		Scanner keyboard = new Scanner(System.in);
		Master master = new Master();
		Cat cat = new Cat();
		Dog dog = new Dog();
		System.out.println("Type in name of cat : ");
		cat.setName(keyboard.nextLine());
		System.out.println("Type in name of dog : ");
		dog.setName(keyboard.nextLine());
		System.out.println("Name of Cat : " + cat.getName());
		master.feed(cat);
		System.out.println("Name of Dog : " + dog.getName());
		master.feed(dog);
		keyboard.close();
	}
}
