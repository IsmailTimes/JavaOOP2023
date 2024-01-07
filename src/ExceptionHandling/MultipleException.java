package ExceptionHandling;

public class MultipleException {

	public static void main(String[] args) {

		try {
			int a = 10, b = 0;
			double result2 = a / b;
			System.out.println("Result: " + result2);
		}
		catch (ArrayIndexOutOfBoundsException e2){
			System.out.println("Exception: " + e2);
			
		}
		catch(Exception e4) {
			System.out.println("Exception: "+ e4);
			
		}
		

	}

}
