package Recursion_programs;

public class SumOfNatural {
	public static void main(String[] args) {
		System.out.println(printSum(1,5,0));
	}
	public static int printSum(int i,int n,int sum) {
		if(i>n) {
			return sum;
		}
		else {
			sum=sum+i;
		}
		return printSum(++i,n,sum);
	}
}
