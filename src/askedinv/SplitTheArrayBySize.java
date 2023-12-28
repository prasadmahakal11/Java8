package askedinv;
import java.util.*;

public class SplitTheArrayBySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int splitSize = 3;

        int[][] splitArrays = splitArray(originalArray, splitSize);

        // Print the split arrays
        for (int[] subArray : splitArrays) {
            System.out.println(Arrays.toString(subArray));
        }
    }
	
	public static int[][] splitArray(int[] array, int splitSize) {
        int length = array.length;
        int numOfArrays = (int) Math.ceil((double) length / splitSize);

        int[][] splitArrays = new int[numOfArrays][];
        
        int startIndex = 0;
        for (int i = 0; i < numOfArrays; i++) {
            int endIndex = Math.min(startIndex + splitSize, length);
            splitArrays[i] = Arrays.copyOfRange(array, startIndex, endIndex);
            startIndex += splitSize;
        }

        return splitArrays;
    }
}


