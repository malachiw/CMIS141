import java.awt.Color;

/**
 * 
 */

/**
 * @filename TestHeadPhone.java
 * @author Malachi Woodlee
 * @date July 2, 2017
 * @purpose Creates 3 test case objects using the class HeadPhone 
 *
 */
public class TestHeadPhone {

	/**
	 * Entering into the main method
	 */
	public static void main(String[] args) {
		// Creating the first Headphone object, a default no arg 
		// constructor object.
		
		HeadPhone mine = new HeadPhone();
		System.out.print(mine.toString());
		
		// Let's create another Headphone Object
		// Headphone Object 2 and set its variables using
		// the set methods from HeadPhone.java
		
		HeadPhone yours = new HeadPhone();
		// Next, making yours different than the default
		yours.setVolume(1);
		yours.setHeadPhoneColor(Color.red);
		yours.setManufacturer("Bose");
		yours.setHeadPhoneModel("Quiet Comfort");
		yours.setPluggedIn(true);
		System.out.print(yours.toString());
		
		// Now, the last headphone object and again
		// changing the defaults with the set methods
		
		HeadPhone lastOne = new HeadPhone();
		// Making lastOne different than the default
		lastOne.setVolume(3);
		lastOne.setHeadPhoneColor(Color.white);
		lastOne.setManufacturer("SkullCandy");
		lastOne.setHeadPhoneModel("S2");
		lastOne.setPluggedIn(true);
		System.out.print(lastOne.toString());
		
		
	}//end of main

}//end of TestHeadPhone
