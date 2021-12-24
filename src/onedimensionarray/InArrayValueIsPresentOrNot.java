package onedimensionarray;

import java.util.Arrays;
import java.util.Scanner;

public class InArrayValueIsPresentOrNot {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Which number find in array");
		int checkNumber = obj.nextInt();

		System.out.println("Enter How many nubmer in array");
		
		int number = obj.nextInt();
		System.out.println("Enter number");
		int[] array = new int[number];
		
		
		
		

		for (int i = 0; i < number; i++) {

			array[i] = obj.nextInt();
		}

		

		check(array, checkNumber);

		System.out.println("Array" + Arrays.toString(array));

	}

	public static void check(int[] array, int checkNumber) {

		boolean test = false;

		for (int element : array) {

			if (element == checkNumber) {

				test = true;
				break;
			}

		}

		System.out.println("Is " + checkNumber + " present in array = " + test);

	}

}
