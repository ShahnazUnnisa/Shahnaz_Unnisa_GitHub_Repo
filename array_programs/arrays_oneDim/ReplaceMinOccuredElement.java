package arrays_oneDim;

public class ReplaceMinOccuredElement {
	
	public static int count(int num,int a[]) {
		int c=0;
		for (int i : a) {
			if(num==i) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		 
		int a[]= {9,2,5,3,4,4,3,3,1,9};
		int maxOcc=0;
		int maxEle=a[0];
		
		for (int i : a) {
			int count=count(i, a);
			if(count>maxOcc) {
				maxOcc=count;
				maxEle=i;
			}
		}
		
		System.out.println(maxEle+"  occurs "+maxOcc);
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==maxEle) {
				a[i]=200;
			}
		}
		for (int i : a) {
			System.out.println(i);
		}

	}

}
