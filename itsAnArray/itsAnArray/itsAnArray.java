package itsAnArray;

//We will be sorting later
import java.util.Arrays;
	
public class itsAnArray {
	// Let's earmark some memory for my array
	static final int EARMARK = 20;
	
	public static void main(String[] args) {
		
		// Presto, an array is born!
		int[] randomInts = new int[EARMARK];
		
		// Lets fill it with random values 
		for (int i=0; i<randomInts.length; i++) {
		randomInts[i] = (int) (Math.random() * 100);         
		}//end of for
		
		// Print to screen
		for (int i=0; i<randomInts.length; i++) {
		// Print new line every 10 items
			System.out.print("This is the value "+ + randomInts[i] + ". It resides at index " + i 
				+ " in your array, randomInts.\n");
		}//end of for
		
		System.out.print("\nLet's sort this and reprint!\n\n");
		
		Arrays.sort(randomInts);
		
		for (int i=0; i<randomInts.length; i++) {
			// Print new line every 10 items
			System.out.print("This is the value "+ + randomInts[i] + ". It resides at the new index " + i 
					+ " in your array, randomInts.\n");
		}//end of for
	}//end of main
}//end of class
