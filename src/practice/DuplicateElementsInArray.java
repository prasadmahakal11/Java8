package practice;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,534,8,9,534,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
			}
		}
		
		//fiannico
		
int fno=0;int sno=1;

int sum=0;
int num=10;

for(int i=2;i<=10;i++) {
	sum=fno+sno;
	fno=sum;
	sno=i;
}
	}

}
