import java.util.Scanner;

public class Main {
	//Get started here
	public static void main(String[] args) {
		CrimeData crimeData = new CrimeData();
		crimeData.loadDataFromFile("C:\\data\\Crime.csv");
		System.out.println(greeting());
		System.out.println(crimeData.getNumberOfRecords);
		Scanner input = new Scanner(System.in);
		input.nextInt();
		//Insert loop logic here for menu selection
		input.close();
	}
	
	private static String greeting(){
		return "Enter the number of the question you want answered. Enter ‘Q’ to quit the program :\n" +
				"1. What were the percentages in population growth for each consecutive year from 1994 – 2013?"+
				"2. What year was the Murder rate the highest?\n" +
				"3. What year was the Murder rate the lowest?\n" +
				"4. What year was the Robbery rate the highest?\n" +
				"5. What year was the Robbery rate the lowest?\n" +
				"Q. Quit the program\n\n" +
				"Enter your selection: ";
	}
	
	private static String error(){
		return null;
		
	}
}
