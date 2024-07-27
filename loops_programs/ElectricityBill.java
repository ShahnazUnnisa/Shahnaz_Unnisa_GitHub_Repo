package loops_programs;

import java.util.Scanner;

//Calculate Electricity Bill
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Electricity Consumption...:");
		int Consumption = scanner.nextInt();
		
		System.out.print("Enter the tariff rate per unit...:");
		int rate = scanner.nextInt();
		
		System.out.println("Electricity cost :"+(Consumption*rate));
	}

}
