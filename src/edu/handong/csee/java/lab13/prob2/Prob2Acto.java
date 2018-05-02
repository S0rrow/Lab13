package edu.handong.csee.java.lab13.prob2;

public class Prob2Acto {// declare a class to initiate main method.
	public static void main(String[] args) {// declare main method.
		Book book = new Book("Simple book");// instantiate Book class.
		Science science = new Science("Basic Physics", "WorldOfSciencecraft");// instantiate Science class.
		History history = new History("World History", "Total Historia");// instantiate History class.
		book.ShowData();// print out data of book.
		science.ShowData();// print out data of science.
		history.ShowData();// print out data of history.
	}
}
