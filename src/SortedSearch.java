import java.util.Arrays;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
    	 int i = Arrays.binarySearch(sortedArray, lessThan);
    	    if (i < 0) 
    	        return -i - 1;
    	    else
    	        return i;
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}