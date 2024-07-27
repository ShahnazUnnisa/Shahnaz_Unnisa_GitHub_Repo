package loops_programs;

import java.util.Scanner;

//Factorial Program In Java
public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number...:");
		int num = scanner.nextInt();

		if (num == 0) {
			System.out.println("The factorial of given num is : 1");
		} else {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact *= i;
			}
			System.out.println("The factorial of given num is : " + fact);

		}
	}

}
