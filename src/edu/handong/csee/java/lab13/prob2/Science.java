package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{// declare a class that defines science book that is inherited from Book class.
	private String Publisher;// declare a string variable to store name of publisher.
	public Science(String name, String Publisher) {// declare a constructor.
		super(name);// get name from constructor inherited.
		this.Publisher = Publisher;// assign local parameter publisher to class variable.
	}
	
	public String SetData() {// override a method to return data
		return super.SetData() + "\nPublisher : " + Publisher;// return data as string.
	}
	
	public void ShowData() {// override a method to print out data.
		System.out.println("<<Science>>" + this.SetData());// print out data of science book.
	}
}
