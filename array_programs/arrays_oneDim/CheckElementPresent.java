package arrays_oneDim;

public class CheckElementPresent {
	
	public static  boolean check(int num, int b[]) {
		
		for (int i = 0; i < b.length; i++) {
			if(num==b[i]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		
		int a[]= {1,3,5,7,9,2,8,5};
		
		int b[]= {2,4,6,5,8,2,8};
		
		for (int i = 0; i < a.length; i++) {
			if(check(a[i], b)) {
				System.out.println(a[i]+" is present in both arrays");
			}
		}

	}

}
