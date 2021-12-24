package arrayprograms;

import java.util.Arrays;

public class RemoveOccurencesNumber {

	public static void main(String[] args) {
		
	
	int arr1[] = { 1, 5, 3, 2, 5, 6, 6 };

	int len = arr1.length ;
	int arr2[] = new int[len];
	int num = 6 ;
	
	int ind = 0 ;
	
	for(int i = 0 ; i  < arr1.length ; i++) {
		
		if(arr1[i] != num) {
		arr2[ind++] = arr1[i];	
		}
	}	
//	System.out.println(Arrays.toString(arr2));
	}
	
}
