package gs;

import java.util.ArrayList;
import java.util.List;

public class PrefixSuffix9 {
	public static void main(String[] args) {
		String[] document = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        
       System.out.println(findwordwithPrefix(document,prefix));
	}
	
	private static List<String> findwordwithPrefix(String[] s,String prefix) {
		List<String> result =new ArrayList<String>();
		for(String sk:s) {
			if(sk.startsWith(prefix)) {
				result.add(sk);
			}
		}
		System.out.println(result);
			return result;
	}
}
