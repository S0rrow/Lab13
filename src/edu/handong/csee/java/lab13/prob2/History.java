package edu.handong.csee.java.lab13.prob2;

public class History extends Book{
	private String Author;
	public History(String name, String Author) {
		super(name);
		this.Author = Author;
		// TODO Auto-generated constructor stub
	}
	
	public String SetData() {
		return super.SetData() + "\nAuthor : " + Author;
	}
	
	public void ShowData() {
		System.out.println("<<History>>" + this.SetData());
	}
}
