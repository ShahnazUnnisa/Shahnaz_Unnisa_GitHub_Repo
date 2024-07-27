package Methods_Programs;

public class Program5 {
	public static boolean isPrime(int num) {
		int c=0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}
	public static boolean even(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		if(isPrime(4)) {
			System.out.println("The given number is a prime number");
		}
		else {
			System.out.println("The given number is not a prime number");
		}
		for(int i=1;i<=10 ;i++) {
			System.out.println(even(i));
		}
	}
}
