package loops_programs;

import java.util.Scanner;

//Sum Of A Digits Of Number
public class SumOfDigits {
	public static void sumOfDigit(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		System.out.println("The sum of digits of given number is : "+sum);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number....: ");
		int num = scanner.nextInt();
		
		sumOfDigit(num);

	}

}
