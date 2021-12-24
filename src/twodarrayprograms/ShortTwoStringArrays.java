package twodarrayprograms;

import java.util.Arrays;

public class ShortTwoStringArrays {
	
	public static void main(String[] args) {
	
		int array[][] = {{1,5,2},{4,3,6},{0,9,1},{7,3,9}};
		
		int t = 0 ;
		
		for(int i = 0 ; i < array.length ; i++) {
			
			for(int j = 0  ; j < array[i].length ; j++) {
				
				for(int k = 0 ; k < array.length ; k++) {
					
					for(int l = 0 ; l < array[k].length ; l++) {
						
						if(array[i][j] > array[k][l]) {
						
							t =array[i][j];
							array[i][j] =array[k][l];
							array[k][l] = i;
						}
						
					}
				}
						
			}		
			
		}
		System.out.println(Arrays.deepToString(array));
		
	}

}
