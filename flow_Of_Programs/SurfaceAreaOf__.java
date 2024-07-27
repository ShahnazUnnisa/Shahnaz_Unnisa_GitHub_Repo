package flow_Of_Programs;

import java.util.Scanner;

public class SurfaceAreaOf__ {

//	Curved Surface Area Of Cylinder
	public static double curvedSurfaceAreaOfCylinder(double radius ,double height) {
		return 2*3.14*radius*height;
	}
//	Total Surface Area Of Cube
	public static double totalSurfaceAreaOfCube(double size) {
		return 6*size*size;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the radius of Cylinder : ");
		double radius=scanner.nextDouble();
		System.out.print("Enter the height of Cylinder : ");
		double height=scanner.nextDouble();
		System.out.println("The volume of a Cylinder is : "+curvedSurfaceAreaOfCylinder(radius ,height));
		
		System.out.print("Enter the size of Cube : ");
		double size=scanner.nextDouble();
		System.out.println("The volume of a Cube is : "+totalSurfaceAreaOfCube(size));
		

	}

}
