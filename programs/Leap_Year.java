package programs;

import java.util.Scanner;

public class Leap_Year {
	public static boolean check(int year) {
		if(year%400==0 || (year%4==0 && year%100 !=0)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		if(check(year)==true) {
			System.out.println(year+" is a Leap Year");
		}else {
			System.out.println(year+" is not a Leap Year");
		}

	}

}
