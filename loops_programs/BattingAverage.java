package loops_programs;

import java.util.Scanner;

//Calculate Batting Average
public class BattingAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Runs Scored...:");
		int runs=scanner.nextInt();
		
		System.out.print("Enter the no of times out...:");
		int out=scanner.nextInt();
		
		double batting_Average=runs/out;
		
		System.out.println("The batting average is :"+batting_Average);

	}

}
