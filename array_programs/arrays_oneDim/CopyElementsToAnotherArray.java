package arrays_oneDim;

import java.util.Arrays;

public class CopyElementsToAnotherArray {

	public static void main(String[] args) {
		
		
		int a[]= {10,2,3,4,5};
		int b[]=new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
			
		}
		
		
		for (int i : b) {
			System.out.println(i);
		}

	}

}
