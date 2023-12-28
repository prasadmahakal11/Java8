package com.nt.streams;

import java.util.List;
import java.util.Optional;

/*
  These questions cover a range of tasks and operations that can be performed using Java Streams. They are often used to assess a candidate's understanding of the Stream API and functional programming in Java.
*/

public class NthElementsUsingJavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list=List.of(1,2,3,4,5);
		int n=4;
		
		/*Optional<Integer>position=list.stream()
				                                                .skip(n)
				                                               .findFirst();
		
		
		if(position.isPresent()) {
			System.out.println("The position of "+(n+1)+"th "+" element is:: "+position.get());
		}
		
		else {
			System.out.println("The positio of "+n+" th "+" elemnt is not available");
		}*/
		
		Optional<Integer>position=list.stream()
				                                               .skip(n)
				                                               .findFirst();
		
		if(position.isPresent()) {
			System.out.println("The position of "+(n+1)+"th element position is:: "+position.get());
		}
	}
	
	/*
	 * The skip(n) operation is used to skip the first N elements in the stream, effectively skipping to the Nth element.
The findFirst operation returns the first element in the remaining stream.
We check if the Optional result is present and, if so, print the Nth element.
*/
	 

}
