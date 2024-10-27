package gs;

public class FindMinelemnet11 {
	public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 3, 4};
        int[] arr2 = { 2, 3, 4};

        System.out.println(findMin(arr1)); // Output: 1
        System.out.println(findMin(arr2)); // Output: 1
    }

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare middle element with the rightmost element
            if (nums[mid] > nums[right]) {
                // Minimum must be in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half including mid
                right = mid;
            }
        }

        // When left meets right, that's the minimum element
        return nums[left];
    }
}
