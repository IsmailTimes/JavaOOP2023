package File;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {
		try {
			Formatter f = new Formatter("C:/Users/ISMAIL/workspace/JavaOOP2023/Student/result.txt");

			Scanner sc = new Scanner(System.in);
			System.out.print("How many students: ");
			int num = sc.nextInt();
			String id;
			String name;

			for (int i = 1; i <= num; i++) {
				System.out.print("Please Enter your " + i + " number student id and name: ");
				id = sc.next();
				name = sc.next();
				f.format("%s %s\r\n", id, name);
			}

			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("Exception" + e);
		}

	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
