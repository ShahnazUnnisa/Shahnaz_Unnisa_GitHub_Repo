package string_programs;

public class RightRotation {
	public static void main(String[] args) {
		String str="abcde";
		String res="";
		int inp=2;
		for(int i=str.length()-inp;i<str.length();i++) {
			char ch=str.charAt(i);
			res+=ch;
		}
		for(int i=0;i<=inp;i++) {
			char ch=str.charAt(i);
			res+=ch;
		}
		System.out.println(res);
	}
}
