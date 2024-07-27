package NumberRecursion;

public class CountDigits {

	public static void main(String[] args) {
		
		int num=123456789;
		System.out.println( count(num, 0));

	}
	
	public static int count(int num,int c) {
		if(num<=0) {
			return c;
		}else {
			c++;
			num=num/10;
		}
		return count(num, c);
	}

}
