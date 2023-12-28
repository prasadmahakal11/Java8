package practice;

import java.util.*;

public class ThirdHighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Integer[]arr= {1,7,8,66,54};
		
		List<Integer>list=Arrays.asList(arr); 
		
		//skip means it skip pehele ke 2 so we will get 3rd highest....ut fisrt we have to do deseding order
		
		//limit means how many value we want to show after skipping the values
		
		
		//For 3rd highest
		list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
		list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
		
		
		//for 2nd highest eement
		
		list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);

	}*/
		
		
		//prcatice
		Integer [] arr= {1,5,6,7,55,44};
		
		List<Integer>list=Arrays.asList(arr);
		
		list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
		
		//2nd hghset
		
		list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		
	}
}