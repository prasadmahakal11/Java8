package practice;

import java.util.HashSet;

public class FirstOccurenceOfDuplicate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  str="Programming";

		char[]ch=str.toCharArray();
		
		HashSet<Character>ans=new HashSet<>();
		
		for(char e:ch) {
			
			if(!ans.add(e)) {
				//System.out.println("The First Occurece of Duplicate is:: "+e);
				System.out.println("All dupicates fro string:: "+e);
				
				
			}
			
			
		}
	}

}
