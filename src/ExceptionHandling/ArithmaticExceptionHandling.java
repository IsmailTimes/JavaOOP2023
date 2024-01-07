package ExceptionHandling;

import java.util.Scanner;

public class ArithmaticExceptionHandling {
	public static void main(String[] args) {
		int count = 1;

		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Please enter your first number: ");
				int num1 = sc.nextInt();
				System.out.print("Please enter your Second number: ");
				int num2 = sc.nextInt();

				double result = num1 / num2;
				System.out.println("Result: " + num1 + "/" + num2 + " = " + result);
				count = 2;
			} catch (Exception e) {
				System.out.println("Exception: " + e);
				System.out.println("You must enter integer, please try again!");
			}

		} while (count == 1);
	}
}
