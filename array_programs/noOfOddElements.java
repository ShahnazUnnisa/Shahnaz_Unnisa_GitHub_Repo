package array_programs;

public class noOfOddElements {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9,10};
		int c=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				c++;
			}
		}
		System.out.println(c);
	}
}
