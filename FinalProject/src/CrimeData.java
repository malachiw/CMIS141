
import java.io.FileReader;
import java.text.NumberFormat;
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
	public void loadDataFromFile(String filePath){
		try {
			Scanner input = new Scanner(new FileReader(filePath));
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
				double murderAndManslaughterRate = Double.parseDouble(results[5]);
				double rape = Double.parseDouble(results[6]);
				double rapeRate = Double.parseDouble(results[7]);
				double robbery = Double.parseDouble(results[8]);
				double robberyRate = Double.parseDouble(results[9]);
				double aggravatedAssualt = Double.parseDouble(results[10]);
				double aggravatedAssualtRate = Double.parseDouble(results[11]);
				double propertyCrime = Double.parseDouble(results[12]);
				double propertyCrimeRate = Double.parseDouble(results[13]);
				double burglary = Double.parseDouble(results[14]);
				double burglaryRate = Double.parseDouble(results[15]);
				double larceny = Double.parseDouble(results[16]);
				double larcenyRate = Double.parseDouble(results[17]);
				double motorVehicleTheft = Double.parseDouble(results[18]);
				double motorVehicleTheftRate = Double.parseDouble(results[19]);
				record = new CrimeRecord(results[0], population, violentCrime, violentCrimeRate, 
						murderAndManslaughter, murderAndManslaughterRate, rape, rapeRate, robbery, robberyRate, aggravatedAssualt, 
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
	public static String getHighestMurderRate(){
		CrimeRecord most = records.get(0);
		for (CrimeRecord record:records){
			if(most.getMurderAndManslaughterRate() < record.getMurderAndManslaughterRate()){
				most = record;
			}
		}
		return most.getYear();
	}
	
	/**
	 * 
	 * @return The year that had the least murders
	 */
	public static String getLowestMurderRate(){
		CrimeRecord least = records.get(0);
		for (CrimeRecord record:records){
			if(least.getMurderAndManslaughterRate() > record.getMurderAndManslaughterRate()){
				least = record;
			}
		}
		return least.getYear();
	}
	
	/**
	 * 
	 * @return The year that had the most robberies.
	 */
	public static String getHighestRobberyRate(){
		CrimeRecord most = records.get(0);
		for (CrimeRecord record:records){
			if(most.getRobberyRate() < record.getRobberyRate()){
				most = record;
			}
		}
		return most.getYear();
	}
	
	/**
	 * 
	 * @return The year that had the least robberies.
	 */
	public static String getLowestRobberyRate(){
		CrimeRecord least = records.get(0);
		for (CrimeRecord record:records){
			if(least.getRobberyRate() > record.getRobberyRate()){
				least = record;
			}
		}
		return least.getYear();
	}
	/**
	 * @param i is the record index number
	 * @return records.get(index i)
	 */
	public CrimeRecord getRecordsAtIndex(int i){
		return records.get(i);
	}
	
	/**
	 * Gets the number of records in the list.
	 * @return int records.size
	 */
	public static int getNumberOfRecords(){
		return records.size();
	}
	
	public static ArrayList<Object> listOfPopulationAnnual() {
		ArrayList<Object> population=new ArrayList<>();		
		for(CrimeRecord record:records){
				population.add((double)record.getPopulation());
		}
		return population;
	}

	public static ArrayList<Object> sumPopulationChange(ArrayList<Object> population){
		ArrayList<Object> delta=new ArrayList<>();
		for(int i=0; i<population.size()-1; i++){
			delta.add(i, ((double)population.get(i+1)-(double) population.get(i))/(double)population.get(i)*100);
		}
		return delta;
	}
	public static ArrayList<Object> populationChangeInPercent(ArrayList<Object> percent){
		ArrayList<Object> cleanLook=new ArrayList<>();
		for(int i=0; i<percent.size(); i++){
			NumberFormat defaultFormat = NumberFormat.getPercentInstance();
			defaultFormat.setMinimumFractionDigits(1);
			cleanLook.add(i, (defaultFormat.format((double)percent.get(i))));
		}
		return cleanLook;
	}
	
}
