package arrays_oneDim;

public class RemoveDuplicate {

	public static boolean check(int num, int b[]) {

		for (int i = 0; i < b.length; i++) {
			if (num == b[i]) {
				return true;
			}
		}
		return false;

	}

	public static int count(int num, int a[]) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {

		int a[] = { 1,1,1, 2, 2,3,3,7, 5, 5 };

		int b[] = new int[a.length];

		int k = 0;
		for (int i = 0; i < a.length; i++) {

			if (check(a[i], b) == false) {
				b[k++] = a[i];
			}
		}

		for (int i : b) {
			if (i != 0) {
				int c = count(i, a);
				System.out.println(i + " occurs  " + c);
			}
		}
		System.out.println("**  minimum occured element **");

		int count = b.length;
		int minele=b[0];
		for (int i : b) {
			if (i != 0) {
				int c = count(i, a);
				if (count >= c) {
					count = c;
					minele=i;
				}
			}
			
		}
		System.out.println(minele+" is minimum occured  "+count);
	}

}
