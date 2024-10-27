package gs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AabbCCc2 {
	public static void main(String[] args) {
		String s = "aabbcc";
		Map<Character, Integer> charCounts = countCharacters(s);
		
		// Print the results
		charCounts.forEach((key, value) -> System.out.print(key + "" + value));
	}
	
	private static Map<Character, Integer> countCharacters(String s) {
		// Approach using traditional HashMap
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Alternative approach using Collectors.groupingBy
		Map<Character, Long> collectedMap = s.chars()
			.mapToObj(e -> (char) e)
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		// Convert Long values to Integer for compatibility
		Map<Character, Integer> resultMap = collectedMap.entrySet().stream()
			.collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().intValue()));

		return resultMap;
	}
}

