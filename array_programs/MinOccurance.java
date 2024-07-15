package array_programs;

import object_class_programs.Main2;

public class MinOccurance {
//	public static boolean remDup(int [] a,int ele) {
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==ele) {
//				return true;
//			}
//		}
//		return false;
//	}
	public static int minOcc(int []a ,int ele) {
		int min=14;
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				c++;
			}
		}
		if(c<min) {
			min=c;
		}
		return min;
	}
	public static void main(String [] args) {
		int [] a= {1,1,2,2,3,3,4,5,5};
//		int [] b=new int[a.length];
//		int [] count=new int[a.length];
	
//		for(int i=0;i<a.length;i++) {
//			int ele=a[i];
//			if(!(remDup(a,ele))) {
//				b[i]=a[i];
//				System.out.println(b[i]);
//			}
//		}
		int min=0;
		for(int j=0;j<a.length;j++) {
			int ele=a[j];
			min=minOcc(a,ele);
			System.out.println(a[j]);
		}
			System.out.println(min);
	}
}
