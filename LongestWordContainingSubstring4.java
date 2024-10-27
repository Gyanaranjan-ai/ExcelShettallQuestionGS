package gs;

public class LongestWordContainingSubstring4 {
	public static void main(String[] args) {
		String[] dict = { "CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS" };
		String toSearch = "ODG";
		System.out.println(longestWordContainingSubstring(dict, toSearch));
	}

	public static int longestWordContainingSubstring(String[] dict, String toSearch) {
		int maxLength = -1;
		String result = "";

		for (String word : dict) {
			if (word.contains(toSearch) && word.length() > maxLength) {
				maxLength = word.length();
				result = word;
			}
		}

		System.out.println("Longest word containing '" + toSearch + "' is: " + result);
		return maxLength;
	}
}
