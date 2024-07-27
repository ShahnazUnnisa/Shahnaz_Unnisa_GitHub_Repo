package arrays_oneDim;

public class MaximumOccurance {
	public static boolean check(int num,int b[]) {
		
		for (int i : b) {
			if(num==i) {
				return true;
			}
		}
		return false;
	}
	
	public static int count(int num,int a[]) {
		
		int c=0;
		
		for (int i = 0; i < a.length; i++) {
			if(num==a[i]) {
				c++;
			}
		}
		return c;
		
	}

	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,3,3,2,5,5,5,5,6 };
		
		int b[]=new int[a.length];
		int k=0;
		
		for (int i : a) {
			if(check(i, b)==false) {
				b[k++]=i;
			}
		}
		int maxele=a[0];
		int maxocc=0;
		
		for (int i : b) {
			if(i!=0) {
				int count=count(i, a);
				if(count>maxocc) {
					maxocc=count;
					maxele=i;
				}
			}
		}
		
		System.out.println(maxele+" is occured maximun "+maxocc);

	}

}
