package flow_Of_Programs;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Greeting {

	public static void main(String[] args) {
		Scanner  scanner=new Scanner(System.in);
		
		System.out.print("Enter Your name...: ");
		String name=scanner.nextLine();
		
		System.out.println("Hey!!Hi, Good Morning "+name);

	}

}
