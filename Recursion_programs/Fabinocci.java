package Recursion_programs;

public class Fabinocci {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		fib(0,1,5);
	}
	public static void fib(int i,int j,int c) {
		if(c<1) {
			return;
		}
		else {
			int next=i+j;
			System.out.println(next);
			--c;
		}
		fib(j,i+j,c);
	}
}
