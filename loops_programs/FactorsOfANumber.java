package loops_programs;

import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class FactorsOfANumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the number..: ");
		int num=scanner.nextInt();
		
		System.out.print("{ ");
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				if(num==i) {
					System.out.print(i+" }");
				}else {
				System.out.print(i+" , ");
				}
			}
		}
		

	}

}
