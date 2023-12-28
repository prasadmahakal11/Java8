package com.nt.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * FlatMapping:

Given a list of lists of integers, use Java Streams to flatten the nested lists into a single list of integers.
 */

public class ListInToOneListByFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>>list=Arrays.asList(
				
				Arrays.asList(1,5,8,7),
				Arrays.asList(7,6,48,54),
				Arrays.asList(44,87,99,2)
				);
		

		List<Integer>flatMappendList=list.stream()
				                                                     .flatMap(List :: stream)
				                                                     .collect(Collectors.toList());
		
		System.out.println("Flattened List :: "+flatMappendList);
	}

	
	/*
	 The flatMap operation is used to flatten the nested lists into a single stream of integers.
	  The List::stream method reference is used to convert each inner list into a stream of integers.
	 */
}
