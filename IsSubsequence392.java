package gs;

public class IsSubsequence392 {
	public static void main(String[] args) {
		String s1="abc";
		String s2="ahbgdc";
		String s11="bdhiwhidhata";
		String s22="data";
		String s3="ahbgdc";
		String s4="abc";
		System.out.println(isSubsequence(s11, s22));
		System.out.println(isSubsequence(s3, s4));
		System.out.println(isSubsequence(s1,s2 ));
	}

	private static boolean isSubsequence(String s1, String s2) {
		int j=0;
		for (int i = 0; i <s1.length()&& j<s2.length(); i++) {
			if(s1.charAt(i)==s2.charAt(j)) {
				j++;
			}
		}
		
		
		return j==s2.length();
	}
}
