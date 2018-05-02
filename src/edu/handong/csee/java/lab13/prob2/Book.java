package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int cnt = 0;
	private String name;
	private int id = 0;
	
	public Book(String name) {
		this.name = name;
		cnt++;
		id = cnt;
	}
	public String SetData() {
		return "\nId : " + id + "\nBook Name : " + name;
	}
	
	public void ShowData() {
		System.out.println("<<Book>>"+this.SetData());
	}
}
