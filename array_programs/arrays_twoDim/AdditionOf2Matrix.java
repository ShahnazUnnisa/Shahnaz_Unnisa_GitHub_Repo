package arrays_twoDim;

public class AdditionOf2Matrix {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int c[][]=new int[a.length][a.length];
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for (int[] is : c) {
			for (int is2 : is) {
				System.out.print(is2+"   ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j) {
					System.out.println(a[i][j]);
				}
			}
		}

	}

}