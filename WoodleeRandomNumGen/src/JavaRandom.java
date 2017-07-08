import java.util.Random;
/**
 * @filename JavaRandom.java
 * @author malachi woodlee
 * @date 20170704
 * @purpose generate some randos
 *
 */
public class JavaRandom {

	/**
	 * @param args
	 */
	static StringBuilder foundRandNum = new StringBuilder();
	
	public static void main(String[] args)throws NumberFormatException {
		// TODO Auto-generated method stub
		if (args.length > 2){
		      System.out.print("\n Use only 2 numbers after the file name!\n");
		      System.exit(1);
		}else if (args.length < 2){
		      System.out.print("\n Requires at least 2 numbers after the file name to work!\n");
		      System.exit(1);
		}
		int x = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		
		Random randNum = new Random();
		
		int counter = 0;
		while(counter<x-1){
			
			if(counter%5==0){
				foundRandNum.append("\n");
			}
			foundRandNum.append(randNum.nextInt(seed) + ", ");
			counter++;
		}
			if(counter%5==0){
			foundRandNum.append("\n"+randNum.nextInt(seed));
			}else {
			foundRandNum.append(randNum.nextInt(seed));
			}
			System.out.println("Here are your numbers:\n"+ foundRandNum+"\n");
		
	}
}