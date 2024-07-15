package array_programs;

public class RightRotation {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int [] b=new int[a.length];
		int k=0;
		int ip=2;
		for (int i = a.length-ip; i < a.length; i++) {
			b[k++]=a[i];
		}
		
		for (int i = 0; i <=ip; i++) {
			b[k++]=a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
