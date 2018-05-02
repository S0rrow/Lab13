package edu.handong.csee.java.lab13.prob2;

public class Prob2Acto {
	public static void main(String[] args) {
		Book book = new Book("Simple book");
		Science science = new Science("Basic Physics", "WorldOfSciencecraft");
		History history = new History("World History", "Total Historia");
		book.ShowData();
		science.ShowData();
		history.ShowData();
	}
}
