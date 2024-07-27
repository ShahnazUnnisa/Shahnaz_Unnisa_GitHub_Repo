package flow_Of_Programs;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Simple_Interest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the principal amount...: ");
		long principal=scanner.nextLong();
		
		System.out.print("Enter the principal Time...: ");
		int time = scanner.nextInt();
		
		System.out.print("Enter the principal Rate...: ");
		int rate=scanner.nextInt();
		
		double simple_intrest=(principal*time*rate)/100;
		
		System.out.println("The Simple intrest is :"+simple_intrest);

	}

}
