package arrays_oneDim;

import java.util.Scanner;

public class DynamicSizeOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the array elements");
			
			a[i]=scanner.nextInt();
		}
		
		for (int i : a) {
			System.out.println(i);
		}

	}

}
