package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{
	private String Publisher;
	public Science(String name, String Publisher) {
		super(name);
		this.Publisher = Publisher;
		// TODO Auto-generated constructor stub
	}
	
	public String SetData() {
		return super.SetData() + "\nPublisher : " + Publisher;
	}
	
	public void ShowData() {
		System.out.println("<<Science>>" + this.SetData());
	}
}
