package leetCode;

public class WordPattern {

	public static void main(String[] args) {
		String str2 = "abba";
		String str1 = "dog cat cat dog";
		char ch1[] = str2.toCharArray();
		String str[] = str1.split(" ");
		for (int i = 0; i < ch1.length; i++) {
			char ch = ch1[i];
			String s = str[i];
			String r = ch + s;
//				System.out.println(r);
			for (int j = i + 1; j < ch1.length; j++) {
				char c = ch1[j];
				if (ch == c) {
					String cur=c+str[j];
					System.out.println(cur);
				}
			}
		}
	}
}
