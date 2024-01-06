package statickeyword;

public class Student {

	String name;
	int id;
	static String universityName = "JKKNIU";
	static int count = 0;

//	Student() {
//		count++;
//	}

	Student(String n, int i) {
		name = n;
		id = i;
		count++;
	}

	void displayInformation() {
		System.out.println(
				"Serial No. " + count + ", Name: " + name + ", Id: " + id + ", University Name: " + universityName);
	}
	
	static void method() {
		System.out.println("It's a static method");
	}

}
