package gs;

import java.util.Arrays;

public class ProductofArrayExceptSelf238 {
	 public static int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];

	        // Initialize the result array with 1
	        result[0] = 1;

	        // First pass: Calculate the product of elements to the left of each element
	        for (int i = 1; i < n; i++) {
	            result[i] = result[i - 1] * nums[i - 1];
	        }

	        // Second pass: Multiply the product of elements to the right of each element
	        int rightProduct = 1;
	        for (int i = n - 1; i >= 0; i--) {
	            result[i] *= rightProduct;
	            rightProduct *= nums[i];
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4};
	        int[] result = productExceptSelf(nums);
	        System.out.println(Arrays.toString(result));
	        for (int r : result) {
	            System.out.print(r + " "); // Output: 24 12 8 6
	        }
	    }
}
