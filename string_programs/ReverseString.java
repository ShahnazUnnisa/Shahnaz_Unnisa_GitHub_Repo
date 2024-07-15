package string_programs;

public class ReverseString {
	public static void main(String[] args) {
		String str="python";
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			res=res+ch;
		}
		System.out.println(str.contains("p"));
		System.out.println(res);
	}
}
