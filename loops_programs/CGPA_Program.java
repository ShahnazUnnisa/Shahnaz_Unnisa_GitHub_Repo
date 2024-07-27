package loops_programs;

import java.util.Scanner;

//Calculate CGPA Java Program
public class CGPA_Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double eng,hindi,tel,maths,social,science;
		
		System.out.print("Enter english CGPA..: ");
		eng=scanner.nextDouble();
		
		System.out.print("Enter Hindi CGPA..: ");
		hindi=scanner.nextDouble();
		
		System.out.print("Enter Telugu CGPA..: ");
		tel=scanner.nextDouble();
		
		System.out.print("Enter Maths CGPA..: ");
		maths=scanner.nextDouble();
		
		System.out.print("Enter Social CGPA..: ");
		social=scanner.nextDouble();
		
		System.out.print("Enter Science CGPA..: ");
		science=scanner.nextDouble();
		
		double CGPA=(eng+tel+hindi+maths+social+science)/5;
		
		System.out.println("The CGPA is : "+CGPA);

	}

}
