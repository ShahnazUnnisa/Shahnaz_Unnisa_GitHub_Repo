package Oops;

public class Method_Overloading {
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static int add(int a,Double c,int b) {
		return (int) (a+b+c);
	}

	public static void main(String[] args) {
			System.out.println(add(5, 5.5 , 4));
	}

}
