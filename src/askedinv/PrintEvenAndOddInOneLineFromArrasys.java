package askedinv;

public class PrintEvenAndOddInOneLineFromArrasys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {45,55,8,994,554,21};
		printEvenAndOdd(arr);
		

	}

	public static void  printEvenAndOdd(int[]arr) {
		int []result=new int[arr.length];
		
		int index=0;
		//for even no to add
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				result[index]=arr[i];
				index++;
			}
			
		}
		
		//for odd numbers to add
		
		//After that add this odd number to the new array
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				result[index]=arr[i];
				index++;
			}
		}//for
		
	for (int i=0;i<result.length;i++) {
		System.out.print(result[i]+",");
	}
	//int i :result) {
		//System.out.print("Arrat of Even and Odd:: "+i+",");
		//		
	}
}

