package gs;

import java.util.Arrays;

public class RemoveDuplicatesfromSorted80 {
	public static void main(String[] args) {
		int[] num= {1,1,1,2,2,3};
		int i=0;
	for(int n: num) {
		if(i<2 || n!=num[i-2]) {
			num[i++]=n;
		}
//		System.out.println(num);
			
	}
	System.out.println(i);
	}

}
