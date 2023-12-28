package practice;

public class RemoveNoFromString {
	
	
	//By using for Loop-1st Solution
	/*public static String removeNo(String str) {
		
		String res=" ";
		
		for(int i=0;i<str.length();i++) {
			
			if(!Character.isDigit(str.charAt(i))) {
				
				res=res+str.charAt(i);	
			}//if
		}//for
		
		return res;
	}//method
	
	*/
	
	
	//2nd Solution
	
	/*public static String remDigit(String str) {
		
		return str.replaceAll("\\d", "");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k="Jvagvvd 494ac hagv ";
		
		System.out.println(remDigit(k));
	}*/
	
	
	public static void main(String[] args) {
	
		String input="ahhajb546sc";
		
		System.out.println(removeDigit(input));
		
	}
	
	public  static String removeDigit(String str) {
		
		return str.replaceAll("\\d", "");
	}
	
	

}
