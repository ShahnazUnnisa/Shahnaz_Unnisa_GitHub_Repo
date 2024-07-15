package string_programs;

public class StringAnagram {
	public static boolean isAnagram(String str1,String str2) {
		while(str1!=""&&str2!=""||str1.length()!=0) {
			char ch=str1.charAt(0);
			str1=str1.replace(ch+"","");
			str2=str2.replace(ch+"","");	
		}
		if(str1==""&&str2=="") {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String str1="mom";
		String str2="mam";
		if(isAnagram(str1,str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("not an Anagram");
		}
	}
}
