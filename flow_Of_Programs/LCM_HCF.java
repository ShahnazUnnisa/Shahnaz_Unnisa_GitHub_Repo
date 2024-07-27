package flow_Of_Programs;

import java.util.Scanner;

//Take 2 numbers as inputs and find their HCF and LCM.
public class LCM_HCF {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the num1...: ");
		int num1=scanner.nextInt();
		
		System.out.print("Enter the num2...: ");
		int num2=scanner.nextInt();
		
		for (int i = 1; ; i++) {
			if(i%num1==0 && i%num2==0) {
				System.out.println("The LCM of two numbers is :"+i);
				break;
			}
		}
		int hcf=1;
		for (int i = 2; i <=num1 &&i<=num2; i++) {
			if(num1%i==0 && num2%i==0) {
				hcf=i;
			}
		}
		
		System.out.println("The HCF of two numbers is :"+hcf);

	}

}
