package arrayprograms;

import java.util.Arrays;

public class LargestNumber {
	
	public static void main(String[] args) {

		int[] arr = {34,334,777,544,3,33,3333,9876,9876,1234,234,1234};
		
		int max = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] >max )
				
				max = arr[i];
		}
		System.out.println(max + " Is maximum number");
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Yout array values is ");
//		for(int array : arr) {
//			System.out.println(array);
//		}
		
		
		System.out.println(Arrays.toString(arr));
	}
}
