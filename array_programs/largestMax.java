package array_programs;

public class largestMax {
	public static void main(String[] args) {
		int [] a= {1,3,4,2,5,51,0,7,6,51,52};
		
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
