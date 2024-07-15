package string_programs;

public class ToCharArray {
	public static void main(String[] args) {
		String str="shahnaz unnisa";
		char [] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		String [] s=str.split("   ");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		byte [] b=str.getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
