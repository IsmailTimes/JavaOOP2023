package Inheritance;

public class Teacher extends Person{

	String qualification;
	void displayInfo2() {
		displayInfo1();
		System.out.print(", Qualification: " + qualification);
		System.out.println(", Country: "+ getCountry()+ ", and state: "+ getState());
		
	}
}
