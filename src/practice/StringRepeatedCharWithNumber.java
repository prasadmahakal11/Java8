package practice;

public class StringRepeatedCharWithNumber {
	
	/*public static String compressString(String input) {
		
		if(input==null||input.isEmpty()){
			return input;
		}
		
		StringBuilder builder =new StringBuilder();
		
		int countNo=1;
		char currentChar=input.charAt(0);
		
		for(int i=1;i<input.length(); i++ ) {
			
			if(currentChar==input.charAt(i)) {
				countNo++;
			}
			
			else {
				//This else block will executewhen if is failed that eans when character is not same then else will 
				//execute and adds the character and count to buider and take the next char ad sets count as 1 only
				builder.append(currentChar).append(countNo);
				currentChar=input.charAt(i);
				countNo=1;		
			}
			
		}
		
		builder.append(currentChar).append(countNo);
		return builder.toString();
		
	}*/

	
	public static  String compressString(String input) {
		if(input==null || input.isEmpty()) {
			return input;
		}
		
		
		StringBuilder builder=new StringBuilder();
		char currentChar=input.charAt(0);
		
		int Count=1;
		
		
		for(int i=1;i<input.length();i++) {
			
			if(currentChar==input.charAt(i)) {
				Count++;
			}
			
			else {
				builder.append(currentChar).append(Count);
				currentChar=input.charAt(i);
				Count=1;
			}//else
		}//for
		
		builder.append(currentChar).append(Count);
		return builder.toString();
	}//method
	public static void main(String[] args) {
		// how to write a code  to convert string str="aaabbccddd" to String s2="a3b2c2d3" using java asked
		
		
		String str="sdjbjabaabbaa";
		
		String s2=compressString(str);
		
		System.out.println(s2);

	}

}
