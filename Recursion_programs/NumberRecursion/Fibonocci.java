package NumberRecursion;

public class Fibonocci {

	public static void main(String[] args) {

		System.out.println(0);
		System.out.println(1);
		fib(0, 1, 5);

	}

	public static void fib(int a, int b, int count) {
		if (count <= 0) {
			return;
		} else {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			count--;
		}
		fib(a, b, count);
	}

}
