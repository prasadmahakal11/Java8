package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNoByJavaEight {
	
	public static void main(String[] args) {
	List<Integer>list=Arrays.asList(2,3,8,9,44);
	
	List<Integer>ans=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	
	System.out.println("Your ans"+ans+ "even numbers");

}
}