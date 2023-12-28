package FlatMap;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
	
		//flatMap
	List<Integer>list1=Arrays.asList(1,2,3);
	List<Integer>list2=Arrays.asList(4,5,6);
	List<Integer>list3=Arrays.asList(7,8,9);
	
	List<List<Integer>>finalList=Arrays.asList(list1,list2,list3);
	
	List<Integer>newChangeList=finalList.stream().flatMap(x->x.stream().map(n->n+5)).collect(Collectors.toList());
	
	List<Integer>onlyContent=finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
	
	System.out.println(finalList);
	
	System.out.println(newChangeList);
	
	System.out.println(onlyContent);
	
	

	}

}
