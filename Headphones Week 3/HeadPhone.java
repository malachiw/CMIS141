import java.awt.Color;

/**
 * @filename HeadPhone.java
 * @author Malachi Woodlee
 * @date July 2, 2017
 * @purpose Blueprint for the HeadPhone object
 */
public class HeadPhone {
	//variables for the class
	final int LOW=1, MEDIUM=2, HIGH=3;
	private int volume;
	private boolean pluggedIn;
	private String manufacturer, headPhoneModel;
	private Color headPhoneColor;
		
	/**
	 * Next is the no arg constructor with the default variables set.
	 * @param volume
	 * @param pluggedIn
	 * @param manufacturer
	 * @param headPhoneModel
	 * @param headPhoneColor
	 */
	public HeadPhone() {
		this.volume = MEDIUM;
		this.pluggedIn = false;
		this.manufacturer = "JayBird";
		this.headPhoneModel = "Freedom F5";
		this.headPhoneColor = Color.blue;
	}
	//***********************Getters and Setters********************************************
	
	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	/**
	 * @return the pluggedIn
	 * Uses the isPluggedInToString() method.
	 * See below for description.
	 */
	public String isPluggedIn() {
		String plug = isPluggedInToString(pluggedIn);
		return plug;
	}
	/**
	 * @param pluggedIn the pluggedIn to set
	 */
	public void setPluggedIn(boolean pluggedIn) {
		this.pluggedIn = pluggedIn;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the headPhoneModel
	 */
	public String getHeadPhoneModel() {
		return headPhoneModel;
	}
	/**
	 * @param headPhoneModel the headPhoneModel to set
	 */
	public void setHeadPhoneModel(String headPhoneModel) {
		this.headPhoneModel = headPhoneModel;
	}
	/**
	 * @return the headPhoneColor
	 * This method uses colorToString() method.
	 * See below for description
	 */
	public String getHeadPhoneColor() {
		String color;
		color = colorToString(headPhoneColor);
		return color;
	}
	/**
	 * @param headPhoneColor the headPhoneColor to set
	 */
	public void setHeadPhoneColor(Color headPhoneColor) {
		this.headPhoneColor = headPhoneColor;
	}
    //************************End of Getters and Setters**********************************
	
	/* 
	 * toString method for the headphone objects. Showcasing my getter methods and
	 * displaying the values for each object as currently set. 
	 */
	public String toString() {
		return "HeadPhone [volume=" + getVolume() + ", pluggedIn=" + isPluggedIn()
			+ ", manufacturer=" + getManufacturer() + ", headPhoneModel=" + getHeadPhoneModel() 
			+ ", headPhoneColor=" + getHeadPhoneColor() + "]\n\n";
	}
	/*
	 * The colorToString method changes the value of the Color object to a string
	 * stating the color of the object rather than the R, G, B values and ultimately
	 * more user friendly.
	 */
	private String colorToString(Color headPhoneColor) {
		String colorString;
		if (headPhoneColor == Color.blue){
			colorString = "Blue";
		} else if (headPhoneColor == Color.red){
			colorString = "Red";
		}
		else{
			colorString = "White ";
		}
		return colorString;
	}	
	/*
	 * The isPluggedInToString method converts the boolean to a string statement whether
	 * the headphone jack is or is not plugged in, which makes the toString statement easier 
	 * to understand.
	 */
	private String isPluggedInToString(Boolean pluggedIn){
		if(pluggedIn){
			String plugString = "Headphone jack is inserted";
			return plugString;
		}else {
			String plugString = "Headphone jack is not inserted";
			return plugString;
		}
	}
			
}//end of class
