package basicprograms;

public class LargestNumber {

	public static void main(String[] args) {
		
		int largest = 0;
		
		int arr[] = {4,6,43,221,77,432,22,2,35,6};
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			
				
				if(arr[i] > arr[i + 1]) {
					
					largest = arr[i];
					System.out.println(largest);
					
				
			}
				
			
		
		}
		System.out.println(largest);
		

	}

}
