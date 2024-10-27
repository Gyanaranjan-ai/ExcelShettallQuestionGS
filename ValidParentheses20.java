package gs;

import java.util.Stack;

public class ValidParentheses20 {

    // Main method: The entry point of the program
    public static void main(String[] args) {
        // Test cases to check the validity of parentheses
        String s1 = "()";       // Simple valid case
        String s2 = "()[]{}";   // Mixed valid brackets
        String s3 = "(]";       // Invalid case (wrong closing bracket)
        String s4 = "([])";     // Valid nested brackets
        String s5 = "[{()}]";   // Complex valid case with all types of brackets

        // Printing the results for each test case
        System.out.println("Test case 1: " + isValid(s1));  // Expected output: true
        System.out.println("Test case 2: " + isValid(s2));  // Expected output: true
        System.out.println("Test case 3: " + isValid(s3));  // Expected output: false
        System.out.println("Test case 4: " + isValid(s4));  // Expected output: true
        System.out.println("Test case 5: " + isValid(s5));  // Expected output: true
    }

    // Method to check if a given string of brackets is valid
    public static boolean isValid(String string) {
        // Stack to store opening brackets as we process the string
        Stack<Character> stack = new Stack<Character>();

        // Loop through each character in the string
        for (char c : string.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }
            // If it's a closing bracket, check if it matches the last opened bracket
            else if (c == ']' || c == '}' || c == ')') {
                // If the stack is empty (no matching open bracket), it's invalid
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the last opened bracket from the stack and check if it matches
                Character last = stack.pop();
                if (!isMatching(last, c)) {
                    return false;  // If they don't match, return false
                }
            }
        }
        // If the stack is empty, all brackets were matched properly; otherwise, it's invalid
        return stack.isEmpty();
    }

    // Helper method to check if the open and close brackets match
    public static boolean isMatching(char open, char close) {
        // Return true if the open and close brackets are of the same type
        return (open == '[' && close == ']' ||
                open == '{' && close == '}' ||
                open == '(' && close == ')');
    }
}
