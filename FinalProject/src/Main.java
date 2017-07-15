import java.util.Scanner;

public class Main {
	//Get started here
	public static void main(String[] args) {
		String filePath = null;
		for(String s:args){
			filePath=s;
		}
		System.out.print(filePath);
		long startTime = System.currentTimeMillis();
		
		CrimeData crimeData = new CrimeData();
		crimeData.loadDataFromFile(filePath);
		boolean check = true;
		while(check){
			System.out.println(Strings.greeting());
			Scanner input = new Scanner(System.in);
			String request=input.nextLine();
			if (request.matches("[1-6]"+"")){
				int menuRequest =Integer.parseInt(request);
				switch(menuRequest){
					case 1: System.out.print(Strings.changeInPopulation());
						continue;
					case 2: System.out.println(Strings.highestMurderRateToString());
						continue;
					case 3: System.out.println(Strings.fewestMurdersToString());
						continue;
					case 4: System.out.println(Strings.mostRobberisToString());
						continue;
					case 5: System.out.println(Strings.fewestRobberiesToString());
						continue;
					case 6: System.out.println(Strings.numOfRecsToString());
						continue;
				}
			}else if(request.equalsIgnoreCase("Q")){
				check = false;
			}else{
				continue;
			}
		long endTime = System.currentTimeMillis();
		long elapsedTime = (endTime - startTime)/1000;
		System.out.println("Total time using database: " + elapsedTime + " seconds\n");
		System.out.println(Strings.exitString());
		input.close();
		System.exit(0);
		}
	}
}
