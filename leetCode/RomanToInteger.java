package leetCode;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> roman=new HashMap<Character, Integer>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		
		String inp="VII";
		int res=0;
		int prev=0;
		
		for(int i=inp.length()-1;i>=0;i--) {
			int curr=roman.get(inp.charAt(i));
			System.out.println(curr);
			if(curr<prev) {
				res=res-curr;
			}
			else {
				res+=curr;
			}
			prev=curr;
		}
		
			System.out.println(res);
	}

}
