package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int cnt = 0;
	private String name;
	private int id = 1;
	
	public Book(String name) {
		this.name = name;
		cnt++;
		id = cnt;
	}
	public String ShowName() {
		return "\n";
	}
}
