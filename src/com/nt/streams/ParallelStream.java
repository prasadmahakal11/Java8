package com.nt.streams;

import java.util.List;


/*Parallel Streams allow you to process a large collection of data more efficiently by leveraging multiple CPU cores. 
You can easily parallelize operations such as finding the sum of a list of integers. 
Here's an example of how to do this:*/

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list=List.of(1,2,5,4,5,4,6,8);
		
		int sum=list.parallelStream()
				         .mapToInt(Integer :: intValue)
				         .sum();
		
		System.out.println("Sum:: "+sum);

	}

}

/*
 1. We have a list of integers named numbers.
 
 2.We use parallelStream() instead of stream() to convert the stream into a parallel stream. 
 This allows multiple CPU cores to process the data in parallel.
 
 3.The mapToInt operation is used to convert the Integer objects to primitive int values, which is necessary for the sum operation.
 
 4.The sum operation calculates the sum of all the integers in parallel.
 When you run this code, it will calculate and print the sum of all integers in the list using parallel processing. Parallel processing can be especially beneficial when working with a large collection of data, as it can significantly improve performance by utilizing the available CPU cores for concurrent execution.
 */
