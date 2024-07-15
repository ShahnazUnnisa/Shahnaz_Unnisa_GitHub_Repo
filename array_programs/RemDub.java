package array_programs;

public class RemDub {
	public static void main(String[] args) {
		int [] a= {1,2,1,1,3,4,1,2};
		int [] b=new int[a.length];
		int k=0;
		
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			if(!dub(b,n)) {
				b[k++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		} 
	}
	public static boolean dub(int [] b,int n) {
		for (int i = 0; i < b.length; i++) {
			int j=b[i];
			if(n==j) {
				return true;
			}
		}
		return false;
	}
}
