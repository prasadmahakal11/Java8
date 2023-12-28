package askedinv;
import java.util.*;
public class ValidateBracketCharcters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{}";
		
		boolean status=validatBracket(str);
		System.out.println(status);

	}

	private static boolean validatBracket(String str) {
		// TODO Auto-generated method stub
		
		Stack<Character>st=new Stack<>();
		for(int i=0;i<str.length();i++) {
		Character ch=str.charAt(0);
		
		if(ch=='{') {
			if(st.peek()=='}') {
				st.pop();
			}else {
				return false;
			}
		}
		else if(ch=='['){
			if(st.peek()==']') {
				st.pop();
			}else {
				return false;
			}		
		}
		else if(ch=='(') {
			if(st.peek()==')') {
				st.pop();
			}else {
				return false;
			}
		}
		else {
			st.push(ch);
		}
		
if(st.size()==0) {
	return true;
		}
	
		}//for
		return false;
		
	}//method
	
}//main class
	
	
