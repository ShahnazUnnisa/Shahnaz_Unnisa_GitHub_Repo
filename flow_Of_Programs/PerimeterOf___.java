package flow_Of_Programs;

import java.util.Scanner;

public class PerimeterOf___ {
	
//	Perimeter Of Circle
	public static double PerimeterOfCircle(double radius) {
		return 2*3.14*radius;
	}
//	Perimeter Of Equilateral Triangle
	public static double perimeterOfEquilateralTraingle(double size) {
		return 3*size;
	}
//	Perimeter Of Parallelogram
	public static double perimeterOfParallelogram(double size ,double base) {
		return 2*(size+base);
	}
//	Perimeter Of Rectangle
	public static double perimeterOfRectangle(double length,double width) {
		return 2*(length+width);
	}
//	Perimeter Of Square
	public static double perimeterOfSquare(double size) {
		return 4*size;
	}
//	Perimeter Of Rhombus
	public static double perimeterOfRhombhus(double size) {
		return 4*size;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the radius of circle : ");
		System.out.println("The Perimeter of a circle is : "+PerimeterOfCircle(scanner.nextDouble()));
		
		System.out.print("Enter the size of Equilateral : ");
		System.out.println("The Perimeter of a Equilateral is : "+perimeterOfEquilateralTraingle(scanner.nextDouble()));
		
		System.out.print("Enter the size of Square : ");
		System.out.println("The Perimeter of a Square is : "+perimeterOfSquare(scanner.nextDouble()));
		
		System.out.print("Enter the size of Rhombus : ");
		System.out.println("The Perimeter of a Rhombus is : "+perimeterOfRhombhus(scanner.nextDouble()));
		
		System.out.print("Enter the size of Parallelogram : ");
		double size=scanner.nextDouble();
		System.out.print("Enter the base of Parallelogram : ");
		double base=scanner.nextDouble();
		System.out.println("The Perimeter of a Parallelogram is : "+perimeterOfParallelogram(size ,base));
		
		System.out.print("Enter the length of Rectangle : ");
		double length=scanner.nextDouble();
		System.out.print("Enter the width of Rectangle : ");
		double width=scanner.nextDouble();
		System.out.println("The Perimeter of a Rectangle is : "+perimeterOfRectangle(length ,width));
		
		
	}

}
