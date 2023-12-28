package com.nt.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Combining Streams:

Given two lists, combine them into a single list and remove duplicates using Java Streams.*/
public class CombineList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list1=List.of(1,4,5,2,3,5);
		List<Integer>list2=List.of(4,5,7,8,9);
		//We use Stream.concat to combine the two lists into a single stream.
		List<Integer>orgList=Stream.concat(list1.stream(),list2.stream())
				                                  .distinct()
				                                  .collect(Collectors.toList());
		
		System.out.println("Non duplicate Content Only and In One List:: "+orgList);
	}

}
