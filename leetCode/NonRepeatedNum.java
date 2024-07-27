package leetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NonRepeatedNum {
	
	public static void singleNum(List<Integer> list) {
		
//		Iterator<Integer> iterator=list.iterator();
//		
//		while(iterator.hasNext()) {
//			int num=iterator.next();
//			
//		}
		
		Object[] arr=list.toArray();
		
		for (Object object : arr) {
			int c=0;
			for (Object object2 : arr) {
				if(object==object2) {
					c++;
				}
			}
			if(c==1) {
				System.out.println(object);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
//		int [] a= {1};
//		
//		int num=0;
//		for (int i = 0; i < a.length; i++) {
//			int curr=a[i];
//			int c=0;
//			for (int j = 0; j < a.length; j++) {
//				int ele=a[j];
//				if(curr==ele) {
//					c++;
//				}
//			}
//			if(c==1) {
//				System.out.println(curr);
//			}
//		}
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		
		singleNum(list);
//		System.out.println(res);
		
	}

}
