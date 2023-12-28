 dddddddpackage com.nt.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 Grouping and Averaging:

Given a list of objects with a "category" and "value" field, group them by category and calculate the average value for each category using Java Streams.
Finding Nth Element:
 */

public class GroupingAndcaluLateTheAvgOfItemObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Item>list=List.of(
				new Item("Category1",14.00),
				new Item("Category2",12.0),
				new Item("Category1",44.01),
				new Item("Category3",41.02));

	
	Map<String,Double>averageValueByCategory= list.stream()
			                                                                                     .collect(Collectors.groupingBy(Item :: getCategory,Collectors.averagingDouble(Item :: getValue)));

	averageValueByCategory.forEach((category,average) ->{
	
System.out.println("Category Name:: "+category+" "+"Average Value:: "+average);
	});
	
	
/*
 * We use the Collectors.groupingBy collector to group the items by their "category" field.
The Collectors.averagingDouble collector is used to calculate the average "value" for each category.
The result is a Map<String, Double> where the keys are the categories, and the values are the average values.*/
}
	
}