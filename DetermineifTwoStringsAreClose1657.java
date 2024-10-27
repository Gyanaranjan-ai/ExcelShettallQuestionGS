package gs;

import java.util.Arrays;

public class DetermineifTwoStringsAreClose1657 {
	 public static void main(String[] args) {
	        System.out.println(areClose("abc", "bca")); // Output: true
	        System.out.println(areClose("a", "aa"));    // Output: false
	        System.out.println(areClose("cabbba", "abbccc")); // Output: true
	    }
	 public static boolean areClose(String word1, String word2) {
		 char[] c1 = word1.toCharArray();
		 char[] c2 = word2.toCharArray();
		 
		 Arrays.sort(c1);
		 Arrays.sort(c2);
		 
		 return Arrays.equals(c1, c2);
	 }
	 
}
