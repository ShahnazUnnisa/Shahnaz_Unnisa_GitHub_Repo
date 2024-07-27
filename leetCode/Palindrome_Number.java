package leetCode;

public class Palindrome_Number {
	public static boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		int n = 0;
		int u = 1;
		int num=x;
			while (x != 0) {
				int i = x % 10;
				int res = i * u;
				n = n + res;
				u = u * 10;
				x /= 10;
				System.out.println(x+"    "+n);
			}
			if (num == n) {
				System.out.println(num +"  "+n);
				return true;
			}
		return false;
	}

	public static void main(String[] args) {
		int x = 10;
		boolean res = isPalindrome(x);
		System.out.println(res);

	}

}
