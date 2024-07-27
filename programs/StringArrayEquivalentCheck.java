package programs;

import java.util.Arrays;

public class StringArrayEquivalentCheck {
	

	public static void main(String[] args) {
		
		String[] word1={"ab","c"};
		String[] word2={"a","bc"};
		String str1=Arrays.toString(word1);
        String str2=Arrays.toString(word2);

        System.out.println(str1+"  "+str2);
	}

}
