package flow_Of_Programs;

import java.util.Scanner;

public class AreaOf___ {

	// Area Of Circle Java Program
	public static double areaOfCircle(double radius) {
		return 3.14 * radius * radius;
	}

	// Area Of Triangle
	public static double areaOfTraingle(double base,double height) {
			return 0.5*base*height;
	}

	// Area Of Rectangle Program
	public static double areaOfRectangle(double length,double width) {
		return length*width;
	}

	// Area Of Isosceles Triangle
	public static double areaOfIsosceles(double base,double height) {
		return 0.5*base*height;
	}

	// Area Of Parallelogram
	public static double areaOfParallelogram(double base,double height) {
		return base*height;
	}

	// Area Of Rhombus
	public static double areaOfRhombus(double base,double height) {
		return base*height;
	}

	// Area Of Equilateral Triangle
	public static double areaOfEquilateral(double side) {
			return 0.44*side*side;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter radius of circle...: ");
		System.out.println("Area Of Circle is :" + areaOfCircle(scanner.nextDouble()));

		System.out.print("Enter base of Traingle...: ");
		double base=scanner.nextDouble();
		System.out.print("Enter height of Traingle...: ");
		double height=scanner.nextDouble();
		System.out.println("Area Of Traingle is :" + areaOfTraingle(base,height));
		
		
		System.out.print("Enter length of Rectangle...: ");
		double length=scanner.nextDouble();
		System.out.print("Enter width of Rectangle...: ");
		double width=scanner.nextDouble();
		System.out.println("Area Of Rectangle is :" + areaOfRectangle(length,width));
		
		
		System.out.print("Enter base of Isosceles...: ");
		double base1=scanner.nextDouble();
		System.out.print("Enter width of Isosceles...: ");
		double height1=scanner.nextDouble();
		System.out.println("Area Of Isosceles is :" + areaOfIsosceles(base1,height1));
		
		System.out.print("Enter base of Parallelogram...: ");
		double base2=scanner.nextDouble();
		System.out.print("Enter width of Parallelogram...: ");
		double height2=scanner.nextDouble();
		System.out.println("Area Of Parallelogram is :" + areaOfParallelogram(base2,height2));
		
		
		System.out.print("Enter base of Rhombus...: ");
		double base3=scanner.nextDouble();
		System.out.print("Enter width of Rhombus...: ");
		double height3=scanner.nextDouble();
		System.out.println("Area Of Rhombus is :" + areaOfRhombus(base3,height3));
		
		
		System.out.print("Enter size of Equilateral...: ");
		System.out.println("Area Of Equilateral is :" + areaOfEquilateral(scanner.nextDouble()));
	}

}
