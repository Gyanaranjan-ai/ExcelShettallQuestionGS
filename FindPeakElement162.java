package gs;
//max
public class FindPeakElement162 {
	public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare middle element with the next element
            if (nums[mid] > nums[mid + 1]) {
                // If the mid element is greater than the next element, then the peak lies on the left side
                right = mid;
            } else {
                // Otherwise, the peak lies on the right side
                left = mid + 1;
            }
        }
        return left; // 'left' will point to the peak element's index
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 8, 5, 4};
        int[] arr2 = {10, 20, 15, 5, 2};
        int[] arr3 = {5, 10, 20, 19, 6};

        System.out.println("Peak element index: " + findPeakElement(arr1)); // Output: 3
        System.out.println("Peak element index: " + findPeakElement(arr2)); // Output: 1
        System.out.println("Peak element index: " + findPeakElement(arr3)); // Output: 2
        
        
        System.out.println("Peak element index: " + findPeak(arr1)); // Output: 3
        System.out.println("Peak element index: " + findPeak(arr2)); // Output: 1
        System.out.println("Peak element index: " + findPeak(arr3)); // Output: 2
    }
    
    public static int findPeak(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            // Check if current element is a peak
            if ((i == 0 || arr[i] > arr[i - 1]) && (i == n - 1 || arr[i] > arr[i + 1])) {
                return i;
            }
        }
        
        return -1; // Should not be reached as there is guaranteed to be a peak
    }

}
