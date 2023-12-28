package practice;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1331;
		int org_no=num;
		int target=0;
		
		while(num>0) {
			 target=target*10+num%10;
			num=num/10;
		}
		
		
		if(org_no==target) {
			System.out.println("Palindrome");
		}

		
		else {
			System.out.println("Not Palidrome");
		}
	}

}
