package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DefautSortingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(44,22,88,99,84,4);
		
	//	List<Integer>ans=(List<Integer>) list.stream().sorted((i1,i2)->((i1>i2)?1:(i1<i2)?-1:0));
		
		List<Integer>ans=list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		
		System.out.println("Sorting Asc::"+ans);
		
		List<Integer>dans=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println("Descendig by Comparable::"+dans);
		
		
		//again same Descending only by sign change
		
		List<Integer>nans=list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		
		System.out.println("Desending by Minus sign change only:: "+nans);
		
		//again same Ascending only by sign change
		
		List<Integer>aans=list.stream().sorted((i1,i2)->-i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println("Ascending Order By Minus Sign ::"+aans);
		
		
		
		
		
		

	}

}
