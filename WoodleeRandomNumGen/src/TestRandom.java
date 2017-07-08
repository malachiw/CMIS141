import java.util.Scanner;

/**
 * 
 */

/**
 * @author malachi woodlee
 * Random number generator formula adopted from
 * 
 * Park, S. K., & Miller, K. W. (1988). Random number generators: good ones are hard to find. 
 *      Communications of the ACM, 31(10), 1192-1201. doi:10.1145/63039.63042 
 */
public class TestRandom {

	/**
	 * @param args
	 */
	static StringBuilder foundRandNum = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how many random numbers you want as an integer:");
		int x = input.nextInt();
		
		System.out.println("Keeping only numbers 0 < y , please enter an integer for y:");
		int y = input.nextInt();
		
		genRandNum(x, y);
		
		System.out.println(exitString());

	}
	private static void genRandNum(int x, int y) {
		// TODO Auto-generated method stub
		int counter = 0;
		double seed = 0;
		while (counter<x){
			double rando = runRNGFormula(seed);
			if(y<=10 && rando*10< y){
				foundRandNum.append((int)(rando*10) +" ");
				counter++;
				
			}else if (y<=100 && rando*100<y){
				if (rando*100<1){
					foundRandNum.append((int)(rando*1000));
					}
				foundRandNum.append((int)(rando*100) +" ");
				counter++;
				
			}
			if(seed>24){
				seed =seed/25;
			}else {
				seed++;
			}
			
		}
	}
	private static double runRNGFormula(double seed){
		final int a = 6;
		final int m = 13;
		final double q = m/a;
		final double r = m%a;
		
		double hi =seed/q;
		double low = seed%q;
		double test = a * low - r * hi;
		if(test>0){
			seed = test;
		}else {
			seed = test + m;
		}
		double randomNum = seed/m;
		return randomNum;
	}
	private static String exitString(){
		return "Here are your numbers:\n"+ foundRandNum+"\n";
	}
}
