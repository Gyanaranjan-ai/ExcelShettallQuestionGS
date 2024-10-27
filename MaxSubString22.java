package gs;

import java.util.Arrays;

public class MaxSubString22 {
	public static void main(String[] args) {
		String s="aabbdddeeefff";
		s=s.toLowerCase();
		
		int[] maxSubString = maxSubString(s);
		System.out.println(Arrays.toString(maxSubString));
	}
	private static int [] maxSubString(String s) {
		int max=1,count=1;
		int maxStart_index=0,current_index=0;
		
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				count++;
			}else {
				count=1;
				current_index=i;
			}
			if(count>max) {
				max=count;
				maxStart_index=current_index;
			}
			
		}
		
		String substring = s.substring(maxStart_index,maxStart_index+max);
//		System.out.println("String value is: "+substring);
//		System.out.println("String length is : "+substring.length());
//		System.out.println("String starting index is : "+maxStart_index  );
		return new int[]{maxStart_index,count};
	}

}
