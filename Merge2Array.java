package gs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge2Array {
	public static void main(String[] args) {
		
	int x[]= {1,2,3,4};
	int y[]= {2,3,4};
	mergeArray(x,y);
	}

	private static void mergeArray(int[] x, int[] y) {
		List<Integer> l = new ArrayList<Integer>();
		for (Integer i : x) {
			l.add(i);
		}
		for (Integer i : y) {
			l.add(i);
		}
		Collections.sort(l);
		System.out.println(l);
		
		
	}
}

