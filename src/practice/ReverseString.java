package practice;

public class ReverseString {
	public static void main(String[] args) {
		
		/*String a="Prasad";
		String rev="";
	//	System.out.println(a.length());
		for(int i=0;i<a.length();i++) {
		
			
		rev=a.charAt(i)+rev;
			
		}
		
		System.out.println(rev);*/
		
		
		String input="KANAK";
		String rev="";
		
		for(int i=0;i<input.length();i++) {
			
			rev=input.charAt(i)+rev;
		}
		
		System.out.println(rev);
		
		//checking palindrome
		if(input.equals(rev)) {
			System.out.println("Palindrome");
		}
		
		
		else {
			System.out.println("Not Palindrome");
		}
	}
}
