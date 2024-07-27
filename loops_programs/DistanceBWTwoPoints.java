package loops_programs;

import java.util.Scanner;

//Calculate Distance Between Two Points
public class DistanceBWTwoPoints {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the x1...:");
		int x1=scanner.nextInt();
		System.out.print("Enter the y1...:");
		int y1=scanner.nextInt();

		System.out.print("Enter the x2...:");
		int x2=scanner.nextInt();
		System.out.print("Enter the y2...:");
		int y2=scanner.nextInt();
		
		int m=(x2-x1);
		int n=(y2-y1);
		
		double dist=Math.sqrt((m*m)+(n*n));
		
		System.out.println("The distance between two points is :"+dist);

	}

}
