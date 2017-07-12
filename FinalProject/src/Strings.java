
public class Strings {

	public static String greeting(){
		return "Enter the number of the question you want answered. Enter ‘Q’ to quit the program :\n" +
				"1. What were the percentages in population growth for each consecutive year from 1994 – 2013?\n"+
				"2. What year had the most Murders?\n" +
				"3. What year had the fewest Murders?\n" +
				"4. What year had the most Robberies?\n" +
				"5. What year had the fewest Robberies?\n" +
				"6. Total number of years on record\n" +
				"Q. Quit the program\n\n" +
				"Enter your selection: ";
	}
	
	public static String mostMurdersToString(){
		return "The year with the most murders was " + CrimeData.getMostMurders()+".";
	}
	public static String fewestMurdersToString(){
		return "The year with the fewest murders was "+ CrimeData.getLeastMurders()+".";
	}
	public static String mostRobberisToString(){
		return "The year with the most robberies was " + CrimeData.getMostRobberies()+".";
	}
	public static String fewestRobberiesToString(){
		return "The year with the fewest robberies was " + CrimeData.getLeastRobberies() +".";
	}
	public static String numOfRecsToString(){
		return null;
	}
	public static String errorString(){
		return null;
	}
	public static String exitString(){
		return "Thanks for visiting";
	}
}
