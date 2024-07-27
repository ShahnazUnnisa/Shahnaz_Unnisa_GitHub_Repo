package arrays_oneDim;

public class LargestElement {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,6,10,25,2};
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i]; 
			}
		}

		System.out.println("The largest value in given array is "+max);
	}

}
