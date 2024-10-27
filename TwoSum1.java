package gs;

import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        // Initialize the array of integers
        int x[] = { 2, 3, 7, 11, 15 };
        
        // Define the target sum that we want to find
        int target = 17;

        // Call the twoSum method to find the indices of numbers that sum to the target
        int[] result = twosum(x, target);

        // Print the indices of the numbers that sum to the target
        System.out.println(result[0] + "," + result[1]);
    }

    // Method to find two indices whose numbers sum up to the target
    public static int[] twosum(int[] x, int target) {
        // Create a HashMap to store numbers and their indices for quick lookup
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Populate the HashMap with each number and its index from the array
        for (int i = 0; i < x.length; i++) {
            map.put(x[i], i);  // Insert number as key and its index as value
        }

        // Print the HashMap to verify the mapping of numbers to their indices
        System.out.println(map);

        // Iterate over the array to find two numbers that sum up to the target
        for (int i = 0; i < x.length; i++) {
            // Calculate the remainder that, when added to x[i], should equal the target
            int rem = target - x[i];

            // Check if the remainder exists in the HashMap and is not the same element (i.e., different index)
            if (map.containsKey(rem) && map.get(rem) != i) {
                // Return the indices of the two numbers that sum up to the target
                return new int[] { i, map.get(rem) };
            }
        }

        // If no solution is found, throw an error indicating no data was found
        throw new IllegalAccessError("no data found");
    }
}
