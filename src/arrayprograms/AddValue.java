package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class AddValue {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("how many value");
		int num = obj.nextInt();

		int[] arr = new int[num];

		int totalValues = 0 ;
		for (int i = 0; i < arr.length; i++) {

			arr[i] = obj.nextInt();
			totalValues++ ;

		}
		int c = 0;
		int add = 0;
		for (int i = 0; i < arr.length; i++) {

			add = c + arr[i];

			c = add;

		}
		System.out.println(add);

		System.out.println(Arrays.toString(arr));
		
		System.out.println("Total values is : " + totalValues);
	}

}
