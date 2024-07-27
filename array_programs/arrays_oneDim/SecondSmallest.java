package arrays_oneDim;

public class SecondSmallest {

	public static void main(String[] args) {

		int a[] = { 10, 5, 15, 2, 1, 6, 7, 1, 2, 10, 1, 2, 1, 2, 3, 1 ,5};

		int min = a[0];
		int sec = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				sec = min;
				min = a[i];
			}
		}

		System.out.println("The smallest element in given array is " + min);
		System.out.println("The Second smallest element in given array is " + sec);

	}

}
