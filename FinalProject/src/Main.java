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
		System.out.println("Most was year " + CrimeData.getMostMurders()+". The least was "
				+ CrimeData.getLeastMurders() +" ");
		
		//Insert loop logic here for menu selection
		//input.close();
	}
	
	
}
