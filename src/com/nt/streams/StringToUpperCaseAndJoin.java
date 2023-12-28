package com.nt.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCaseAndJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list=List.of("I wish you","Happy Birthday");
		
		 String concate=list.stream()
		.map(String:: toUpperCase)
		.collect(Collectors.joining(","));
		 
		 System.out.println(concate);

	}

}
