package array_programs;

public class TransposeMatrix {
	public static void main(String[] args) {
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		
		for (int[] num : a) {
			for (int n : num) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				//if(i==j) { -->for diagonal elements
//				System.out.print(a[j][i]+" ");
//				//}
//			}
//			System.out.println();
//		}
		
		
	}
}
