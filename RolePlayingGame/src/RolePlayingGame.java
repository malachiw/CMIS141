

	/**
	 * Week 2 Lab : Role Playing Game
	 * Created by atoptygin on 5/21/2017.
	 */

	import java.util.Scanner;

	public class RolePlayingGame {

	    final static String WELCOME_TEXT =
	            "Welcome to CMIS141, the most hardcore RPG!\n" +
	                    "\t(Narrated by Morgann Freeemmann)\n\n" +
	                    "Our Hero (you) finds herself on a foggy plain...\n" +
	                    "With nothing but her wits and a compass to guide her!\n";

	    final static String ENTER_COMMAND = "With supplies running low, you must set out in search of food.\n" +
	            "Checking your trusty compass you decide to head .... ? (n/e/s/w) > ";

	    final static String TRAVEL = "You line up with the %1c on your compass and begin walking.\n" +
	            "The grass is knee high, wheat colored and quite pretty.\n" +
	            "You wish there was more light.\n" +
	            "Damn this oppressive fog!\n" +
	            "You try to peer through the fog but see only blankness...\n\n" +
	            "Eventually, you glance down at your compass and realize - you've gone off course!\n" +
	            "Time to set a spell and collect yourself!\n\n";

	    final static String ASK_BREAK = "As you begin to walk you realize %1c is not a cardinal direction.\n" +
	            "You yawn.  This oppressive fog is really making you feel tired.\n" +
	            "Maybe you need a break? (y/N) > ";

	    final static String KEEP_GOING = "You shake it off and, of course, ... \n";

	    final static String TAKE_BREAK = "You set down and lay your head on your pack.\n" +
	            "You startle yourself awake a few times, but eventually fall asleep.\n" +
	            "...\n" +
	            "You dream of a different time. A wonderful age of long ago.\n" +
	            "A time of strong values, strict syntax and mighty executes.\n" +
	            "A passing object method throws an unhandled exception at you and quickly runs away.\n" +
	            "You give chase, yelling - \"Just you wait till I catch you! I'm gonna refactor you for weeks!\"\n" +
	            "What a wonderful dream...\n";

	    /**
	     * Main method, code entry point, args ignored.
	     * Enjoy!
	     * @param args
	     */
	    public static void main(String[] args) {

	        // Init some local variables
	        boolean keepGoing;
	        Scanner myScanner = new Scanner(System.in);

	        // Rick-Roll some coders: https://www.youtube.com/watch?v=dQw4w9WgXcQ

	        // Tell a story
	        System.out.print(WELCOME_TEXT);
	        do {
	            System.out.print(ENTER_COMMAND);
	            char direction = myScanner.next().charAt(0);
	            switch (direction) {
	                case 'n':
	                case 'N':
	                case 'e':
	                case 'E':
	                case 'w':
	                case 'W':
	                case 's':
	                case 'S':
	                    keepGoing = true;
	                    System.out.format( TRAVEL , direction );
	                    break;
	                default:
	                    System.out.format( ASK_BREAK , direction );
	                    char takeABreak = myScanner.next().charAt(0);
	                    switch (takeABreak) {
	                        case 'y':
	                        case 'Y':
	                            System.out.print(TAKE_BREAK);
	                            keepGoing = false;
	                        default:
	                            System.out.print(KEEP_GOING);
	                            keepGoing = true;
	                            break;
	                    }
	                    break;
	            }
	        } while (keepGoing);
	        myScanner.close();
	    }
	}

