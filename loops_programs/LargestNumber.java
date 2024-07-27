package loops_programs;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int max=0;
		while(true) {
			System.out.print("Enter the number...:");
			int n=scanner.nextInt();
			if(n==0) {
				break;
			}
			if(n>=max) {
				max=n;
			}
		}
		System.out.println("The largest number from given numbers is : "+max);

	}

}
