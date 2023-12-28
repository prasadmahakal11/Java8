package com.nt.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 Grouping and Counting:

Given a list of strings, group them by their lengths and count the number of strings in each group using Java Streams.

 */

public class StringListMembersLengthAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>lists=List.of("Rahul","asda","Laaja","avabj");
		
		Map<Integer, Long>lengthToCount=lists.stream()
		.collect(Collectors.groupingBy(String :: length,Collectors.counting()));
		
		lengthToCount.forEach((length,count)->{
				System.out.println("String with Length:: "+length+"and count "+count);
		}
				);
		
		
		

	}

}
