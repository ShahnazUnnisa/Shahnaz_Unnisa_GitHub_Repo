package flow_Of_Programs;

import java.util.Scanner;

//Find if a number is palindrome or not
public class Number_Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number..: ");
		int num = scanner.nextInt();
		
		int n=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}

		if(n==rev) {
			System.out.println("The given number is a palindrome : "+n);
		}else {
			System.out.println("The given number is not a palindrome : "+n);
		}
	}

}
