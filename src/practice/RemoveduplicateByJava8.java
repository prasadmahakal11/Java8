package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveduplicateByJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String>list=new ArrayList<String>(Arrays.asList("Mahi","Rohit","Jaddu","Mahi"));
		
		List<String>list=Arrays.asList("Mahi","Rohit","Jaddu","Mahi");
		
		List<String>ukList=list.stream().distinct().collect(Collectors.toList());
		
		
		//List<String>ukList=list.stream().distinct().collect(Collectors.toList());
		
		//Duplicates Are removed
		System.out.println(ukList);

	}

}
