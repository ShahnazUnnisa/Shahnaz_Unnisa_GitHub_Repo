package array_programs;

public class SecMin {
	public static void main(String[] args) {
		int [] a= {1,1,1,2,2,2,3,3,3};
		
		int min=a[0];
		int secMin=a[0];
		
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			if(min>n) {
				secMin=min;
				min=n;
			}
//			else if(min==n||secMin>n) {
//				if(n!=secMin) {
//					secMin=n;
//				}
//			}
			else if(n<secMin||secMin==min) {
				secMin=n;
			}
		}
		System.out.println(secMin);
		System.out.println(min);
	}
}
