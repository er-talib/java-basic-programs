package patternprograms;

public class PatternP {

	public static void main(String[] args) {
	
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = i ; j < i * 2 ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
