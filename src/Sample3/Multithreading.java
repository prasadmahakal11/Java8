package Sample3;

/*class myRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
		
	}
}
}*/

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	myRunnable r=new myRunnable();
		Thread t=new Thread(r);
		t.start();*/
		
		Runnable r=()->{
			for(int i=0;i<10;i++){
				
				System.out.println("Child Thread");
				
			}
		};
		
		r.run();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			
		}

	}
}



