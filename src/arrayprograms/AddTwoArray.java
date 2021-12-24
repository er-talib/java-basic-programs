package arrayprograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;

public class AddTwoArray {

	public static void main(String[] args) {
		
		
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {40,30,20,10};
		
		int len1 = arr1.length ;
		int len2 = arr2.length ;
		
		int len = len1 + len2 ;
		int[] arr3 = new int [len];
		
		for(int i = 0 ; i < len1 ; i++) {
			
			arr3[i] = arr1[i];
			
		}
		
		for(int i = 0 ; i < len2 ; i++) {
			arr3[len1 + i] = arr2[i];
		}
//		Arrays.sort(arr3);
//		Arrays.sort(arr3, Collections.reverseOrder());

		System.out.println(Arrays.toString(arr3));
	}

}
