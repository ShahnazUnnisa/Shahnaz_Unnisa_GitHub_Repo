package string_programs;

public class PrimeIndexCharacter {
	public static void main(String[] args) {
		String str="JSPIDER";
		for(int i=0;i<str.length();i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(str.charAt(i));
			}
		}
	
	}
}
