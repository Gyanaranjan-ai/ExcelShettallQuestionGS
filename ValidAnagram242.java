package gs;

import java.util.Arrays;

public class ValidAnagram242 {

	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "anagram";
		System.out.println("is Anagram =" + isAnagram(s1, s2));
	}

	public static boolean isAnagram(String s, String t) {
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
}