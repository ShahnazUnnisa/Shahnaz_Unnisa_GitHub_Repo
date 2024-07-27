package arrays_oneDim;

public class PrimeInArray {

	public static boolean isPrime(int num) {
		int c = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int a[] = { 2, 5, 3, 9, 7, 10 };
		
		int prime[] =new int[a.length];
		int k=0;
		

		for (int i = 0; i < a.length; i++) {
			int ele = a[i];
			if(isPrime(ele)) {
				System.out.println(ele+" is a prime number");
				prime[k++]=ele;
			}
		}
		System.out.println("**prime array**");
		for (int i : prime) {
			System.out.println(i);
		}
	}

}
