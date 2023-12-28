package practicing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(4,5,8,99,54,4,78,35);
		List<Integer>evenNo=list.stream().filter(number->number%2==0).collect(Collectors.toList());
		
		System.out.println("Even Numbers:: "+evenNo);

	}

}
