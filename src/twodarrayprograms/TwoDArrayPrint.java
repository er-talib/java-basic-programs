package twodarrayprograms;

public class TwoDArrayPrint {
	
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3,4,5},{6,7,8,0},{5,4,3,2,1}};
		TwoDArrayPrint td = new TwoDArrayPrint();
		td.printArray(arr);
	}
	
	public  void printArray(int a[][]) {
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
