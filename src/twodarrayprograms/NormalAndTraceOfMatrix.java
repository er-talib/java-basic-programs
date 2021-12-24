package twodarrayprograms;

public class NormalAndTraceOfMatrix {
	
	public static void main(String[] args) {
		
		int matrix[][] = {{1, 4, 4},
                {2, 3, 7},
                {0, 5, 1}};
		
		int len = matrix.length;
		int len2 = matrix[0].length;
		normarMatrix(matrix, len, len2);
		traceMatrix(matrix, len, len2);
		
	}
	
	public static void normarMatrix(int m[][] , int l , int le) {
		int normal  = 0;
		
		for(int i = 0 ; i < l ; i++) {
			for(int j = 0 ; j < le ; j++) {
				
				normal = normal +  m[i][j] * m[i][j];
				
			}
				
		}
		
		System.out.println("The value of the normal metrix: "+ Math.sqrt(normal));
	}
	
	public static void traceMatrix(int m[][] , int l , int le) {
		int normal  = 0;
		
		for(int i = 0 ; i < l ; i++) {
			for(int j = 0 ; j < le ; j++) {
				
				if(i == j) {
				normal = normal +  m[i][j];
				}
			}
			
			
		}
		System.out.println("This is value of trace: " + normal);
}
}

