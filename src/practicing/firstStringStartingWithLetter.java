package practicing;

import java.util.List;
import java.util.Optional;

public class firstStringStartingWithLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>list=List.of("banana","barclay","apple","choclate","landsad");
		
		Optional<String>ans=list.stream()
				                             .filter(m->m.startsWith("b")).findFirst();
		
		System.out.println("First word in List starts with ::b  :"+ans.get());
	}

}
