package string_programs;

public class LeftRotation {
	public static void main(String[] args) {
		String str="abcde";
		String res="";
		int inp=3;
		for(int i=inp;i<str.length();i++) {
			char ch=str.charAt(i);
			res=res+ch;
		}
		for(int i=0;i<inp;i++) {
			char ch=str.charAt(i);
			res=res+ch;
		}
		System.out.println(res);
	}
}
