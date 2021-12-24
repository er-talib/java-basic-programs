package arrayprograms;

import java.util.Arrays;

public class ArraysAreEqualOrNot {

	public static void main(String[] args) {

		int arr1[] = { 1, 5, 3, 2, 5, 6, 6 };

		int arr2[] = { 1, 5, 3, 2, 5, 1, 6 };

		boolean result = Arrays.equals(arr1, arr2);

		if (result == true) {
			System.out.println("Arrays are equals:");
		} else {
			System.out.println("Arrays are not equals:");
		}

		System.out.println(
				"This is first array \n" + Arrays.toString(arr1) + " \nThis is second array \n" + Arrays.toString(arr2));
	}
}
