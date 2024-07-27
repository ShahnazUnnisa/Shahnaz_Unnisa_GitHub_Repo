package loops_programs;

import java.util.Scanner;

public class Perfect_Number {
	public static boolean perfectCheck(int num) {

		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number....: ");
		int num = scanner.nextInt();

		if (perfectCheck(num)) {
			System.out.println("the given number is a perfect number");
		} else {
			System.out.println("the given number is not a perfect number");
		}

	}

}
