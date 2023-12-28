package askedinv;


/*class Singleton{
	
	private volatile  static Singleton instance;
	 
	private Singleton() {
		
	}
	
	
	public static Singleton getInstance() {
		
		if(instance==null) {
		synchronized (Singleton.class) {
			if(instance==null) {
		instance=new Singleton();
			}
		}
		
		}
		return instance;
	}
	
	
}*/
//This we create with Thread safety also

class Singleton{
	
	private static volatile Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
	if(instance==null) {
		
		synchronized(Singleton.class) {
			if(instance==null) {
				instance=new Singleton();
			}
		}
	}
	
	return instance;
	}
}
public class SingleTonCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton instance1=Singleton.getInstance();
		
		Singleton instance2=Singleton.getInstance();
		
		if(instance1==instance2) {
			System.out.println("Both are same obj");
		}else {
			System.out.println("Both are different");
		}
		
	}

}
