
import java.awt.List;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
//Creates Crime Records objects and works with data
/**
 * @author malachi woodlee
 *
 */
public class CrimeData {
	
	private static ArrayList<CrimeRecord> records;
	
	public CrimeData(){
		records = new ArrayList<CrimeRecord>();
	}

	/**
	 * Reads the file in filePath. Creates CrimeRecord object to add them to record
	 * @param filePath
	 */
	public void loadDataFromFile(String FILEPATH){
		try {
			Scanner input = new Scanner(new FileReader(FILEPATH));
			String line;
			CrimeRecord record;
			input.nextLine();
			while(input.hasNextLine()){
				line = input.nextLine();
				String[] results = line.split(",");
				double population = Double.parseDouble(results[1]);
				double violentCrime = Double.parseDouble(results[2]);
				double violentCrimeRate = Double.parseDouble(results[3]);
				double murderAndManslaughter = Double.parseDouble(results[4]);
				double rape = Double.parseDouble(results[5]);
				double rapeRate = Double.parseDouble(results[6]);
				double robbery = Double.parseDouble(results[7]);
				double robberyRate = Double.parseDouble(results[8]);
				double aggravatedAssualt = Double.parseDouble(results[9]);
				double aggravatedAssualtRate = Double.parseDouble(results[10]);
				double propertyCrime = Double.parseDouble(results[11]);
				double propertyCrimeRate = Double.parseDouble(results[12]);
				double burglary = Double.parseDouble(results[13]);
				double burglaryRate = Double.parseDouble(results[14]);
				double larceny = Double.parseDouble(results[15]);
				double larcenyRate = Double.parseDouble(results[16]);
				double motorVehicleTheft = Double.parseDouble(results[17]);
				double motorVehicleTheftRate = Double.parseDouble(results[18]);
				record = new CrimeRecord(results[0], population, violentCrime, violentCrimeRate, 
						murderAndManslaughter, rape, rapeRate, robbery, robberyRate, aggravatedAssualt, 
						aggravatedAssualtRate, propertyCrime, propertyCrimeRate, burglary, burglaryRate, 
				 	   larceny, larcenyRate, motorVehicleTheft, motorVehicleTheftRate);
				records.add(record);
			}
			input.close();
		} catch (Exception e){
			System.out.println("Error" + e.getMessage());
		}
	}
	
	/**
	 * 
	 * @return The year that had the most murders
	 */
	public static String getMostMurders(){
		CrimeRecord most = records.get(0);
		for (CrimeRecord record:records){
			if(most.getMurderAndManslaughter() < record.getMurderAndManslaughter()){
				most = record;
			}
		}
		return most.getYear();
	}
	
	/**
	 * 
	 * @return The year that had the least murders
	 */
	public static String getLeastMurders(){
		CrimeRecord least = records.get(0);
		for (CrimeRecord record:records){
			if(least.getMurderAndManslaughter() > record.getMurderAndManslaughter()){
				least = record;
			}
		}
		return least.getYear();
	}
	
	/**
	 * 
	 * @return The year that had the most robberies.
	 */
	public static String getMostRobberies(){
		CrimeRecord most = records.get(0);
		for (CrimeRecord record:records){
			if(most.getRobbery() < record.getRobbery()){
				most = record;
			}
		}
		return most.getYear();
	}
	
	/**
	 * 
	 * @return The year that had the least robberies.
	 */
	public static String getLeastRobberies(){
		CrimeRecord least = records.get(0);
		for (CrimeRecord record:records){
			if(least.getRobbery() > record.getRobbery()){
				least = record;
			}
		}
		return least.getYear();
	}
/**
	 * @param i is the record index number
	 * @return records.get(index i)
	 */
	public CrimeRecord getRecordNumber(int i){
		return records.get(i);
	}
	
	/**
	 * Gets the number of records in the list.
	 * @return int records.size
	 */
	public static int getNumberOfRecords(){
		return records.size();
	}
	
<<<<<<< HEAD
	public static double[] listOfPopulationAnnual() {
		ArrayList population = new ArrayList<double>();
		for(CrimeRecord record:records){
			population.add(record.getPopulation());
=======
	public double[] listOfPopulationAnnual() {
		double[] population=[getNumberOfRecords()];		
		for(record:records){
				population.concat(record.getPopulation());
>>>>>>> branch 'master' of https://github.com/malachiw/CMIS141
		}
		return population;
	}

	public double[] listPopulationChange(double i, double j){
		return null;
	}
}
