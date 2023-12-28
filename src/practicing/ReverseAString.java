package practicing;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Prasad";
String temp="";
		for(int i=0;i<str.length();i++) {
			 temp=str.charAt(i)+temp;
		}
		
		System.out.println(temp);
	}

}
