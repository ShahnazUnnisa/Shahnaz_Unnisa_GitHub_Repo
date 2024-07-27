package flow_Of_Programs;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Currency {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the Indian Rupees...:");
		double rupee=scanner.nextDouble();
		
		double USD=0.011963*rupee;
		
		
		System.out.println(rupee+" Rupee in USD is "+USD);
		
		

	}

}
