package flow_Of_Programs;

import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class SumOfNum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int sum=0;
		while(true) {
			System.out.print("Enter the character..: ");
			String str=scanner.next();
			if(str.equals("X")||str.equals("x")) {
				break;
			}
			else {
				int num=Integer.parseInt(str);
				sum=sum+num;
			}
		}
		System.out.println("The sum of All numbers is :"+sum);

	}

}
