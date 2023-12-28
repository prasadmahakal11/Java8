package practicing;

import java.util.Arrays;
import java.util.List;

public class ExceptionHandlingtoConvertProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list=Arrays.asList("hdh","45","abc","a","54");
		
		list.stream()
		.filter(str->{
		try {
			Integer.parseInt(str);
			return true;
			
		}
		
		catch(NumberFormatException e) {
			return false;
		}
		})
		.forEach(n->{
			int number=Integer.parseInt(n);
			System.out.println("Convertible String is:: "+n+"and in Number format::"+number);
		});

	}

}
