package Recursion_programs;

public class Prime {

	public static void main(String[] args) {
		int num=24;
		int c=0;
		int i=1;
		if(prime(num,i,c)==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
	}
	public static int prime(int n,int i,int c) {
		if(i>n) {
			return c;
		}
		else if(n%i==0) {
			c++;
		}
		return prime(n,++i,c);
	}
}
