  package arrays_twoDim;

public class CopyArrayElements {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[a.length][a.length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j]=a[i][j];
			}
		}
		
		for (int[] is : b) {
			for (int is2 : is) {
				System.out.print(is2+"  ");
			}
			System.out.println();
		}
		
		}

	}


