package Recursion_programs;

public class NoOfDigits {

	public static void main(String[] args) {
		int num=123456789;
		int c=0;
		System.out.println(count(num,c));
	}
	public static int count(int n,int c) {
		if(n<=0) {
			return c;
		}
		else {
			c++;
		}
		n/=10;
		return count(n,c);
	}
}
