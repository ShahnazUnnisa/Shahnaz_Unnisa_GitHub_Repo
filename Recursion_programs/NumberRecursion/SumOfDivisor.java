package NumberRecursion;

public class SumOfDivisor {

	public static void main(String[] args) {
		int num=7;
		
		System.out.println(div(num, 1, 0));
		

	}
	
	public static int div(int num,int i,int sum) {
		if(i>num) {
			return sum;
		}else {
			if(num%i==0) {
				sum=sum+i;
			}
			i++;
		}
		return div(num, i, sum);
	}

}
