package flow_Of_Programs;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class StringPalindrome {
	public static boolean Check(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			char ch=str.charAt(i);
			char ch1=str.charAt(j);
			if(ch!=ch1) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the String...: ");
		String str=scanner.next();
		
		if(Check(str)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str+" is not a palindrome");
		}
		
		
		

	}

}
