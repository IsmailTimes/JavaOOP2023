package Interface;

interface A{
	void play();
}

interface B{
	void run();
}

//One class can implements multiple classes.
class C implements A,B{

	@Override
	public void run() {
		System.out.println("We run.");
		
	}

	@Override
	public void play() {
		System.out.println("We Play.");
		
	}
	
}
public class MultipleInterface {

	public static void main(String[] args) {
		C ob = new C();
		ob.play();
		ob.run();
		
	
	}

}
