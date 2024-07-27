package arrays_oneDim;

public class LeftRotation {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
		int k=0;
		int s=1;
		
		for (int i = s; i < b.length; i++) {
			b[k++]=a[i];
		}
		
		for (int i = 0; i < s; i++) {
			b[k++]=a[i];
		}
		
		for (int i : b) {
			System.out.println(i);
		}

	}

}
