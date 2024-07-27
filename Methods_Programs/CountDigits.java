package Methods_Programs;

public class CountDigits {
	public static int count(int num) {
		int c=0;
		while(num!=0) {
			c++;
			num/=10;
		}
		return c;
	}
	public static void main(String[] args) {
		int num=1234567789;
		int count=count(num);
		System.out.println(count);
	}
}
