package array_programs;

import java.util.Scanner;
public class Arithmetic2D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [][] a=new int [3][3];
		int [][] b=a;
		int [][] c=new int[3][3];
		
		System.out.println("Enter an array elements");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=scan.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
