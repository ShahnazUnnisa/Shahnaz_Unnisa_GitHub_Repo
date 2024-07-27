package arrays_oneDim;

public class SecondLargestValue {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,6,10,25,24,50,45,23,50,49};
		int max=a[0];   
		int sec=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				sec=max;
				max=a[i];
			}
			else if(sec<a[i]&&a[i]<max) {
				sec=a[i];
			}
		}

		System.out.println("The largest value in given array is "+max);
		System.out.println("The Second largest value in given array is "+sec);


	}

}
