package Inheritance;

public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		Teacher t1 = new Teacher();
		t1.name= "Ismail";
		t1.age = 23;
		t1.qualification = "Undergrad";
		t1.setCountry("Bangladesh");
		t1.setState("Rajshahi");
		
		t1.displayInfo2();
		
		//instance of operator
		System.out.println(p instanceof Teacher);
		System.out.println(t1 instanceof Person);
		

	}

}
