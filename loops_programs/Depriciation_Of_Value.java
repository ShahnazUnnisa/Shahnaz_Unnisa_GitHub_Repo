package loops_programs;

import java.util.Scanner;

//Calculate Depreciation of Value
public class Depriciation_Of_Value {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Cost of an Asset...:");
		int Cost_of_an_Asset=scanner.nextInt();
		
		System.out.print("Enter the Residual Value...:");
		int Residual_Value=scanner.nextInt();
		
		System.out.print("Enter the Useful_life_of_an_Asset...:");
		int Useful_life_of_an_Asset=scanner.nextInt();
		
		double  Depreciation_Method = (Cost_of_an_Asset - Residual_Value)/Useful_life_of_an_Asset;

		System.out.println(Depreciation_Method);
	}

}
