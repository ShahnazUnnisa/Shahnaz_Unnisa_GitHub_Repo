package arrays_oneDim;

import java.util.Scanner;

public class DynamicInputValues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter array values");
			a[i] = scanner.nextInt();
		}

		System.out.println("******");
		for (int i : a) {
			System.out.println(i);
		}

	}

}
