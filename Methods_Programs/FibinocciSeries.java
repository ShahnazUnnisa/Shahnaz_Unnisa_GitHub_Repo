package Methods_Programs;

public class FibinocciSeries {
	public static void print(int c1) {
		System.out.println(0);
		System.out.println(1);
		int a=0;
		int b=1;
		while(c1!=0) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			c1--;
		}
	}
	public static void main(String[] args) {
		int c1=5;
		print(c1);
	}
}
