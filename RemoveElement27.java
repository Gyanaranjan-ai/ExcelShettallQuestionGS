package gs;

import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
        // Initializing the array num with elements {3, 2, 2, 3}
        int num[] = {3, 2, 2, 3};

        // Defining the value to be removed, which is 3
        int val = 3;

        // Calling the method 'removetheElemnet' and printing the result
        System.out.println(removetheElemnet(num, val));  // Expected output: 2
        System.out.println(Arrays.toString(num));
    }

    // Method to remove all occurrences of 'val' from the array 'num'
    public static int removetheElemnet(int[] num, int val) {
        // Variable to count the number of elements that are not equal to 'val'
        int count = 0;

        // Looping through each element in the array 'num'
        for (int i = 0; i < num.length; i++) {
            // If the current element is not equal to 'val'
            if (num[i] != val) {
                // Increment the count of non-'val' elements
                num[count] = num[i]; // Optionally, if we want to modify the array:
                count++;
            }
        }
        
        // Returning the count of elements not equal to 'val'
        return count;
    }
}

