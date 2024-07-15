package Recursion_programs;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(fact(5,1));
	}
	public static int fact(int n,int prod) {
		if(n<1) {
			return prod;
		}
		else {
			prod=prod*n;
		}
		return fact(--n,prod);
	}
}
