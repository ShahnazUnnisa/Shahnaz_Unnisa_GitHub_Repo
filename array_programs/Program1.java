package array_programs;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		
		int size=scan.nextInt();
		char [] ch= new char[size];
		
		System.out.println("Enter the elements into array");
		for (int i=0;i<ch.length;i++) {
			ch[i]=scan.next().charAt(0);
		}
		System.out.println("Enter the array elements");
		for (int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		
	}
}
