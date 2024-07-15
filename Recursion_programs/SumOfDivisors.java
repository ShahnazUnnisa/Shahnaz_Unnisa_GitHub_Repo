package Recursion_programs;

public class SumOfDivisors {

	public static void main(String[] args) {
		int num=6;
		int sum=0;
		int i=1;
		System.out.println(sum(num,i,sum));
	}
	public static int sum(int n,int i,int sum) {
		if(i>n) {
			return sum;
		}
		else if(n%i==0) {
			sum+=i;
		}
		return sum(n,++i,sum);
	}
}
