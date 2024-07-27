package flow_Of_Programs;

import java.util.Scanner;

//Input a year and find whether it is a leap year or not.
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the Year..... :");
		int year=scanner.nextInt();
		
		if(year%4==0&&year%100!=0 ||year%400==0) {
			System.out.println(year+" is a Leap Year");
		}else {
			System.out.println(year+" is not a Leap Year");
		}

	}

}
