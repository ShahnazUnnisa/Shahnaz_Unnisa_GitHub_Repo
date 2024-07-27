package programs;

import java.util.Arrays;

public class FlippingAndInvertedImage {
	public static int[][] flipping(int[][] arr) {
		int[][] temp = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			int col = arr.length - 1;
			for (int j = 0; j < arr[i].length; j++) {
				temp[i][col] = arr[i][j];
				col--;
			}
		}
		return temp;
	}

	public static int[][] flipAndInvertImage(int[][] image) {
		int[][] temp = flipping(image);
		int[][] arr = new int[temp.length][temp.length];

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				if (temp[i][j] == 1) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = 1;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] image= {{1,1,0},{1,0,1},{0,0,0}};
		
		int[][] res=flipAndInvertImage(image);
		
//		for(int i=0;i<res.length;i++) {
//			for(int j=0;j<res[i].length;j++) {
//				System.out.println(res[i][j]);
//			}
//		}

		for (int[] is : res) {
			System.out.println(Arrays.toString(is));
		}
	}

}
