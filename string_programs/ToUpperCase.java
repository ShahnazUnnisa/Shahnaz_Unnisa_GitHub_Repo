package string_programs;

public class ToUpperCase {
	public static void main(String[] args) {
		String str="Java";
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90) {
				ch+=32;
			}
			res=res+ch;
		}
//		str=str.toUpperCase();
		System.out.println(res);
	}
}
