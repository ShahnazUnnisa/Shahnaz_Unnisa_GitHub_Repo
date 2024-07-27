package arrays_twoDim;

public class TranposeMatrix {

	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		int k=1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=k++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[j][i]+"  ");
			}
			System.out.println();
		}
	}

}
