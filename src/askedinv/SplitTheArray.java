package askedinv;

import java.util.Arrays;

public class SplitTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,8,6,8,54};
		int splitSize=2;
		
		int [][]result=splitArray(arr, splitSize);
		for(int[]subArrays:result) {
			System.out.println("Split Arrays: "+Arrays.toString(subArrays));
		}
		
	}
	
	
	public static int[][]splitArray(int[]array,int splitSize){
		//get the length
		int length=array.length;
		int numberOfArrays=(int)Math.ceil((double)length/splitSize);
		
		int[][]splitArrays=new int[numberOfArrays][];
		
		int startIndex=0;
		for(int i=0;i<numberOfArrays;i++) {
			int endIndex=Math.min(startIndex+length, numberOfArrays);
	splitArrays[i]=Arrays.copyOfRange(array, startIndex, endIndex);
	startIndex+=splitSize;
		}
		
		return splitArrays;
	}

}
