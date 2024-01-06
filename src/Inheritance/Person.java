package Inheritance;

public class Person {

	String name;
	int age;
	private String country;
	private String State;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	void displayInfo1() {
		System.out.print("Name: "+ name + ", age: "+ age);
	}
}
