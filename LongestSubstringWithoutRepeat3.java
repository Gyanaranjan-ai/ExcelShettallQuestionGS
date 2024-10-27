package gs;

import java.util.HashMap;

public class LongestSubstringWithoutRepeat3 {
    public static void main(String[] args) {
        // Test case 1
        String s1 = "abcbadefbb";  // Input string
        System.out.println("Length of Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(s1));
    }

    // This method finds the length of the longest substring without repeating characters
    private static int lengthOfLongestSubstring(String s1) {
        // HashMap to store the last index of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // Variable to store the length of the longest substring without repeating characters
        int lengthOfLongestSubstring = 0;

        // Variable to mark the starting index of the current substring
        int start = 0;

        // Iterate through the input string character by character
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            // If the character is already in the map, move the start position to avoid repeated characters
            if (map.containsKey(c)) {
                // Update start to the index right after the last occurrence of the current character
                start = Math.max(start, map.get(c) + 1);
            }

            // Update the last seen index of the current character
            map.put(c, i);

            // Calculate the length of the current substring and update the max length
            lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, i + 1);
        }

        // Return the length of the longest substring without repeating characters
        return lengthOfLongestSubstring;
    }
}
