package practice;

import java.util.*;

public class ContOccurenceOfElement {

	public static void main(String[] args) {
		
		String str="Hello Java People";
		
		/*int org_length=str.length();
		
		int new_length=str.replace("e","").length();
		
		int count=org_length-new_length;
		
		System.out.println("Number of you input charcter is:: "+count);
				
				*/
		
		//By Java8
		
		char target='e';
		
		long count=str.chars().filter( c->c ==target).count();
		
		System.out.println("No of element occurence:: "+count);

	}

}
