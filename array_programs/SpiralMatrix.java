package array_programs;

public class SpiralMatrix {
	public static int[][] spiralMatrix(int size){
		int a[][]=new int[size][size];
		int mov='r';
		int r=0;
		int c=-1;
		for (int i = 1; i <=size*size; i++) {
			switch(mov) {
			case 'r':
			{
				c++;
				a[r][c]=i;
				if(c==size-1||a[r][c+1]!=0) {
					mov='d';
				}
				break;
			}
			case 'd':
			{
				r++;
				a[r][c]=i;
				if(r==size-1||a[r+1][c]!=0) {
					mov='l';
				}
				break;
			}
			case 'l':
			{
				c--;
				a[r][c]=i;
				if(c==0||a[r][c-1]!=0) {
					mov='u';
				}
				break;
			}
			case 'u':
			{
				r--;
				a[r][c]=i;
				if(r==1||a[r-1][c]!=0) {
					mov='r';
				}
				break;
			}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int [][] res=spiralMatrix(5);
		
		for (int[] i : res) {
			for (int j : i) {
				System.out.print  (j+" ");
			}
			System.out.println();
		}
	}
}
