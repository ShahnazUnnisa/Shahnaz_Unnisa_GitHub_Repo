package loops_programs;

import java.util.Scanner;

//Java Program Vowel Or Consonant
public class Consonant_Vowel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the character...: ");
		char ch=scanner.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.print("The given character is a vowel");
		}else {
			System.out.print("The given character is an consonant");
		}
	}

}
