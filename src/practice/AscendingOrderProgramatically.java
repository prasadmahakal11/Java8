package practice;

import java.util.Arrays;

public class AscendingOrderProgramatically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int arr[] = {5,2,4,7,88,1};
		
		//for acending order
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		
		//for descendng one
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//PRedefind method also Arrays.sort(arr)
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Second Max Element:: "+arr[arr.length-2])
		
*/
		
		int arr []= {77,55,7,9,8,5};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	
	}

}
