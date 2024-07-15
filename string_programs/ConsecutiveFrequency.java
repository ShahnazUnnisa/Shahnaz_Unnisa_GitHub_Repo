package string_programs;

class ConsecutiveFrequency {
	public static String remDup(String str) {
		String res="";
		for (int i = 0; i <str.length(); i++) {
			char ch=str.charAt(i);
			if(!(res.contains(ch+""))) {
				res+=ch;
			}
		}
		return res;
	}
	public static String consFreq(String str,String res) {
		String result="";
		for(int i=0;i<res.length();i++) {
			char ch=res.charAt(i);
			int c=0;
			for(int j=0;j<str.length();j++) {
				char ch1=str.charAt(j);
				if(ch==ch1) {
					c++;
				}
			}
			result=result+ch+c;
		}
		return result;
	}
	public static void main(String[] args) {
		String str="aabbbcccccd";
		String res=remDup(str);
		String fRes=consFreq(str,res);
		System.out.println(fRes);

	}

}
