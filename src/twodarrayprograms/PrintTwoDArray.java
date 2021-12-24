package twodarrayprograms;

import java.util.Arrays;

public class PrintTwoDArray {

	public static void main(String[] args) {
		
		int arr[][] = {{2,3,4,5},{6,7,8},{0,1,2,3}};
		
		int len = arr.length;
//		int len2 = arr[0].length;
		
//		System.out.println(Arrays.deepToString(arr)); first method to print 2d arrays 
	
		
		// second method to print 2d arrays
//		for(int i = 0 ; i < len ; i++) {
//			for(int j = 0 ; j < arr[i].length ; j++ ) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println(" ");
//		}
		
		for(int[] x : arr) {
			for(int y : x) {
				System.out.print(y);
			}
		}
		
	}
}
