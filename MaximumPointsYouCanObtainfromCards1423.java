package gs;

import java.util.Arrays;

public class MaximumPointsYouCanObtainfromCards1423 {
	public static void main(String[] args) {
        int[] cardPoints1 = {1, 2, 3, 4, 5, 6, 1};
        int k1 = 3;
        System.out.println("Maximum score: " + maxScore(cardPoints1, k1)); // Output: 12

        int[] cardPoints2 = {2, 2, 2};
        int k2 = 2;
        System.out.println("Maximum score: " + maxScore(cardPoints2, k2)); // Output: 4

        int[] cardPoints3 = {9, 7, 7, 9, 7, 7, 9};
        int k3 = 7;
        System.out.println("Maximum score: " + maxScore(cardPoints3, k3)); // Output: 55
    }
	public static int maxScore(int[] x,int k) {
		int n=x.length;
		if(k==n) {
		int totalsum=Arrays.stream(x).sum();
		return totalsum	;
		}
		//now add 1st 3 element
		int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += x[i];
        }

        int maxSum = currentSum;

        // Sliding window to find the maximum sum of `k` cards
        //now remove x[2] in the begining and add x[last]
        //next remove x[2-1] and add x[last-1] and give to currentsum
        for (int i = 0; i < k; i++) {
        	//1st Step=currentsum-x[3-1-0]+x[7-1-0]_  (6-3+1)=4  x[2]+x[6]
        	//2ndStep=currentsum-x[3-1-1]+x[7-1-1]  (4-2+6)=8	 x[1]+x[5]
        	//3rdStep=currentsum-x[3-1-2]+x[7-1-2]	(8-1+5)=12	 x[0]+x[4]
            currentSum = currentSum - x[k - 1 - i] + x[n - 1 - i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
