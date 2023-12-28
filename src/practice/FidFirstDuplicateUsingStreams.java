package practice;

import java.util.ArrayList;
import java.util.HashSet;

public class FidFirstDuplicateUsingStreams {

	public static void main(String[] args) {

		String input="Cerebrum";
		
HashSet<Character>hs=new HashSet<>();

Character ch=input.chars()
                                                   .mapToObj(c ->(char)c)
                                                   .filter(c -> !hs.add(c))
                                                   .findFirst()
                                                   .orElse(null);

                                                   
                                                   
                                 

if(ch !=null) {
	System.out.println("First Duplicate:: "+ch);
}

else {
	System.out.println("Not Available");
}
		

	}

}
