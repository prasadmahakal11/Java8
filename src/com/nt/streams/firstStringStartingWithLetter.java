package com.nt.streams;

import java.util.List;
import java.util.Optional;

/*Finding:

 * Given a list of strings, find and print the first string that starts with a specific letter using Java Streams.
*/
public class firstStringStartingWithLetter {

	public static void main(String[] args) {
	
		List<String>list=List.of("Apple","Papaya","Banana","Mango","aanakn");
		
		
		/*Optional<String> firstStringStartingWithLetter = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(targetLetter)))
                .findFirst(); ---> Internet*/ 
		
		Optional<String>ans=list.stream().filter(c ->c.startsWith("P"))
				.findFirst();

		System.out.println(ans.get());// use get() to take that one from optional..
	}

}
