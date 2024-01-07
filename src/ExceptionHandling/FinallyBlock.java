package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		try {
			int x = 10, y = 0;
			double result = x / y;
			System.out.println("Result: " + result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e);
		} finally {
			System.out.println("Last line of the problem");
		}

	}

}
