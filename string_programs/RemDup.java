package string_programs;

public class RemDup {
	public static void main(String[] args) {
		String str1="Madam";
		String str2="madam";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char [] ch1=str1.toCharArray();
		char [] ch2=str2.toCharArray();
		for (int j = 0; j < ch1.length; j++) {
		for (int i = 0; i < str1.length()-1; i++) {
			if((ch1[i]+0)>(ch1[i+1]+0)) {
				char temp=ch1[i];
				ch1[i]=ch1[i+1];
				ch1[i+1]=temp;
			}
		}
		}
		for (int j = 0; j < ch2.length; j++) {
			for (int i = 0; i < str2.length()-1; i++) {
				if((ch2[i]+0)>(ch2[i+1]+0)) {
					char temp=ch2[i];
					ch2[i]=ch2[i+1];
					ch2[i+1]=temp;
				}
			}
			}
		String s=new String(ch1);
		String s1=new String(ch2);
		if(str1.length()==str2.length()) {
			if(s.equals(s1)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("not an anagram");
			}
		}
		else {
			System.out.println("not an anagram");
		}
	}
}
