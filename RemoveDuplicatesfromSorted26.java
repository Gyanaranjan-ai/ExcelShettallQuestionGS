package gs;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesfromSorted26 {
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3,4,4};
		int k=removeDuplicate(nums);
		System.out.println(k);
	}

	private static int removeDuplicate(int[] nums) {
		int k=1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]!=nums[i-1]) {
				nums[k]= nums[i];
				k++;
				System.out.println(nums[k]);
			}
		}
		return k;
		
	}

}
