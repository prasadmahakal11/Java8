package practice;

public class PrimeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		
		int count=0;
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				count++;
			}
		}//for
		
		
		if(count==2) {
			System.out.println("Prime Number");
		}
			
			else {
			System.out.println("Not Prime");
			}
		
		
		}

	}


