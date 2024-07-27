package flow_Of_Programs;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class CheckEven {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the num...: ");
		int num=scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("The Given Number is "+num+" Even");
		}else {
			System.out.println("The Given Number is "+num+" Odd");
		}

	}

}
