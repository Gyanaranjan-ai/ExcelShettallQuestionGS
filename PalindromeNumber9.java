package gs;


public class PalindromeNumber9 {
	public static void main(String[] args) {
		int x=121;
		System.out.println(isPalindrome(x));
	}
	
	 public static boolean isPalindrome(int x) {
	        if(x<0){
	            return false;
	        }
	        int org=x;
	        int rev=0;
	        while(x!=0){
	            rev=rev*10+x%10;
	            x=x/10;
	        }
	        return org==rev;
	    }
}
