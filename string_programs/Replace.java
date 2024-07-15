package string_programs;

public class Replace {
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
		String str="aabbccc";
		String res=remDub(str);
		int c=0;
		int minocc=str.length();
		char minchar=' ';
		int maxocc=0;
		char maxchar=' ';
//		System.out.println(res);
		for(int i=0;i<res.length();i++) {
			char ch=res.charAt(i);
			for(int j=0;j<str.length();j++) {
				char ch1=str.charAt(j);
					if(ch==ch1) {
						c++;
					}
			}
			if(minocc>=c&&minchar!=ch) {
				minchar=ch;
				minocc=c;
			}
			if(maxocc<=c&&maxchar!=ch) {
				maxchar=ch;
				maxocc=c;
			}
		}
		str=str.replace(minchar, '$');
		str=str.replace(maxchar, '@');
//		System.out.println(minchar+" occurs : "+minocc);
		System.out.println(str);
	}
}
