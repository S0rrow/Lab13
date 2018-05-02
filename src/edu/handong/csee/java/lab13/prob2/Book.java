package edu.handong.csee.java.lab13.prob2;

public class Book {// declare a class to define initial state of book.
	private static int cnt = 0;// declare private integer variable to count how many inheritances were made.
	private String name;// declare a string variable to store name.
	private int id = 0;// declare a private integer variable to store id of book.
	
	public Book(String name) {// declare constructor to get name and count.
		this.name = name;// assign local variable to class variable.
		cnt++;// add 1 to count.
		id = cnt;// assign count to id.
	}
	public String SetData() {// declare a method to return data as string.
		return "\nId : " + id + "\nBook Name : " + name;// return data of book as string.
	}
	
	public void ShowData() {// declare method to print out.
		System.out.println("<<Book>>"+this.SetData());// print out data of book.
	}
}
