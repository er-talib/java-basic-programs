package twodarrayprograms;

import java.util.Arrays;

public class CompairTwoMetrix {

	public static void main(String[] args) {
		int array[][] = { { 2, 3, 4, 5 }, { 6, 3, 8, 9 }, { 0, 1, 2, 3 } };
		int array2[][] = { { 2, 3, 4, 5 }, { 6, 7, 8, 9 }, { 0, 1, 2, 3 } };

		int len1 = array.length;
		int len2 = array[0].length;

		int len3 = array2.length;
		int len4 = array2[0].length;
		int array3[][] = new int[len1][len2];

		boolean b = true;

		if (len1 == len3 && len2 == len4) {

			for (int i = 0; i < array.length; i++) {

				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j] != array2[i][j]) {
						array3[i][j] = array[i][j];
						b = false;
					
					}
					

				}

			}

			if (b == true) {
				System.out.println("Matrix is equal");
				System.out.println(Arrays.deepToString(array3));
			} else {
				System.out.println(Arrays.deepToString(array3));
				System.out.println("Matrix is not equal");
			}

		} else {
			System.out.println("Metrix length is not equal");
		}

	}

}
