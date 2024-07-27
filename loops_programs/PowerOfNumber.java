package loops_programs;

import java.util.Scanner;

//Power In Java
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number...:");
		int num=scanner.nextInt();
		
		System.out.print("Enter the power...:");
		int pow=scanner.nextInt();
		int p=pow;
		int res=1;
		while(pow>0) {
			res*=num;
			pow--;
		}
		System.out.println(num+" to the power of "+p+" is :"+res);

	}

}
