package gs;

public class MergeSortedArray88 {
	public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 4, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;
        
        merge(nums1, m, nums2, n);
        
        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Set three pointers to the end of both arrays and the position in nums1
    	int i = m - 1;  // Last element in nums1's valid part
        int j = n - 1;  // Last element in nums2
        int k = m + n - 1;  // Last position in nums1
        
        while(j>=0) {
        	if(i>=0 && nums1[i]>nums2[j]) {
        		nums1[k]=nums1[i];
        		k--;
        		i--;
        	}else {
        		nums1[k]=nums2[j];
        		k--;
        		j--;
        	}
        }

        // Traverse from the end to the beginning
//        while (i >= 0 && j >= 0) {
//            if (nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];  // Place nums1[i] at the end and decrement pointers
//            } else {
//                nums1[k--] = nums2[j--];  // Place nums2[j] at the end and decrement pointers
//            }
//        }
//
//        // If there are any remaining elements in nums2, copy them to nums1
//        while (j >= 0) {
//            nums1[k--] = nums2[j--];
//        }
        }
}
