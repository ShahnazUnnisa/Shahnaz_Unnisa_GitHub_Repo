package flow_Of_Programs;

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class ArmStrongNum {

	public static boolean check(int num) {
		int count=0;
		int c=num;
		int n=num;
		while(n>0) {
			count++;
			n=n/10;
		}
		
		int sum=0;
		while(num>0) {
			int digit=num%10;
			int m=1;
			for (int i = 1; i <= count; i++) {
				m=m*digit;
			}
			sum=sum+m;
			num/=10;
		}
		if(c==sum) {
			return true;
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number1...: ");
		int start = scanner.nextInt();

		System.out.print("Enter the number2...: ");
		int end = scanner.nextInt();

		for (int i = start; i <= end; i++) {
			if (check(i)) {
				System.out.println(i + " is a ArmStrong Number");
			}
		}

	}

}
