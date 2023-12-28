package practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeCollection {

	public static void main(String[] args) {
		List<Integer>list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		List<Integer>list2=new ArrayList<>();
		list2.add(3);
		list2.add(5);
		list2.add(6);
		
		List<Integer>mergeList=Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
		
	//	List<Integer>mergeList2=Stream.concat(list1.stream(),list1.stream()).collect(Collectors.toList());
		
		System.out.println("Merge List:: "+mergeList);
		

	}

}
