package NumberRecursion;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(fact(6, 1));

	}
	
	public static int fact(int n,int fact) {
		
		if(n<=0) {
			return fact;
		}else {
			fact=fact*n;
			n--;
		}
		return fact(n, fact);
	}

}
