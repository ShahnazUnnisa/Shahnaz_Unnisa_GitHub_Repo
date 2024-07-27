package leetCode;

public class Merge2Words {

	public static String merge(String word1, String word2) {
		String res = "";
		if (word1.length() == word2.length()) {
			for (int i = 0; i < word1.length();i++) {
				res = res + word1.charAt(i) + word2.charAt(i);
			}
		}
		if(word1.length()<word2.length()) {
			int j=0;
			for (int i = 0; i < word2.length();i++) {
				while(j<word1.length()) {
					res=res+word1.charAt(j);
					res = res + word2.charAt(i);
					System.out.println(res);
					i++;
					j++;
				}
				res = res + word2.charAt(i);
			}
		}
		if(word1.length()>word2.length()) {
			int j=0;
			for (int i = 0; i < word1.length();i++) {
				while(j<word2.length()) {
					res = res + word1.charAt(i);
					res=res+word2.charAt(j);
					System.out.println(res);
					i++;
					j++;
				}
				res = res + word1.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String word1 = "abcd";
		String word2 = "pq";
		String res = merge(word1, word2);
		System.out.println(res);

	}

}
