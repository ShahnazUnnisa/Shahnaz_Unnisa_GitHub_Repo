package flow_Of_Programs;

import java.util.Scanner;

//Find Ncr & Npr
public class Permutation_nCr_nPr {
	public static int factorial(int num) {
		int fact=1;
		while(num>0) {
			fact*=num;
			num--;
		}
		return fact;
	}

	public static int combi(int n, int r) {
			int ncr=(factorial(n))/((factorial(n-r))*factorial(r));
			return ncr;
	}

	public static int permu(int n, int r) {
		
		int npr=(factorial(n))/((factorial(n-r)));
		return npr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter n value..: ");
		int n = scanner.nextInt();

		System.out.print("Enter r value..: ");
		int r = scanner.nextInt();

		System.out.println("The value of nCr is : " + permu(n, r));

		System.out.println("The value of nPr is : " + combi(n, r));
	}

}
