package arrayprograms;

import java.util.Arrays;

public class RevertArrayShort {

	public static void main(String[] args) {

		int[] arr = { 23, 24,  6, 6, 78, 123, 21, 8, 912 };
//		int[] arr = {1,2,3,4,5,6,7,8};
		int temp;

		for (int i = 0; i < arr.length; i++) {

			int flag = 0 ;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1 ;
				}

			}
			
			
			if(flag == 0) {
				break ;
			}
		}

		System.out.println(Arrays.toString(arr));

	}
}
