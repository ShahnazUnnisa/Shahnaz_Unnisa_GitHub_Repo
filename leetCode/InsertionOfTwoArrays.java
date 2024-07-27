package leetCode;

public class InsertionOfTwoArrays {
	public static boolean rem(int [] arr,int num) {
		
		for (int i : arr) {
			if(i==num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int [] a= {1,2,2,1};
		int [] b= {2,2};
		int [] res=new int[b.length];
		int k=0;
		for (int i : a) {
			for (int j : b) {
				if(i==j) {
					res[k++]=i;
//					System.out.println(i);
					break;
				}
			}
		}
		
		int [] r=new int[res.length];
		int n=0;
		for (int i : res) {
//			System.out.println(i);   
			if(!rem(r, i)) {
				r[n++]=i;
			}
		}
		
		for (int i : r) {
			System.out.println(i);
		}
		
		
	}

}
