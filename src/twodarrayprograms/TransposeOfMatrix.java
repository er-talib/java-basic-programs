package twodarrayprograms;

import java.util.Arrays;

public class TransposeOfMatrix {
	
	public static void main(String[] args) {
		
	
	
	int matrix[][] = {{3,3,4},
			{5,6,7},
			{9,0,5}};
	int len1 = matrix.length;
	int len2 = matrix[0].length;
	int transposeMatrix[][] = new int[len2][len1];
	
	transposeMatrix(matrix ,transposeMatrix );
	
	System.out.println(Arrays.deepToString(transposeMatrix));
	}

	public static void transposeMatrix( int arr[][] , int arr2[][]) {
		
		for(int i = 0 ; i < arr2.length ; i++ ) {
			for(int j = 0 ; j < arr2[0].length ; j++ ) {
				
				arr2[i][j] = arr[j][i];
			}
		}
		
//		System.out.println(Arrays.deepToString(arr2));
	}
}
