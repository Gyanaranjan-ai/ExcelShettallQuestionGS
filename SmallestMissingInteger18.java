package gs;

public class SmallestMissingInteger18 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};  // Should return 0
        int[] arr2 = {0, 1, 3, 4};  // Should return 2

        System.out.println("Smallest missing integer in arr1: " + findSmallestMissing(arr1));
        System.out.println("Smallest missing integer in arr2: " + findSmallestMissing(arr2));
    }

    // Function to find the smallest missing integer
    public static int findSmallestMissing(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current index does not match the value at that index
            if (arr[i] != i) {
                return i; // The smallest missing integer is the index
            }
        }
        // If all indices match, the smallest missing integer is the length of the array
        return arr.length;
    }
}
