package string_programs;

public class FreqOfString {
	public static String remDub(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!(res.contains(ch+""))) {
				res=res+ch;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		String str="abbccc";
		String res=remDub(str);
		int count=str.length();
		char minchar=' ';
		int count1=0;
		char maxchar=' ';
		for(int i=0;i<res.length();i++) {
			char ch=res.charAt(i);
			int c=0;
			for(int j=0;j<str.length();j++) {
				char ch1=str.charAt(j);
				if(ch==ch1) {
					c++;
				}
			}
			if(c<=count&&minchar!=ch) {
				count=c;
				minchar=ch;
			}
			if(c>=count1&&maxchar!=ch) {
				count1=c;
				maxchar=ch;
			}
			System.out.println(ch+" occurs :"+c);
		}
		System.out.println(count1+" "+maxchar);
		System.out.println(count+" "+minchar);
		System.out.println(res);
	}
}
