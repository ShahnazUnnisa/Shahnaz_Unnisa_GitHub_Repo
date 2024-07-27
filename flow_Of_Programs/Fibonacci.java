package flow_Of_Programs;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the n value ....: ");
		int n=scanner.nextInt();
		
		int a=0;
		int b=1;
		System.out.print("{ "+a+", ");
		System.out.print(b+", ");
		
		for (int i = 3; i <= n; i++) {
			int c=a+b;
			if(i==n) {
				System.out.print(c+" }");
			}
			else {
			System.out.print(c+", ");
			}
			a=b;
			b=c;
			
		}

	}

}
