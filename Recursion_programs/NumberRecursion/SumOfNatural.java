package NumberRecursion;

public class SumOfNatural {

	public static void main(String[] args) {
		int sum=0;
		int res=sum(0, 15, sum);
		System.out.println(res);
		

	}
	
	public static int sum(int s,int e,int sum) {
	if(s>e) {
		return sum;
	}else {
		sum=sum+s;
		s++;
	}
	return	sum(s, e, sum);
	}

}
