package Methods_Programs;

public class CheckStrong {
	public static boolean isStrong(int num) {
		
		int n=num;
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			int p=1;
			for(int i=1;i<=digit;i++) {
				p=p*i;
			}
			sum=sum+p;
			num/=10;
		}
		if(n==sum) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int num=143;
		if(isStrong(num)) {
			System.out.println("given number is Strong");
		}
		else {
			System.out.println("given number not a is Strong");
		}
	}
}
