package array_programs;

public class even_elements {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even element");
				System.out.println(a[i]);
			}
			else {
				System.out.println("odd element");
				System.out.println(a[i]);
			}
		}
	}
}
