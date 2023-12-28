package askedinv;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String []arr= {"44","22","88","44","77"};
		System.out.println(largestNumber(arr));
		

		

	}

	public static String largestNumber(String []arr) {
		
		Arrays.sort(arr,(num1,num2)->(num2+num1).compareTo(num1+num2));
		String str="";
		for(String s: arr) {
			str=str+s;
		}
		return str;
	}
}
