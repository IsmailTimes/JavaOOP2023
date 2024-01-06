package statickeyword;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("Ismail", 11);
		s1.displayInformation();

		Student s2 = new Student("Al-Islam", 9);
		s2.displayInformation();

		// Static member can be called without creating object, can be called by class
		// name
		Student.method();

		System.out.println(Student.universityName);
		
	}

}
