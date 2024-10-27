package gs;

import java.util.ArrayList;
import java.util.List;

public class MinInSlidingWindowApproach2 {
	public static List<Integer> findMinSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i <= nums.length - k; i++) {
        	// assuming the first element in the window is the minimum
            int min = nums[i]; 
            
            // Check each element in the window to find the minimum
            for (int j = 1; j < k; j++) {
            	//add one element and check the minimum 
                if (nums[i + j] < min) {
                    min = nums[i + j];
                }
            }
            //in list add the minimum
            result.add(min);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9, 1, 3, -1, 5, 3, 6, 7};
        int k = 3;
        System.out.println(findMinSlidingWindow(nums, k)); // Output: [1, -1, -1, -1, 3, 3]
    }
}
//Time Complexity is O(n)*O(k)=O(n*k);
//Space Complexity is O(n-k+1)


