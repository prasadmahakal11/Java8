package StringBased;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="KANAL";
		
		char ch;
		
		String rev=" ";
		
	System.out.println("Length:: "+str.length());
		for(int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			rev=ch+rev;
		}
		
		System.out.println("Reverse String::"+rev);
	}

}
