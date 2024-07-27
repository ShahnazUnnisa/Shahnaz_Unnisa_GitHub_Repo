package flow_Of_Programs;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the first number...: ");
		int num1=scanner.nextInt();
		
		System.out.print("Enter the second number...: ");
		int num2=scanner.nextInt();
		
		System.out.print("Enter the Operator....: ");
		char operator=scanner.next().charAt(0);
		
		switch (operator) {
		case '+': {
			System.out.println("The sum of two numbers is :"+(num1+num2));
			break;
		}
		case '-': {
			System.out.println("The difference of two numbers is :"+(num1-num2));
			break;
		}
		case '*': {
			System.out.println("The multiplication of two numbers is :"+(num1*num2));
			break;
		}
		case '/': {
			System.out.println("The division of two numbers is :"+(num1/num2));
			break;
		}
		case '%': {
			System.out.println("The remainder of two numbers is :"+(num1%num2));
			break;
		}
		default:
			System.out.println("Enter a valid operator");
		}

	}

}
