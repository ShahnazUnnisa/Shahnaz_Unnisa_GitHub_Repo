package arrays_twoDim;

public class MaxEleInRow {

	public static void main(String[] args) {
		
		int a[][]= {{100,122,111,115},{512,321,421,213},{333,388,415,400}};
		
		int []max=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
		int ele=a[i][0];
			for (int j = 0; j < a[i].length; j++) {
				int n=a[i][j];
				if(ele<n) {
					ele=n;
				}
			}
			max[i]=ele;
		}
		
		for (int i : max) {
			System.out.println(i);
		}

	}

}
