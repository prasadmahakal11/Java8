package Java8LocalDateTime;

import java.time.LocalDateTime;
import java.time.Month;

public class BothDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Own seeted date and time
		LocalDateTime ldt=LocalDateTime.of(1995,Month.NOVEMBER,28,10,45);
		
		System.out.println("Own setted Date And time:: "+ldt);
		
		System.out.println("After Adding 6 months:: "+ldt.plusMonths(6));
		
		
		System.out.println("After Substracting 6 Months:: "+ldt.minusMonths(4));

	}

}
