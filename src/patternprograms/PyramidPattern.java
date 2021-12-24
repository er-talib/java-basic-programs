package patternprograms;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int howManyRowInPyramid = obj.nextInt();

		for (int i = howManyRowInPyramid; i >= 1; i--) {

			for (int j = i; j < howManyRowInPyramid; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
