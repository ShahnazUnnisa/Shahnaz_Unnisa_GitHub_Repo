package array_programs;

public class Prime {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9,10};
		
		int [] b= new int[a.length];
		
		
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				b[i]=a[i];
				System.out.println(b[i]);
			}
		}
	
	}
	public static boolean isPrime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}
}
