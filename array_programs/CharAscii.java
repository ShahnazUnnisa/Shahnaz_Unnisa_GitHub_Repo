package array_programs;

import java.util.Scanner;

public class CharAscii {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		
		char [] ch = new char[size];
		
		System.out.println("enter the characters");
		for(int i=0;i<ch.length;i++) {
			ch[i]=scan.next().charAt(0);
		}
		
		System.out.println("----------");
		System.out.println("ASCII values are");
		for (int i=0;i<=ch.length;i++) {
			if(i%2==1) {
				System.out.println(ch[i]+0);
			}
		}
	}
}
