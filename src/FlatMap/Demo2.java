package FlatMap;
import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
	List<String>teamA=Arrays.asList("Mahi","Raina","Jaddu");
	
	List<String>teamB=Arrays.asList("Stocks","Sanju","Malinga");
	
	List<String>teamC=Arrays.asList("Rohit","Surya","Hardik");
	
	
	List<List<String>>playersInWc=new ArrayList<List<String>>();
	
	playersInWc.add(teamA);
	playersInWc.add(teamB);
	playersInWc.add(teamC);
	
	
	//Before Java8
	
	/*for(List<String>team:playersInWc) {
		
		for(String player:team) {
			System.out.print(player+" ,");
		}//for
		
	}//for
	*/
	
	//By  Java8
	
	List<String>players=playersInWc.stream().flatMap(x->x.stream()).collect(Collectors.toList());
	
	
	System.out.println(players);

	
	}

}
