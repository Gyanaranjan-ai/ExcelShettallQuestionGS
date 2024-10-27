package gs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatingCharacter10 {
	public static void main(String[] args) {
		String s1="12345";
		String s2="abssbads";
		findFirstNonRepeatingCharacte(s1);
		findFirstNonRepeatingCharacte(s2);

	}
	private static void findFirstNonRepeatingCharacte(String s) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c:s.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				Integer integer = map.get(c);
				map.put(c, integer+1);
			}
		}
		 for (char c : s.toCharArray()) {
	            if (map.get(c) == 1) {
	                System.out.println(c);
	                break;
	            }
	        }
	}


}
