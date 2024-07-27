package loops_programs;

import java.util.Scanner;

//Calculate Commission Percentage
public class CommissionPersentage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the sale price...:");
		int salePrice=scanner.nextInt();
		
		System.out.print("Enter the commission percentage...:");
		int commissionPercentage=scanner.nextInt();

		int commission_Amount = (salePrice * commissionPercentage) / 100; 
		
		
		System.out.println("The total price is : "+commission_Amount+"%");

	}

}
