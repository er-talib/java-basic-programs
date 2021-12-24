package arrayprograms;

import java.util.Arrays;

public class DeleteElementInArray {

	public static void main(String[] args) {

		int arr[] = { 2, 33, 22, 55, 455, 443, 221 };

		int deleteNumber = 55;
		

		for (int i = 0; i < arr.length; i++) {

			if (deleteNumber == arr[i] ) {
				for (int j = i; j < arr.length-1 ; j++) {
					arr[j] = arr[j + 1];
				}
			

			}

		}
		
		for(int i = 0 ; i < arr.length -1 ; i++) {
			System.out.println(arr[i]);
		}
//		System.out.println(Arrays.toString(arr));
	}
}
