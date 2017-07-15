
public class Strings {

	public static String greeting(){
		return "Enter the number of the question you want answered. Enter ‘Q’ to quit the program :\n" +
				"1. What were the percentages in population growth for each consecutive year from 1994 – 2013?\n"+
				"2. What year had the highest Murder rate?\n" +
				"3. What year had the lowest Murder rate?\n" +
				"4. What year had the highest Robbery rate?\n" +
				"5. What year had the lowest Robbery rate?\n" +
				"6. Total number of years on record\n" +
				"Q. Quit the program\n\n" +
				"Enter your selection: ";
	}
	
	public static String changeInPopulation() {
		return "Population growth in percentages from each consecutive year is " 
				+CrimeData.populationChangeInPercent(CrimeData.sumPopulationChange(CrimeData.listOfPopulationAnnual()))
				+ "\n\n";
	}
	
	public static String highestMurderRateToString(){
		return "The year with the highest murder rate was " + CrimeData.getHighestMurderRate()+".\n";
	}
	public static String fewestMurdersToString(){
		return "The year with the lowest murder rate was " + CrimeData.getLowestMurderRate()+".\n";
	}
	public static String mostRobberisToString(){
		return "The year with the highest robbery rate was " + CrimeData.getHighestRobberyRate()+".\n";
	}
	public static String fewestRobberiesToString(){
		return "The year with the lowest robbery rate was " + CrimeData.getLowestRobberyRate() +".\n";
	}
	public static String numOfRecsToString(){
		return "Total number of records in database: " + CrimeData.getNumberOfRecords() + ".\n";
	}
	public static String errorString(){
		return null;
	}
	public static String exitString(){
		return "Thanks for visiting";
	}
}
