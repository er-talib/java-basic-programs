package twodarrayprograms;

import java.util.Arrays;

public class BoundryElements {
	
	public static void main(String[] args) {
		
	
	int matrix[][] = {{1, 4, 4},
            {2, 3, 7},
            {0, 5, 1}};
	int a[][] = new int[3][3];
	
	int len = matrix.length;
	int len2 = matrix[0].length ;
	
	for(int i = 0 ; i < len ; i++) {
		for(int j = 0 ; j < len2 ; j++) {
			
			if(i == j) {
				continue ;
			}else {
				a[i][j] = matrix[i][j];
			}
			
		}
	}
	
	System.out.println(Arrays.deepToString(a));

}
}
