package practicing;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class GroupingAndcaluLateTheAvgOfItemObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Item>items=List.of(
				new Item("Category1",44.00),
				new Item("Category2",87.22),
				new Item("Category3",71.44)
				);
				
Map<String, Double>avrageCategory=items.stream()
.collect(Collectors.groupingBy(Item::getCategory,Collectors.averagingDouble(Item::getValue)));
	
avrageCategory.forEach((category,average)->
System.out.println("Cactegory:: "+category+"Average:: "+average));
	}
	


}
