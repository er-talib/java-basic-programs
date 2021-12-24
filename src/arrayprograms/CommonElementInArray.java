package arrayprograms;

import java.util.Arrays;

public class CommonElementInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8};
		int b[] = {1,2,3,4,5,4,78,8};
		int temp = 0;
		int c[] = new int[8];
		int l =a.length;
		int ln = b.length;
	
		
		for(int i = 0 ; i < l ; i++) {
			
			if(a[i] == b[i]) {
			
				
				c[i] = a[i];
			}
			
		}
		int f = 0 ;
		for(int i = 0 ; i < a.length ; i++) {
			
			for(int j = 0 ; j < a.length -1 ; j++) {
				
				if(c[j] < c[j+1]) {
					
					f = c[j];
					c[j] = c[j + 1];
					c[j+1] = f ;
 				}
			}
			
		}
	
		System.out.println(Arrays.toString(c));

	}

}
