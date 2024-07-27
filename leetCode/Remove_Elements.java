package leetCode;

public class Remove_Elements {
	 public static int removeElement(int[] nums, int val) {
	        int arr[]=new int[nums.length];
	        int k=0;
	        for (int i : nums) {
				if(i!=val) {
					
					arr[k++]=i;
//					System.out.println(i);
				}
			}
	        for (int i : arr) {
//				System.out.println(i);
			}
	        nums=arr;
	        for (int i = 0; i < nums.length; i++) {
				if(nums[i]==0) {
					nums[i]=val;
				}
			}
	        for (int i : nums) {
				System.out.println(i);
			}
	        return k;
	    }

	public static void main(String[] args) {
		int [] nums= {3,2,2,3};
		int val=3;
		int res=removeElement(nums, val);
		System.out.println(res);

	}

}
