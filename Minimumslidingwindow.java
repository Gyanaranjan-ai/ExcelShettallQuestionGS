package gs;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Minimumslidingwindow {
	public static int[] minSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove indices out of the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove elements that are not smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] >= nums[i]) {
                deque.pollLast();
            }

            // Add current element's index
            deque.offer(i);

            // Store the minimum value of the window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9, 1, 3, -1, 5, 3, 6, 7};
        int k = 3;
        int[] result = minSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [1, -1, -1, -1, 3, 3]
    }

}
