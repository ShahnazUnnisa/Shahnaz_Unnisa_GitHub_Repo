package string_programs;

public class SubString {
	public static void main(String[] args) {
		String str="abcdecedc";
//		for(int i=0;i<str.length();i++) {
//			 for(int j=i;j<str.length();j++) {
//				 for(int k=i;k<=j;k++) {
//					 char ch=str.charAt(k);
//					 System.out.print("{"+ch+"} ");
//				 }
//				 System.out.println();
//			 }
//		}
		
		System.out.println(str.lastIndexOf('c'));
		System.out.println(str.indexOf('c'));
		System.out.println(str.substring(0,2));
		System.out.println(str.indexOf('c', 3));
	}
}
