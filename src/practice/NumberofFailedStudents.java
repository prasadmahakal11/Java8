package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberofFailedStudents {

	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(45,98,28,78,44,12,32);
		
		long noOfFailed=list.stream().filter(i-> i<=34).count();
		
		System.out.println("Numbers of Failed Students:: "+noOfFailed);
		
		//We sorted the list of students
		List<Integer>sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println("Before Sorting:: "+list);
		System.out.println("Sorted  List:: "+sortedList);

	}

}
