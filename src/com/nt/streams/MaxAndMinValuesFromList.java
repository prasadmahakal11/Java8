package com.nt.streams;

import java.util.List;
import java.util.Optional;

public class MaxAndMinValuesFromList {
	
	//Find the maximum and minimum values from a list of integers using Java Streams.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To find the maximum value, we use the max operation with the Integer::compare comparator.
	//	To find the minimum value, we use the min operation with the Integer::compare comparator.

		List<Integer>list=List.of(44,22,55,87,545,55);
		
		Optional<Integer>max=list.stream().max(Integer::compare);
		
		if(max.isPresent()) {
			
			System.out.println("Max Number in the list:: "+max.get());
		}
		
		else {
			System.out.println("No max value available");
		}
		
		
		Optional<Integer>min=list.stream().min(Integer::compare);
		
		System.out.println("Minimun Nuver in The List:: "+min.get());
	}

}
