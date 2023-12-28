package predefinedfi;
import java.util.function.*;
public class Functions {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Function<String,Integer>f=i->i.length();
		
		System.out.println(f.apply("Raju"));
		
		
		Function<String,String>f2=i->i.toUpperCase();
		System.out.println(f2.apply("jcjacjbjb"));

	}

}
