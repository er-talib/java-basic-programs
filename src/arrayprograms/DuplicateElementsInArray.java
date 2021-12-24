package arrayprograms;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int[] arr = { 23, 34, 66, 66, 34, 23, 67, 9, 44, 22, 9, 11 };

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println(arr[j]);
				count ++;	
				}
				

			}
		}

		System.out.println("Size is +" + (arr.length - count));
	}
}
