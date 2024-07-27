package flow_Of_Programs;

import java.util.Scanner;

//Take two numbers and print the sum of both.
public class SumOfTwoNum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the first num....: ");
		int num1=scanner.nextInt();
		
		System.out.print("Enter the second num...: ");
		int num2=scanner.nextInt();
		
		int sum=num1+num2;
		System.out.println("The sum of two numbers is : "+sum);

	}

}
