package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ShortArray {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		int num = obj.nextInt();
		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			array[i] = obj.nextInt();
		}

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}
}
