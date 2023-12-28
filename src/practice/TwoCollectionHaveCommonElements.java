package practice;

import java.util.*;

public class TwoCollectionHaveCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list1=Arrays.asList(1,2,5,6);
		List<Integer>list2=Arrays.asList(7,5,6,7);
		
		// Check if there are common elements between the two collections
	boolean havingMatchElements=	list1.stream().anyMatch(list2::contains);
	
	if(havingMatchElements) {
		System.out.println("Have Matched Elements");
	}

	
	else {
		System.out.println("Not Having an atched elements");
	}

	//We use streams to check if any element from collection1 matches any element in collection2. 
	//We do this by using the anyMatch method with collection2::contains as the predicate.
	//This checks if there is at least one element in collection1 that is also present in collection2.
	
	
	}

}
