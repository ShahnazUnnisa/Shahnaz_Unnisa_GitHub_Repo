package loops_programs;

import java.util.Scanner;

//Calculate Discount Of Product
public class DiscountOnProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the product price...:");
		int price=scanner.nextInt();
		
		System.out.print("Enter the discount price...:");
		int discount=scanner.nextInt();
		int discount_price=(discount*price)/100;
		System.out.println(discount_price);

		int total=price-discount_price;
		
		System.out.println("The total price is : "+total);
	}

}
