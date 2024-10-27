package gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFormation17 {

    public static void main(String[] args) {
        String[] dict1 = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input1 = "abcd";
        System.out.println("Result 1: " + findFormableWords(dict1, input1));

        String[] dict2 = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input2 = "caab";
        System.out.println("Result 2: " + findFormableWords(dict2, input2));
    }

    public static List<String> findFormableWords(String[] dictionary, String input) {
        List<String> result = new ArrayList<>();
        Map<Character, Integer> inputCharCount = getCharCount(input); // Character count map for input word

        for (String word : dictionary) {
            if (canFormWord(word, inputCharCount)) { // Check if word can be formed from input characters
                result.add(word);
            }
        }

        return result;
    }

    // Helper method to count occurrences of each character in a string
    private static Map<Character, Integer> getCharCount(String word) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : word.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        return charCount;
    }

    // Helper method to check if a word can be formed with the available characters in input
    private static boolean canFormWord(String word, Map<Character, Integer> inputCharCount) {
        Map<Character, Integer> wordCharCount = getCharCount(word); // Count characters in the current word
        for (Map.Entry<Character, Integer> entry : wordCharCount.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (inputCharCount.getOrDefault(ch, 0) < count) { // Check if input has enough of each character
                return false;
            }
        }
        return true;
    }
}
