package arrays_twoDim;

import java.util.Scanner;

public class BasicProgram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int size=scanner.nextInt();
		int size1=scanner.nextInt();
		
		int a[][]=new int[size][size1];
		
		System.out.println("Enter Array Elements");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				a[i][j]=scanner.nextInt();
			}
		}
	
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
