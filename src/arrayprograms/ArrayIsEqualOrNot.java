package arrayprograms;

public class ArrayIsEqualOrNot {

	public static void main(String[] args) {
		
		int arr1[] = { 1, 5, 3, 2, 5, 6, 6 };

		int arr2[] = { 2, 5, 3, 2, 5, 6, 6 };
		int len1 = arr1.length;
		int len2 = arr2.length;
		boolean b = true ;
		if(len1 == len2) {
			
			for(int i = 0 ; i  < arr1.length ; i++) {
				
				if(arr1[i] != arr2[i]) {
					b = false ;
					break ;
				}
			}
			
			if(b == true) {
				System.out.println("Array is equal");
			}else {
				System.out.println("Array is not equal");
			}
			
		}
		
	}
}
