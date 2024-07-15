package string_programs;

public class Palindrome {
//	public static void main(String[] args) {
//		String str="madam";
//		String res="";
//		for(int i=str.length()-1;i>=0;i--) {
//			res+=str.charAt(i);
//		}
////		System.out.println(res);
//		if(str.equals(res)) {
////		if(str==res) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
//	}
	public static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			char ch1=str.charAt(i);
			char ch2=str.charAt(j);
			if(ch1!=ch2) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String str="madaam";
		
		if(isPalindrome(str)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}
}
