package gs;

public class ShortestSubArraySum13 {
    public static int shortestSubArrayWithSum(int[] arr, int K) {
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            // Shrink the window as long as the sum is greater than or equal to K
            while (currentSum >= K) {
                // If current sum matches K, update the minimum length
                if (currentSum == K) {
                    minLength = Math.min(minLength, end - start + 1);
                }
                currentSum -= arr[start];
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 10, 2, 1};
        int K1 = 12;
        System.out.println(shortestSubArrayWithSum(arr1, K1)); // Output: 2

        int[] arr2 = {5, 8, 50, 4};
        int K2 = 50;
        System.out.println(shortestSubArrayWithSum(arr2, K2)); // Output: 1
    }
}

