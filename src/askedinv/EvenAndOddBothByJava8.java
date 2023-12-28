package askedinv;

import java.util.Arrays;

public class EvenAndOddBothByJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {44,554,21,75,3,56};


System.out.println("Even Numbers::");
Arrays.stream(arr)
           .filter(n->n%2==0)
           .forEach(System.out::println);

System.out.println("Odd Numbers:: ");

Arrays.stream(arr)
           .filter(m->m%2!=0).forEach(System.out::println);

	}
	
	

}
