package array_programs;

public class MaxElements {
	public static void main(String[] args) {
		int [][] arr= {{100,122,111,115},{512,321,421,213},{333,388,415,400}};
		int [] max=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int max1=arr[i][0];
			for(int j=0;j<arr[i].length;j++) {	
				if(max1<arr[i][j]) {
					max1=arr[i][j];
				}
			}
			max[i]=max1;
		}
//		for (int i = 0; i < max.length; i++) {
//			System.out.println(max[i ]);
//		}
		for (int k : max) {
			System.out.println(k);
		}
	}
}
