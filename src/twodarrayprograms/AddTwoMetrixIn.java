package twodarrayprograms;

public class AddTwoMetrixIn {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 } };
		int b[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 1 }, { 9, 0, 1, 2 } };

		int len = a.length;
		int len2 = b.length;
		int d = a[0].length;
		int c[][] = new int[len][d];
		addTwoMetrix(a, b, c, len, len2 , d);
	}

	public static void addTwoMetrix(int a[][], int b[][], int c[][], int l, int le , int d) {

		if (l == le) {
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < d; j++) {
					System.out.print((c[i][j] = a[i][j] + b[i][j]) + " ");
				}
				System.out.println();
			}

		} else {
			System.out.println("Metrix length is not equall");
		}

	}

}
