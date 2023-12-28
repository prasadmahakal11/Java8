package Java8LocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class GetTheTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time=LocalTime.now();
		System.out.println("Current Time:: "+time);
		
		
		LocalDate dt=LocalDate.now();
		System.out.println("Local Date:: "+dt);
		
		
		//Now Edit time and date according to our choice
		
		LocalDate dtt=LocalDate.now();
		int dd=dtt.getDayOfMonth();
		int mm=dtt.getMonthValue();
		int yy=dtt.getYear();
		
		System.out.println("Simple Current Date:: "+dtt);
		System.out.println("Formatted Current Date::");
		System.out.printf("%d-%d-%d",dd,mm,yy);
		System.out.printf("%d/%d/%d",dd,mm,yy);

	}

}
