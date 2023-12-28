package practice;

import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is my list
		List<String>list=new ArrayList<>(Arrays.asList("Mahi","Raina","Sachin","Mahi"));
		
		//create one storage to add elements to it
		
		/*Set<String>ukList=new HashSet<>();
		
		List<String>newList=new ArrayList<>();
		
		for(String element:list) {
			
		if(ukList.add(element)) {
			newList.add(element);
		}
		
		}//for
		
		System.out.println(ukList);
		System.out.println(newList);
		
		*/
		
		
		//Practice
		
		
		Set<String>ukList=new HashSet<>();
		
		for(String e:list) {
			
			ukList.add(e);
		}
		
		System.out.println("Unikue:: "+ukList);
		

		
		
		

	}

}
