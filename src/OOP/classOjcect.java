package OOP;

class Computer {
	int price;
	int version;
	String brand;
	boolean isSuperC;

	// Default Constructor
	Computer() {
		// Default Constructor doesn't have a void and return
		// System.out.println("Computer() Constructor is called");
		// brand = "Lenovo";
	}

	// Overloading Constructor
	Computer(int p, int v, String brand) {
		price = p;
		version = v;
		this.brand = brand;
	}

	// Overriding Constructor
	@Override
	public String toString() {
		return "Brand: " + brand + ", price: " + price + ", version: " + version + ", isSuper: " + isSuperC;

	}

	public void Browing() {
		System.out.println("We can browse internet using computer");
		return;
	}
}

public class classOjcect {

	public static void main(String[] args) {

		Computer c1 = new Computer(60000, 10, "HP");
		Computer c2 = new Computer();
		// System.out.println("C1 Brand: "+ c1.brand + ", C1 Price: "+ c1.price+ ", C1
		// version: "+ c1.version);
		c2.price = 53000; // It's not ideal for privacy issue.
		System.out.println("Price: " + c2.price);
		System.out.println(c1);

	}
}
