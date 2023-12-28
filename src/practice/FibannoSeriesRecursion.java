package practice;

 class FibannoSeriesRecursion {
	 
	 static int firstNo=0,secondNo=1,ans=0;
	 public static  void fibaNo(int value) {
		 
		 if(value>2) {
			 
			 ans=firstNo+secondNo;
			 firstNo=secondNo;
			 secondNo=ans;
			 System.out.print(ans +",");
			 
			 
			 //recursion-A function calling itself again and again is called recursion.
			 fibaNo(value-1);
		 }
		 
	
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.print(firstNo+","+secondNo+",");
		
		fibaNo(10);

	}

}
