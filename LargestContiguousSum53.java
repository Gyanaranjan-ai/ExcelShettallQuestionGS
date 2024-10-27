package gs;

public class LargestContiguousSum53 {
    public static void main(String[] args) {
        // Initializing an array with both positive and negative numbers.
        int x[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        // Calling the maximunsubarray method to find the maximum contiguous subarray sum
        int max_sum = maximunsubarray(x);
        
        // Printing the result of the maximum contiguous sum
        System.out.println(max_sum);
    }

    // This method returns the maximum sum of a contiguous subarray from the input array
    public static int maximunsubarray(int[] nums) {
        // 'sum' keeps track of the current subarray sum as we iterate through the array
        int sum = 0;
        
        // 'max_sum' stores the maximum sum of all subarrays seen so far. It is initialized to the first element of the array.
        int max_sum = nums[0];
        
        // Iterate through the entire array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the running sum
            sum = sum + nums[i];
            
            // If the current sum is greater than max_sum, update max_sum
            if (sum > max_sum) {
                max_sum = sum;
            }
            
            // If the current sum becomes negative, reset sum to 0 because a negative sum will reduce the overall subarray sum
            if (sum < 0)
                sum = 0;
        }
        
        // Return the largest sum found
        return max_sum;
    }
}
