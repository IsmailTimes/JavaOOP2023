package SuperKeyword;

class A {
	int x = 5;
	
	void info() {
		System.out.println("This is inside of A");
	}
}

class B extends A{
	int x = 10;
	void display() {
		System.out.println("This class variable: " + x);
		System.out.println("Super class variable: " + super.x);
	}
	
	void info() {
		super.info();
		System.out.println("This is inside of B");
	}
}

public class SuperClass {

	public static void main(String[] args) {
		B obj = new B();
		obj.display();
		obj.info();

	}

}
