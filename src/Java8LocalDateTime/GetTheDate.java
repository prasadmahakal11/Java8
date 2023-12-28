package Java8LocalDateTime;

import java.time.LocalTime;

public class GetTheDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime tt=LocalTime.now();
		
		System.out.println("Current Time:: "+tt);
		
		int hr=tt.getHour();
		int mm=tt.getMinute();
		int sec=tt.getSecond();
		int nn=tt.getNano();
		
		System.out.println(hr+".."+mm+".."+sec);

		System.out.printf("%d-%d-%d-%d",hr,mm,sec,nn);
		
	//	System.out.printf("%d/%d/%d",hr,mm,sec);
		
		
		

	}

}
