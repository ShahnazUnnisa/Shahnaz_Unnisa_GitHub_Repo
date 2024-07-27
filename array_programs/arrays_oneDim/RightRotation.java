package arrays_oneDim;

public class RightRotation {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int b[]=new int[a.length];
		int k=0;
		int inp=2;
		
		for (int i = b.length-inp; i <b.length; i++) {
			b[k++]=a[i];
		}
		
		for (int i = 0; i < b.length-inp; i++) {
			b[k++]=a[i];
		}
		
		for (int i : b) {
			System.out.println(i);
		}

	}

}
