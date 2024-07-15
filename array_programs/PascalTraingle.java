package array_programs;

public class PascalTraingle {
	public static void main(String[] args) {
		int [][] a=pascal(5);
		int spaces=4;
		
		for (int[] is : a) {
			for(int i=0;i<=spaces;i++);
			for (int is2 : is) {
				System.out.print(   is2+" ");
			}
			spaces--;
			System.out.println();
		}
	}
	public static int[][] pascal(int size){
		int [][] a=new int[size][];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=new int[i+1];
			for (int j = 0; j < a[i].length; j++) {
				if(j==0||i==j) {
					a[i][j]=1;
				}
				else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		return a;
	}
}
