package flow_Of_Programs;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class LargerNum {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("Enter the first number...: ");
	int num1=scanner.nextInt();
	
	System.out.print("Enter the second number...: ");
	int num2=scanner.nextInt();
	
	if(num1>num2) {
		System.out.println(num1+" is largest number");
	}else {
		System.out.println(num2+" is largest number");
	}
	
//	if(num1>num2) {
//		System.out.println(num1+" is greater than "+num2);
//	}else {
//		System.out.println(num1+" is less than "+num2);
//	}

	}

}
