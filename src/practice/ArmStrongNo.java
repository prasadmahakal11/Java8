package practice;

public class ArmStrongNo {
	
/*
 * Armstrong
 * 153=1*1*1   +   5*5*5   +3*3*3
 * 
 * if sum of all these is same as 153 then it is armstrong
 * 
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		int num=155;
		int temp=num;
		int r=0;
		int sum=0;
		

		
		while(num>0) {
			
			r=num%10;
			num=num/10;
			
			sum=sum+(r*r*r);	
		}
		
		if(temp==sum) {
			System.out.println("Armstrong");
		}

		
		else {
			System.out.println("No Amstrong");
		}*/
		
		int num=153;
		
		int temp=num;
		
		int r=0;
		
		int sum=0;
		
		while(num>0) {
			
			r=num%10;
			
			num=num/10;
			
			sum=sum+(r*r*r);
		}
		
		if(sum==temp) {
			System.out.println("ArmStrong");
		}
		
		else {
			
			System.out.println("No");
		}
	}

}
