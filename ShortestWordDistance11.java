package gs;

public class ShortestWordDistance11 {
	
	public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";

        int distance = findMinDistance(str, word1, word2);
        System.out.println("Minimum distance: " + distance);
    }
	
	private static int findMinDistance(String str, String word1,String word2) {
		String[] words=str.split(" ");
		int index1=-1,index2=-1,min=Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(word1)) {
				index1=i;
			}
			if(words[i].equals(word2)) {
				index2=i;
			}
			
//			if both indices are not -1, it calculates the absolute difference between index1 and index2 
//			(i.e., the distance between the two words) and updates min to be the minimum of the current value of min 
//			and this calculated distance. This ensures that min always holds the smallest distance found so far.
			if(index1!=-1 && index2!=-2)
			min=Math.min(min, Math.abs(index1-index2));
		}
		 
		return min;
	}

}
