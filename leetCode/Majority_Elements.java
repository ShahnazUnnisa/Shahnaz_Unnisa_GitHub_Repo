package leetCode;

public class Majority_Elements {
	public static int majorityElement(int[] nums) {
		
		for (int i : nums) {
			int c=0;
			for (int j :nums) {
				if(i==j) {
					c++;
				}
			}
			if(c>nums.length/2) {
				return i;
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		int [] nums= {8,8,7,7,7};
		int res=majorityElement(nums);
		System.out.println(res);
		System.out.println(nums.length);
	}

}
