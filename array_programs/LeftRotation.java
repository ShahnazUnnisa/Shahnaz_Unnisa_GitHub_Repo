package array_programs;

public class LeftRotation {
		public static void main(String[] args) {
			int [] a= {1,2,3,4,5};
			int [] b=new int[a.length];
			int ip=2;
			int k=0;
			for (int i = ip; i < a.length; i++) {
				b[k++]=a[i];
			}
			for (int i = 0; i < ip; i++) {
				b[k++]=a[i];
			}
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}
}
  