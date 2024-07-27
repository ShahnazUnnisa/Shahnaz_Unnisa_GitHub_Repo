package loops_programs;

import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
public class Diff_Prod_SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.print("Enter the number...: ");
		int n=scanner.nextInt();
		
		
		  int sum=0;
	        int prod=1;
	        while(n>0){
	            int digit=n%10;
	            sum+=digit;
	            prod*=digit;
	            n/=10;
	        }
	       System.out.println("The difference between product and sum of digits is : "+(prod-sum));

	}

}
