package com.nt.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {

	/*
	 * Filtering and Mapping:

Given a list of integers, write a Java Stream expression to filter out the even numbers and return a new list of their squares.

	 */
	public static void main(String[] args) {

	List<Integer> list=Arrays.asList(5,7,4,6,8,4);
	
	List<Integer> num=list.stream().filter(m ->m%2==0).collect(Collectors.toList());
	
	System.out.println("Even Numbers:: "+num);

	}

}
