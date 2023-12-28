package com.nt.streams;

import java.util.List;

public class SumOfAllIntegersInList {

	public static void main(String[] args) {
		// Calculate the sum of all integers in a list using Java Streams.
		
		List<Integer>list=List.of(1,2,3,4,50);
		
		int total=list.stream()
				.mapToInt(Integer::intValue)// Convert to primitive int
				.sum();
		//The mapToInt operation is used 
		//to convert the Integer objects to primitive int values, which is necessary for the sum operation.
		System.out.println("Sum of list"+total);
				

	}

}
