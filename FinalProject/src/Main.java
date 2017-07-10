import java.util.Scanner;

public class Main {
	//Get started here
	public static void main(String[] args) {
		final String FILEPATH = "C:\\Users\\malachi\\git\\CMIS141\\FinalProject\\Crime.csv";
		
		CrimeData crimeData = new CrimeData();
		crimeData.loadDataFromFile(FILEPATH);
		
		//System.out.println(Strings.greeting());
		//Scanner input = new Scanner(System.in);
		//input.nextInt();
		
		/**
		 * Test statement for CrimeData methods
		 */
		System.out.println("The year with the most murders was " + CrimeData.getMostMurders()+". The year with the least was "
				+ CrimeData.getLeastMurders() + "The year with the most robberies was " + CrimeData.getMostRobberies() 
				+". The year with the least was " + CrimeData.getLeastRobberies() +" ");
		double[] stats=CrimeData.listOfPopulationAnnual();
		for(int i=0; i<20; i++){
				System.out.println(stats[i]);
		}
		;
		//Insert loop logic here for menu selection
		//input.close();
	}
	
	
}
