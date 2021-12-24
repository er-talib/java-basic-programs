package arrayprograms;


import java.util.Scanner;

public class NumberIsPresentOrNot {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("which number in array do you went to checked");
		int checkNumber = obj.nextInt();
		System.out.println("How many number in array do you want please enter:");
		
		int number = obj.nextInt();
		int[] arr = new int[number];
		System.out.println("Enter number:");
		
		for(int i = 0 ; i < arr.length  ; i++){
		     arr[i] = obj.nextInt();
			}
		
		for(int a : arr) {
			System.out.println(a);
		}
		checkNumberArr(arr, checkNumber);
		
	}
	
	public static void checkNumberArr(int arr[] , int checkNumber) {
		boolean test = false;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == checkNumber) {
//				System.err.println(arr[i] + "number is present in array");
				test= true ;
				break;
				
			}
			
			
		}
		System.out.println("Number is " + test);
		
	}

}
