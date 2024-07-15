package array_programs;

public class MinOcc {
	public static void main(String[] args) {
		int [] a= {1,2,1,3,2,4,3,2};
		int min=a.length;
		int m=0;
		int max=0;
		int maxEle=0;
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			int c=0;
			for (int j = 0; j < a.length; j++) {
				if(n==a[j]) {
					c++;
				}
			}
			if(min>c) {
				min=c;
				m=a[i];
			}
			if(max<c) {
				max=c;
				maxEle=a[i];
			}
		}
//		System.out.println(min);
//		System.out.println(mo);
//		System.out.println(max);
//		System.out.println(maxEle);
		for (int i = 0; i < a.length; i++) {
			if(a[i]==maxEle) {
				a[i]=200;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
