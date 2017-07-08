/**
 * @filename TestStateBF.java
 * @author Malachi Woodlee
 * @date July 9, 2017
 * @purpose interfaces with user to search 2d array of States and their symbols
 */
import java.util.Scanner;

public class TestStateBF {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Begin Scanner for user input later on
		Scanner input = new Scanner(System.in);
		// Request user input
    	System.out.println(StateBF.greetingString());
		// While loop to search through array
	    while(true) {
	    	// Capture user input
	    	String stateName =input.nextLine();
	    	stateName = stateName.trim();
	    	// exit statement
	    	if(stateName.equalsIgnoreCase("None")){
	    		System.out.println(StateBF.exitToString());
	    		// Exit program
	    		input.close();
	    		System.exit(0);
	    	// search the array, create StateBF object if match is made
	    	// with user input
	    	}else if (StateBF.findStateName(stateName) != null)	{
	    		StateBF trial = new StateBF(stateName);
	    		System.out.println(trial.toString());
	    	// if the search returns null, reiterate the proper inputs 
	    	// to the user
	    	}else {
	    		System.out.println(StateBF.errorString());
	    	}
	    }
	}
}
