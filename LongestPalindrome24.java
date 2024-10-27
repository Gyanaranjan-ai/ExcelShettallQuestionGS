package gs;

public class LongestPalindrome24 {
    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        Result result = longestPalindrome(str);
        System.out.println("Longest Palindrome: \"" + result.palindrome + "\", Length: " + result.length);
    }

    public static Result longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return new Result("", 0);
        }

        int start = 0, end = 0; // Variables to track the start and end of the longest palindrome

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (single character center)
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes (two character center)
            int len2 = expandAroundCenter(s, i, i + 1);
            // Find the maximum length from both
            int len = Math.max(len1, len2);

            if (len > end - start) {
                // Update start and end indices
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        String longestPal = s.substring(start, end + 1); // Extract the longest palindrome substring
        return new Result(longestPal, longestPal.length()); // Return the result as an object
    }

    // Helper method to expand around center and find the length of the palindrome
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Return the length of the palindrome
    }

    // Result class to hold the palindrome and its length
    static class Result {
        String palindrome;
        int length;

        Result(String palindrome, int length) {
            this.palindrome = palindrome;
            this.length = length;
        }
    }
}
