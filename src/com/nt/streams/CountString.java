package com.nt.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings=List.of("apple","banana","coconut","abc","a");
		
		//to check the chracter starts wiith a ::
		List<String>startWith=strings.stream()
				                                     .filter(s ->s.length()>2)
				                                     .filter(c ->c.startsWith("a"))
				                                     .collect(Collectors.toList());
		
		System.out.println("Starts with a:: "+startWith);
		
		
		//to Check the empty String in the list
	long emptyString=strings.stream()
			                            .filter(c ->c.isEmpty())
			                            .count();
	
	System.out.println("Empty String in list:: "+emptyString);
	}

}
