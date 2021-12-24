package arrayprograms;


import java.util.Arrays;

public class LargestNumberIna {
	
	public static void main(String[] args) {
		
		int[] arr = {56,3,222,55,233};
		int length =  arr.length;
		
		int n =largestNumber(arr, length);
		System.out.println(n);
	
	}
	
	static int largestNumber(int[] arr ,int length) {
		
		Arrays.sort(arr);
		return arr[length - 1];
	}

}
