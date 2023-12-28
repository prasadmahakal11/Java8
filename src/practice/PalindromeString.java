package practice;

public class PalindromeString {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strr="KANK";
		
		String rev=""; 
		
	for(int i=0;i<strr.length();i++) {
		
		rev=strr.charAt(i)+rev;
	}
		
	
	if(rev.equals(strr)) {
		System.out.println("Palindrome");
	}
	
	else {
		System.out.println("Not Palindrome");
	}
		
	
	
	}

}
