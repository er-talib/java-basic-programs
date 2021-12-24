package patternprograms;

import java.util.Scanner;
public class Upper {
	
	public static void main(String[] args) {
	Scanner obj =  new Scanner(System.in);
	System.out.println("Enter number");

	int number = obj.nextInt();
	int i = 1;
	
	for( i = 1 ; i <= number ; i++ ) {
        
		for(int j = number ; j > 1 ; j--) {
			System.out.print(" ");
		}
		
		for(int k = 1 ; k <= (2 * i -1) ; k++) {
			System.out.print("*");
		}
		
		System.out.println();
		
	}
	}
}
