package gs;

import java.util.Arrays;

public class ReverseWord151 {
	public static void main(String[] args) {
		System.out.println(reverseaString(" the sky is  blue   "));
	}
	private static String reverseaString(String string) {
		String[] split = string.split(" +");
		System.out.println(Arrays.toString(split));
		StringBuffer sb = new StringBuffer();
		for (int i = split.length-1; i >=0; i--) {
			sb.append(split[i]).append(" ");
//			sb.append(" ")
		}
		
		return sb.toString().trim();
	}

}
