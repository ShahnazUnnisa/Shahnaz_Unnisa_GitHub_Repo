package flow_Of_Programs;

import java.util.Scanner;

//Take a number as input and print the multiplication table for it.
public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the number...: ");
		int num=scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}

	}

}
