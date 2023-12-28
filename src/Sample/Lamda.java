package Sample;

interface Interf{
	public void m1() ;
}

class sample implements Interf{

	@Override
	public void m1() {
		System.out.println("I am m1 method");
		
	}
	
}
public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Interf i=new sample();
		i.m1();

		
	}

}
