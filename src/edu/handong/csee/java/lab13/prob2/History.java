package edu.handong.csee.java.lab13.prob2;

public class History extends Book{// declare class that defines History book that is inherited from Book class.
	private String Author;// declare a private string variable to store name of author.
	public History(String name, String Author) {// declare constructor with parameter as name and author.
		super(name);// get name from constructor inherited.
		this.Author = Author;// assign local parameter author to class variable.
	}
	
	public String SetData() {// override a method to return data.
		return super.SetData() + "\nAuthor : " + Author;// return data as string.
	}
	
	public void ShowData() {// override a method to print out.
		System.out.println("<<History>>" + this.SetData());// print out data of history book.
	}
}
