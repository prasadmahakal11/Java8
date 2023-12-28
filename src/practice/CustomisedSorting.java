package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomisedSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list=Arrays.asList("Mahi","Suresh","Rohit","Jaddu");
		
		Comparator<String> c =(s1,s2)-> {
			int l1=s1.length();
			int l2=s2.length();
			
			if(l1<l2) return -1;
			
			else if(l1>l2)return +1;
			
			else return s1.compareTo(s2);
		};
	
		List<String>sortedList=list.stream().sorted(c).collect(Collectors.toList());

		System.out.println("Sorted BAsed on Length::"+sortedList);
	}

}
