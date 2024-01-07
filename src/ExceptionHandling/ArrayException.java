package ExceptionHandling;

public class ArrayException {

	public static void main(String[] args) {

		try {
			int[] a = new int[4];
			a[4] = 10;
		} catch (ArithmeticException e5) {
			System.out.println("Exception: " + e5);
		} catch (ArrayIndexOutOfBoundsException e6) {
			System.out.println("Exception: " + e6);
		}

	}

}
