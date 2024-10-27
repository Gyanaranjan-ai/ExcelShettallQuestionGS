package gs;
import java.util.Arrays;

public class PlusOne66 {

	    public static int[] plusOne(int[] digits) {
	        // Start from the least significant digit (rightmost)
	        for (int i = digits.length - 1; i >= 0; i--) {
	            // Add 1 to the current digit
	            digits[i] += 1;

	            // If the current digit becomes 10, we need to carry the 1
	            if (digits[i] == 10) {
	                digits[i] = 0;  // Set current digit to 0 and continue to the next left
	            } else {
	                // No carry, we can return the array as the job is done
	                return digits;
	            }
	        }

	        // If we finished the loop and still have a carry, the number was all 9's
	        // In that case, we need an extra digit at the start (e.g., 999 + 1 = 1000)
	        int[] newDigits = new int[digits.length + 1];
	        newDigits[0] = 1;  // Set the first digit to 1, and others will remain 0
	        return newDigits;
	    }

	    public static void main(String[] args) {
	    	int[] c={1, 2, 3};
	        // Test cases
	        System.out.println(Arrays.toString(plusOne(c)));  // Output: [1, 2, 4]
	        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));  // Output: [4, 3, 2, 2]
	        System.out.println(Arrays.toString(plusOne(new int[]{9})));  // Output: [1, 0]
	        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));  // Output: [1, 0, 0, 0]
	    }

}
