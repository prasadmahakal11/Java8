package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElementCountInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>elements=Arrays.asList("Banana","Apple","Banana","Grapes","Pineapple");
		
		
		// Count the occurrences of each element in the list
		
		Map<Object, Long>eachElementsCount=elements.stream().collect(Collectors.groupingBy(e-> e,Collectors.counting()));
		
		
		//print the counts
		
		eachElementsCount.forEach((element,count)->{
			
			System.out.println(element+" --"+count);
			
		});

	}

}
