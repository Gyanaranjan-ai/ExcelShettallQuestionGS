package gs;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString387 {
	public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println("First unique character index in \"" + s1 + "\": " + firstUniqChar(s1)); // Output: 0
        System.out.println("First unique character index in \"" + s2 + "\": " + firstUniqChar(s2)); // Output: 2
        System.out.println("First unique character index in \"" + s3 + "\": " + firstUniqChar(s3)); // Output: -1
    }
	 public static int firstUniqChar(String s) {
	        Map<Character,Integer> map= new HashMap<>();
	        for(char c:s.toCharArray()){
	            if(!map.containsKey(c)){
	                map.put(c,1);
	            }else{
	               Integer n= map.get(c);
	               map.put(c,n+1);
	            }
	        }
	        // for(char c:s.toCharArray()){
	        //     if(map.get(c)==1){
	        //         return c;
	        //     }
	        // }
	        for(int i=0;i<s.length();i++){
	            int freq=map.get(s.charAt(i));
	            if(freq==1)
	            return i;
	        }
	        return -1;
	    }
}
