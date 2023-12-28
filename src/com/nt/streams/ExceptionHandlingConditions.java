package com.nt.streams;

import java.util.List;

/*
 To filter out and print strings from a list that can be successfully converted to integers while handling exceptions using Java Streams, you can use a try-catch block within the stream's filter operation. Here's a Java code example to demonstrate this:
java

 */
public class ExceptionHandlingConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list=List.of("abc","65","big","row","44","456");
		
	list.stream()
	.filter(s ->{
		
		try {
			Integer.parseInt(s);
			return true;
		}
		
		catch(NumberFormatException n) {
			return false;
		}
	})
	.forEach(convertibleStr ->{
	
	int intValue=Integer.parseInt(convertibleStr);
	System.out.println("Convertible Str:: "+convertibleStr+"its int value:: "+intValue);
	});

	/*
	 We have a list of strings named strings.
We use a Java Stream to process the list.
In the filter operation, we use a try-catch block to attempt to parse each string as an integer using Integer.parseInt(str).
If the parsing is successful, the string is considered convertible, and we return true from the filter operation.
If the parsing fails and throws a NumberFormatException, we return false.
The forEach operation is used to print the convertible strings and their corresponding integer values.
When you run this code, it will filter and print the strings that can be successfully converted to integers while handling exceptions using Java Streams. In this example, it will print the convertible strings "123," "45," and "67," along with their corresponding integer values.
	 */
	
	}

}
