package gs;

public class CustomAtoi10 {
    public static int atoi(String str) {
        if (str == null || str.isEmpty()) {
            return -1;  // Invalid input
        }
        
        int i = 0, sign = 1, result = 0;
        int n = str.length();

        // Handle optional sign at the start
        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }

        // Convert characters to integer and validate each character
        while (i < n) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return -1;  // Invalid character
            }
            result = result * 10 + (ch - '0');
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        System.out.println(atoi("123"));    // Output: 123
        System.out.println(atoi("-123"));   // Output: -123
        System.out.println(atoi("1a23"));   // Output: -1
        System.out.println(atoi("+456"));   // Output: 456
    }
}

