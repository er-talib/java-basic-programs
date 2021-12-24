package arrayprograms;

import java.util.Arrays;

public class CopyEmementOneToAnotherArray {

	public static void main(String[] args) {
		
		int arr[] = {3,6,6,7,3,32,7};
		
		int len = arr.length;
		
		int arr2[] = new int[len];
		
		for(int i = 0 ; i < len ; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr) + "\t This is my first array");
	
		System.out.println(Arrays.toString(arr2) + "\t This is my second  array");
	}
}
