package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startsWithByUsingstreams {

	public static void main(String[] args) {
List<String>list=Arrays.asList("Mahi","Sudama","Sushant","Rohit");


List<String>ans=list.stream().filter(m ->m.startsWith("Su")).collect(Collectors.toList());

System.out.println(ans);


	}

}
