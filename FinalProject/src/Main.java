import java.util.Scanner;

public class Main {
	//Get started here
	public static void main(String[] args) {
		final String FILEPATH = "C:\\Users\\malachi\\git\\CMIS141\\FinalProject\\Crime.csv";
		
		CrimeData crimeData = new CrimeData();
		crimeData.loadDataFromFile(FILEPATH);
		
		System.out.println(Strings.greeting());
		Scanner input = new Scanner(System.in);
		String request=input.nextLine();
		
		while(true){
			if (request.matches([0-9])){
				switch((int)pickle){
					case 1: //System.out.print(Strings.changeInPopulation);
				case 2: System.out.println(Strings.mostMurdersToString());
				case 3: System.out.println(Strings.fewestMurdersToString());
				case 4: System.out.println(Strings.mostRobberisToString());
				case 5: System.out.println(Strings.fewestRobberiesToString());
				case 6: System.out.println(Strings.numOfRecsToString());
				}
			}else if(request.equalsIgnoreCase("Q")){
				System.out.println(Strings.exitString());
				input.close();
				System.exit(0);
			}else{
				System.out.println(Strings.greeting());
			}

		}
	}
}
