package gs;

public class TrappingRainWater {

    public static int trap(int[] height) {
        // Edge case: if there are less than 3 blocks, no water can be trapped
        if (height == null || height.length < 3) {
            return 0;
        }

        int left = 0, right = height.length - 1; // Two pointers
        int leftMax = 0, rightMax = 0; // To store the max height from left and right
        int totalWater = 0; // To accumulate the total trapped water

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // Update the max height from the left
                } else {
                    totalWater += leftMax - height[left]; // Water trapped is the difference
                }
                left++; // Move the left pointer
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // Update the max height from the right
                } else {
                    totalWater += rightMax - height[right]; // Water trapped is the difference
                }
                right--; // Move the right pointer
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
//        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height = {3,0,2,4};

        System.out.println("Total water trapped: " + trap(height)); // Output should be 6
    }
}

