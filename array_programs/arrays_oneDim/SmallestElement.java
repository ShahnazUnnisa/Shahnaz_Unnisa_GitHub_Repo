package arrays_oneDim;

public class SmallestElement {

	public static void main(String[] args) {
		
		int a[]= {10,5,15,2,1,6,7,1};
		
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}

		System.out.println("The smallest element in given array is "+min);
	}

}
