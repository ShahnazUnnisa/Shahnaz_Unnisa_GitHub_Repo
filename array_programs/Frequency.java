package array_programs;

public class Frequency {
	public static void main(String[] args) {
		int [] a= {1,1,2,2,1};
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			int c=0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]==n) {
					c++;
				}
			}
			System.out.println(a[i]+" occurs in a "+c+" times");
		}
	}
}
