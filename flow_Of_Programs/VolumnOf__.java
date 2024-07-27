package flow_Of_Programs;

import java.util.Scanner;

public class VolumnOf__ {

	
//	Volume Of Cone Java Program
	public static double VolumeOfCone(double radius,double height) {
		return 3.14*radius*radius*height*(1/3);
	}
//	Volume Of Prism
	public static double VolumeOfPrism(double base,double height) {
		return base*height;
	}
//	Volume Of Cylinder
	public static double VolumeOfCylinder(double radius,double height) {
		return 3.14*radius*radius*height;
	}
//	Volume Of Sphere
	public static double VolumeOfSphere(double radius) {
		return (4/3)*3.14*radius*radius*radius;
	}
//	Volume Of Pyramid
	public static double VolumeOfPyramid(double base,double height) {
		return (1/3)*base*height;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the radius of cone : ");
		double radius=scanner.nextDouble();
		System.out.print("Enter the height of cone : ");
		double height=scanner.nextDouble();
		System.out.println("The volume of a cone is : "+VolumeOfCone(radius ,height));
		
		System.out.print("Enter the base of Prism : ");
		double base=scanner.nextDouble();
		System.out.print("Enter the height of Prism : ");
		double height1=scanner.nextDouble();
		System.out.println("The volume of a Prism is : "+VolumeOfPrism(base ,height1));
		
		System.out.print("Enter the radius of Cylinder : ");
		double radius1=scanner.nextDouble();
		System.out.print("Enter the height of Cylinder : ");
		double height2=scanner.nextDouble();
		System.out.println("The volume of a Cylinder is : "+VolumeOfCylinder(radius1 ,height2));
		
		System.out.print("Enter the radius of Sphere : ");
		double radius2=scanner.nextDouble();
		System.out.println("The volume of a Sphere is : "+VolumeOfSphere(radius2));
		
		System.out.print("Enter the radius of Pyramid : ");
		double base1=scanner.nextDouble();
		System.out.print("Enter the height of Pyramid : ");
		double height3=scanner.nextDouble();
		System.out.println("The volume of a Pyramid is : "+VolumeOfPyramid(base1 ,height));
		
		

	}

}
