package loops_programs;

import java.util.Scanner;

//Calculate Average Of N Numbers
public class AverageOfNNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the count of total numbers...:");
		int count=scanner.nextInt();
		int n=count;
		
		int sum=0;
		while(count>0) {
			System.out.print("Enter the number...:");
			sum+=scanner.nextInt();
			count--;
		}
		
		System.out.println("The Average Of "+n+" Numbers is "+(sum/n));
		

	}

}
