package com.nt.streams;

import java.util.List;
import java.util.stream.Collectors;

/*Joining Strings:

Given a list of strings, concatenate them into a single comma-separated string using Java Streams.
*/

public class JoingListItemsUsingComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list=List.of("Apple","Mango","Papaya","Grapes");
		
		String concanateString=list.stream()
				                                        .collect(Collectors.joining(", "));
		
		//The Collectors.joining(", ") collector is used to concatenate the strings with a comma and a space between them.
		
		System.out.println(concanateString);
		
		

	}

}
