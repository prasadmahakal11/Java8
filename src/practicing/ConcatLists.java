package practicing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatLists {
public static void main(String[]args) {
	
	List<Integer>list1=Arrays.asList(4,5,8,7,1,2);
	List<Integer>list2=Arrays.asList(5,8,54,59,4,7,9);
	
	
	//Combine list with duplicates also
	List<Integer>orgList=Stream.concat(list1.stream(),list2.stream())
			                                  .collect(Collectors.toList());
	
	
	System.out.println("Combined List:: "+orgList);
	
	//List Without Duplicate
	List<Integer>orgListonly=Stream.concat(list1.stream(),list2.stream())
			                                          .distinct()
			                                         .sorted()
			                                          .collect(Collectors.toList());
	
	System.out.println("List without Duplicates:: "+orgListonly);
			                                		  
	
}
}
