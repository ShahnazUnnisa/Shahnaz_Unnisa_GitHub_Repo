package leetCode;


public class GreatestCommonDivisorOf2Strings {
	public static String rem(String str2) {
		String res="";
		for (int i = 0; i < str2.length(); i++) {
			char ch=str2.charAt(i);
			if(!(res.contains(ch+""))) {
				res=res+ch;
			}
		}
		return res;
	}
	
	public static boolean check(String str1,String str2) {
		
		int l=str2.length();
		for (int i = 0; i < str1.length(); i=i+l) {
			String s=str1.substring(i, i+l);
			if(!(s.equals(str2))) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		String str1="LEET";
		String str2="CODE";
		str2=rem(str2);
		System.out.println(str2);
		
		boolean res=check(str1, str2);
		System.out.println(res);
	}

}
