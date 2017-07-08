import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
//Creates Crime Records objects and works with data
public class CrimeData {
	private ArrayList<CrimeRecord> records;
	
	public CrimeData(){
		records = new ArrayList<CrimeRecord>();
	}
	
	public CrimeRecord getRecordNumber(int i){
		return records.get(i);
	}
	
	public int getNumberOfRecords(){
		return records.size();
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
}
