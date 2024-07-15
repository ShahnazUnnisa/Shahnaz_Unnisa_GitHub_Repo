package array_programs;

public class Present {
	public static void main(String[] args) {
		int [] a= {1,2,3};
		int [] b= {2,1,4};
		
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			for (int j = 0; j < b.length; j++) {
				if(n==b[j]) {
					System.out.println(b[j]);
				}
			}
		}
	}
}
