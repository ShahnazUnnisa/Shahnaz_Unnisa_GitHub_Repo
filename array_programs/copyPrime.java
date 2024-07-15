package array_programs;

public class copyPrime {
	
	public static boolean isPrime(int num){
		int c=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	
	}
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9,10,51,43};
		
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
}
