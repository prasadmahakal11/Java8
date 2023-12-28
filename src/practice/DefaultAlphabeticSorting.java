package practice;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultAlphabeticSorting {

	public static void main(String[] args) {
		List<String>list=List.of("kk","mm","mahi","hh");
		
		List<String>ans=list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Defaut Aplphabetic  Sorting "+ans);
		
		//Default desending
		List<String>dans=list.stream().sorted(((i1,i2)->i2.compareTo(i1))).collect(Collectors.toList());
		
		System.out.println("Deafult Descending ::"+dans);
	}

}
