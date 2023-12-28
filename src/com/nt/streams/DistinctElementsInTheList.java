package com.nt.streams;

import java.util.List;


public class DistinctElementsInTheList {
	
/*	Distinct Elements:

		Given a list of integers, find and print the distinct elements in the list using Java */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=List.of(1,2,5,2,1,5);
		
		List<Integer>ans=list.stream().distinct().toList();
		
		System.out.println("Distinct Elements:: "+ans);

	}

}
