package string_programs;

public class RemDuplicate {
	public static void main(String[] args) {
		String str="aabbcccdef";
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!(res.contains(ch+""))) {
				res=res+ch;
			}
		}
		System.out.println(res);
	}
}
