package loops_programs;

import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class SumOfPosi_Negative {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the numbers...");
		
		int negSum=0;
		int posEven=0;
		int posOdd=0;
		
		while(true){
			int n=scanner.nextInt();
			if(n==0) {
				break;
			}
			if(n<0) {
				negSum+=n;
			}
			if(n>0) {
				if(n%2==0) {
					posEven+=n;
				}else {
					posOdd+=n;
				}
			}
		}
		
		System.out.println("The sum of Negative numbers is : "+negSum);
		System.out.println("The sum of Positive Even numbers is : "+posEven);
		System.out.println("The sum of Positive Odd numbers is : "+posOdd);
	}

}
