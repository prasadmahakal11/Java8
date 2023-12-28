package practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAStringUsingJava8 {

	public static void main(String[] args) {
		
		String str="My Name";
		
		
		String ans=Stream.of(str.split(""))
				 .collect(Collectors.reducing("",(s,c)->(c+s)));
		
		System.out.println("Reverse String:: "+ans);
		
		
		
		String a=Stream.of(str.split("")).collect(Collectors.reducing("",(s,c)->(c+s)));
	}

}
