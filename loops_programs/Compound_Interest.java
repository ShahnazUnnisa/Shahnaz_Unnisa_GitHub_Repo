package loops_programs;

import java.util.Scanner;

//Compound Interest Java Program
public class Compound_Interest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Principal amount..: ");
		long principal=scanner.nextLong();
		
		System.out.print("Enter rate of interest..: ");
		long rate=scanner.nextLong();
		
		System.out.print("Enter time..: ");
		long time=scanner.nextLong();
//		 CI = P * (1 + (R / 100))^T
		System.out.println(Math.pow((1+(rate/100)), time));
		double compound_Interest=principal*Math.pow((1+(rate/100)), time);
		
		System.out.println("The Compound Interest is : "+compound_Interest);

	}

}
