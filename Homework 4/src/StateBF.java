/**
 * @filename StateBF.java
 * @author Malachi Woodlee
 * @date July 9, 2017
 * @purpose to create a searchable 2d array of States and their symbols
 */

public class StateBF {
	//Begin array of information
	 static String[][] stateData={
			{"Alabama", "Camelia", "Northern Flicker"},
	        {"Alaska", "Forget-me-not", "Willow Ptarmigan "},
	        {"Arizona", "Saguaro cactus blossom", "Cactus Wren"},
	        {"Arkansas", "Apple blossom", "Northern Mockingbird"},
	        {"California", "California poppy", "California Quail"},
	        {"Colorado", "Rocky Mountian columbine", "Lark Bunting"},
	        {"Connecticut", "Mountain laurel", "American Robin"},
	        {"Delaware", "Peach blossom", "Delaware Blue Hen"},
	        {"Florida", "Orange blossom", "Northern Mockingbird"},
	        {"Georgia", "Cherokee rose", "Brown Thrasher", },
	        {"Hawaii", "Yellow hibiscus", "Hawaiian Goose"},
	        {"Idaho", "Syringa, mock orange", "Mountain Bluebird"},
	        {"Illinois", "Violet", "Northern Cardinal"},
	        {"Indiana", "Peony", "Northern Cardinal"},
	        {"Iowa", "Wild prairie rose", "Eastern goldfinch"},
	        {"Kansas", "Sunflower", "Western Meadowlark"},
	        {"Kentucky", "Goldenrod", "Northern Cardinal"},
	        {"Louisiana", "Magnolia",  "Brown Pelican"},
	        {"Maine", "White pine cone and tassel", "Black-Capped Chickadee"},
	        {"Maryland", "Black-eyed susan", "Baltimore Oriole"},
	        {"Massachusetts", "Mayflower", "Black-Capped Chickadee"},
	        {"Michigan", "Apple blossom",  "American Robin"},
	        {"Minnesota", "Pink and white lady's slipper","Common Loon"},
	        {"Mississippi", "Magnolia", "Northern Mockingbird"},
	        {"Missouri", "Hawthorn", "Eastern Bluebird"},
	        {"Montana", "Bitterroot", "Western Meadowlark "},
	        {"Nebraska", "Goldenrod", "Western Meadowlark"},
	        {"Nevada", "Sagebrush", "Mountain Bluebird"},
	        {"New Hampshire", "Purple lilac", "Purple Finch"},
	        {"New Jersey", "Violet", "Eastern Goldfinch"},
	        {"New Mexico", "Yucca flower", "Roadrunner"},
	        {"New York", "Rose", "Eastern Bluebird"},
	        {"North Carolina", "Flowering dogwood", "Northern Cardinal"},
	        {"North Dakota", "Wild prairie rose", "Western Meadowlark"},
	        {"Ohio", "Scarlet carnation", "Northern Cardinal"},
	        {"Oklahoma", "Oklahoma rose",  "Scissor-Tailed Flycatcher"},
	        {"Oregon", "Oregon grape", "Western Meadowlark"},
	        {"Pennsylvania", "Mountain laurel", "Ruffed Grouse"},
	        {"Rhode Island", "Violet", "Rhode Island Red"},
	        {"South Carolina", "Yellow jessamine","Carolina Wren", },
	        {"South Dakota", "Pasque flower", "Ring-Necked Pheasant"},
	        {"Tennessee", "Iris", "Northern Mockingbird",},
	        {"Texas", "Bluebonnet", "Northern mockingbird"},
	        {"Utah", "Sego lily", "California Gull"},
	        {"Vermont", "Red clover", "Hermit Thrush"},
	        {"Virginia", "American dogwood", "Northern Cardinal"},
	        {"Washington", "Coast rhododendron", "Willow Goldfinch"},
	        {"West Virginia", "Rhododendron", "Northern Cardinal"},
	        {"Wisconsin", "Wood violet", "American Robin"},
	        {"Wyoming", "Indian paintbrush", "Western Meadowlark"},
	        };
	/**
	 * Class variables
	 */
	private String birdFound;
	private String flowerFound;
	private String stateName;
	static StringBuilder exitSum = new StringBuilder();
	/**
	 * Constructor
	 * @param stateName
	 */
	public StateBF(String stateName) {
		this.stateName = findStateName(stateName);
		this.birdFound = findBird(stateName);
		this.flowerFound = findFlower(stateName);
	}
	/**
	 * Getter methods used by constructor to build object
	 * No setters, information is derived from array stateData
	 * 
	 */
	/**
	 * getter for state flower
	 * @return flowerFound
	 */
	 String getFlowerFound() {
		exitSum.append(flowerFound + ", ");
		return flowerFound;
	}
	 /**
	  * getter for state bird
	  * @return birdFound
	  */
	 String getBirdFound() {
		exitSum.append(birdFound + "\n");
		return birdFound;
	}
	 /**
	  * getter for state names
	  * @return stateName
	  */
	 String getStateName() {
		exitSum.append(stateName.toUpperCase() + ": ");
		return stateName;
	}
	
	/**
	 * Searches array by user input to match with state bird
	 * @param stateName
	 * @return birdFound
	 */
	static String findBird(String stateName){
    	String birdFound = null;
    	for(int row=0,column=0;row<stateData.length;row++) {
    		// If statement for matching input string to array data
    		if(stateData[row][0].equalsIgnoreCase(stateName)) {
    			// Print bird information
    			birdFound = stateData[row][column+2];
    		}
    	}
    	return birdFound;
    }
	/**
	 * Searches array by user input to match with state flower
	 * @param stateName
	 * @return flowerFound
	 */
	static String findFlower(String stateName){
    	String flowerFound = null;
    	for(int row=0,column=0;row<stateData.length;row++) {
    		// If statement for matching input string to array data
    		if(stateData[row][0].equalsIgnoreCase(stateName)) {
    			// Print flower information
    			flowerFound =stateData[row][column+1];
    		}
    	}
    	return flowerFound;
    }
	/**
	 * Searches array by user input to see if matches with a state name
	 * @param stateName
	 * @return stateNameFound
	 */
	static String findStateName(String stateName){
    	String stateNameFound = null;
    	for(int row=0,column=0;row<stateData.length;row++) {
    		// If statement for matching input string to array data
    		if(stateData[row][0].equalsIgnoreCase(stateName)) {
    			// Print flower information
    			stateNameFound =stateData[row][column];
    		}
    	}
    	return stateNameFound;
    }
	
	/**
	 * The following are toString methods. They format the output to user for 4 cases:
	 * 1. Greeting
	 * 2. Error
	 * 3. Found data
	 * 4. Exit.
	 */
	static String greetingString(){
		return "Welcome, please enter the name of a state or type \"none\" to exit.";
	}
	static String errorString(){
		return "Please enter the name of a state or type \"none\" to quit.";
	}
	public String toString(){
		return "You chose the state of " + getStateName().toUpperCase() +"\n\n"+ "\tFlower: " + getFlowerFound() 
				+"\n" + "\tBird: "+ getBirdFound() + "\n\nPlease enter the name of a state or type \"none\" to exit.";
	}
	static String exitToString() {
		return "Fine, I didn't want to help you further anyway.\nIf you are interested "
				+ "here is a stupid summary of your stupid visit:\n" + exitSum;
	}
} // end class

