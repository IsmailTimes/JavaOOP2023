package SuperKeyword;

class Amal{
	Amal(){
		System.out.println("Constructor of Amal.");
	}
}

class Bashar extends Amal{
	Bashar(){
		super();
		System.out.println("Constructor of Bashar");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		Bashar b = new Bashar();
		

	}

}
