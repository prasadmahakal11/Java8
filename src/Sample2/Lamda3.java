package Sample2;

interface Durga{
	public void add(int a,int b);
}

interface Mahi{
	public int add(int a,int b);
}

/*class Math implements Durga{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		return c ;
	}
	
}*/
public class Lamda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Durga d=new Math();
	System.out.println(d.add(5,4));		*/
		
		Durga d=(a,b)-> System.out.println("The sum of two number is: "+(a+b));
		d.add(5,4);
		d.add(88,77);
		d.add(12, 7);
		
		Mahi m=(int a,int b)->{return (a+b);};
		System.out.println(m.add(78, 9));
		
	}

}
