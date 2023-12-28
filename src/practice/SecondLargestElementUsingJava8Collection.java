package practice;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestElementUsingJava8Collection {
	
	
	public static <T extends Comparable<T>> Optional<T> findSecondLargest(Collection<T>list){
		
		return list.stream()
				.max(Comparator.naturalOrder())
				.flatMap(max->list.stream()
						.filter(element->!element.equals(max))
						.max(Comparator.naturalOrder()));
						
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection<Integer>numbers=List.of(3,4,5,6,8);
		
		Optional<Integer>secondLargest=findSecondLargest(numbers);
		
		if(secondLargest.isPresent()) {
		System.out.println("Second Largest:: "+secondLargest.get());
		}
		
		else {
			System.out.println("No second largest element found.");
		}
		
		
	}

}
