package gs;

public class MedianofTwoSortedArrays7 {
	public static void main(String[] args) {
		int[] nums1 = { 1, 3 ,4 ,6};
		int[] nums2 = { 2 ,5,7};
		
//		  System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));
//	        System.out.println(findMedianSortedArrays(nums1, nums2)); // Output: 4.0
		
		//it will give the median of both array
		int median_index=((nums1.length+nums2.length)/2)+1;
		System.out.println(median_index);
		
		//it will give the 2nd midarray
		int start=0;
		int end =nums2.length-1;
		int mid=(start+end) /2;
		
		//it will give how many array we should take from 1st array
		int takearr1=median_index-mid-2;
		System.out.println(takearr1);
		
		//find the max of 2array
		for (int i = 0; i <=takearr1; i++) {
		int max=nums2[mid];
		if(max<nums1[takearr1]) {
		max=Math.max(nums2[mid], nums1[takearr1]);
		max=Math.max(nums2[mid+1], nums1[takearr1]);

		System.out.println(max);
		}
		}
	}
//	
//	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int totalLength = nums1.length + nums2.length;
//        int half = totalLength / 2;
//
//        int i = 0, j = 0;
//        int current = 0, previous = 0;
//
//        // We only need to go through the first half of the merged arrays
//        for (int k = 0; k <= half; k++) {
//            previous = current; // Keep track of the previous element
//
//            // Compare the current elements of both arrays
//            if (i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])) {
//                current = nums1[i];
//                i++;
//            } else {
//                current = nums2[j];
//                j++;
//            }
//        }
//
//        // If the total length is odd, return the current element
//        if (totalLength % 2 != 0) {
//            return current;
//        }
//        
//        // If the total length is even, return the average of current and previous
//        return (current + previous) / 2.0;
//    }
	private static int max(int[] arr1, int a1, int a2) {

		return Math.max(arr1[a1], a2);

	}

	private static int min(int[] arr1, int a1, int a2) {

		return Math.min(arr1[a1], a2);

	}
	
	private static boolean midden(Integer[] x, int target) {
		int left = 0;
		int right = x.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			// Check if target is at mid
			if (x[mid] == target) {
				return true; // Return true if target is found
			}
			// If target is greater, ignore the left half
			if (x[mid] < target) {
				left = mid + 1;
			}
			// If target is smaller, ignore the right half
			else {
				right = mid - 1;
			}
		}

		return false; // Return false if target is not found
	}
	
	
	private static boolean binarySearch(Integer[] x, int target) {
		int left = 0;
		int right = x.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			// Check if target is at mid
			if (x[mid] == target) {
				return true; // Return true if target is found
			}
			// If target is greater, ignore the left half
			if (x[mid] < target) {
				left = mid + 1;
			}
			// If target is smaller, ignore the right half
			else {
				right = mid - 1;
			}
		}

		return false; // Return false if target is not found
	}

	

}
