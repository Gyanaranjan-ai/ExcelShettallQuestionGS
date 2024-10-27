package gs;

public class ValidPalindrome125 {
	public static void main(String[] args) {
	String s="madam";
	String sk="A man, a plan, a canal: Panama";
	System.out.println(isPlaindrom(s));
	System.out.println(isPlaindrom(sk));

	}
	private static boolean isPlaindrom(String s) {
		s=s.replaceAll ("[^A-Za-z0-9]", "");
//		System.out.println(s);
		String original_string =s;
		String sk="";
		for (int i = s.length()-1; i >=0; i--) {
			sk+=s.charAt(i);
		}
		return original_string.equalsIgnoreCase(sk);
	}

}
