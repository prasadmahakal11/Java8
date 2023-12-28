package predefinedfi;

import java.util.function.Predicate;

public class Prediactes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer>p=i->i%2==0;
		System.out.println(p.test(5));

	}

}
