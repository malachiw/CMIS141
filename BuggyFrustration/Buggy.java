/**
 * Buggy.java
 * author: Malachi Woodlee
 * date: May 29, 2017 
 * purpose: A simple-minded Rogerian responder with a bug. 
 */

import java.util.Scanner;

public class Buggy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, my name is Roger. \n\nWhat is your name?");//Let's get the user's name.
		final String userName = input.nextLine();
		
		System.out.println("Hello " + userName + ", nice to meet you. "//Chit-chat, typical for Rogerian.
				+ "\n\nHow are you today, " + userName + "?");
		
		//The following while loop coordinates the exchange between the user and the program.
		
		boolean answered = false; 
		while (answered == false) {
						
			String feels = input.nextLine();	
			String respond2Feels = Buggy.userFeels(feels);
			System.out.println(respond2Feels);
			
			answered = Buggy.flipAnswered(respond2Feels);
		}//end of while
		
		System.out.println("\nHow do you think you could make today better?");
		String better = input.nextLine();
		
		System.out.println( better + "\nDo you think that would really make it better?");
		String really = input.nextLine();
		
		System.out.println("\nWell, " + userName + " it has been nice chatting with you! "
				+ "I hope your day continues to get better.");
				
	}//end of main
	
	
	/*The method userFeels is called to decipher user input responding to Roger's question regarding
	 * how they feel that day.
	 */
	
	public static String userFeels(String feels) {
		String response = "";
		
		switch (feels.toLowerCase()) {
        case "good":
            response = "I am glad to hear you are feeling " + feels + ".";
            break;
        case "ok":
            response = "Oh, yeah? Why just " + feels + "?";
            break;
        case "great":
            response = "I am happy to hear that you are doing great!";
            break;
        case "bad":
            response = "Oh no, why are you feeling bad?";
            break;
        case "meh":
            response = "That's ok! Not every minute of our lives is supposed to be exciting.";
            break;
        case "average":
            response = "What makes an average day for you?";
            break;
        default: 
            response = "I don't understand. Would you say your day is good? Great? Ok? Average? Bad? Meh?";
            break;
    }//end of switch
		return response;
	}//end of method userFeels
	
	/*
	 * The method flipAnswered is used to change the boolean value of the answered variable 
	 * contained in the main method.
	 */
	public static boolean flipAnswered (String respond2Feels) {
		boolean flip = true;
		
		if (respond2Feels.equals("I don't understand. Would you say your day is good? Great? Ok? Average? Bad? Meh?")){
			flip = false;
			return flip;
		}//end of if
		
		return flip;
	}//end of method flipAnswered
}//end of class Buggy
