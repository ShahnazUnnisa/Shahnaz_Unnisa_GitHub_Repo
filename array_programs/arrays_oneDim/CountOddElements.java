package arrays_oneDim;

public class CountOddElements {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9 };

		int c = 0;
		for (int i : a) {
			if (i % 2 == 1) {
				c++;
			}
		}

		System.out.println(c);
	}

}
