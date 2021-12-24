package twodarrayprograms;

public class AddTwoMetrix {

	public static void main(String[] args) {
	
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		int b[][] = {{1,2,3,4},{5,6,7,1},{9,0,1,2}};
		
		int len = a.length;
		int len2= a[0].length;
		
		int len3 = b.length;
		int len4= b[0].length;
		int c[][] = new int[len][len2];
		
		if(len ==len3 && len2 == len4) {
			for(int i = 0 ; i < len ; i++ ) {
				for(int j = 0 ; j < len2 ; j++) {
					System.out.print((c[i][j]=a[i][j] + b[i][j]) + " ");
				}
				System.out.println();
			}
			
		}else {
			System.out.println("Metrix length is not equall");
		}
		
		
		
	}
}
