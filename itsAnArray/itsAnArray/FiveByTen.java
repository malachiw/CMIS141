package itsAnArray;

public class FiveByTen {
	static final int ROWS = 5;
	static final int COLUMNS = 10;
	public static void main(String[] args) {
	
		double [][] multi = new double[COLUMNS][ROWS];
		for (int i=0; i<COLUMNS; i++) {
			for (int j=0; j<ROWS; j++) {
			multi[i][j] = Double.parseDouble(String.format("%.0f", Math.random() * 10));    
		
			}//end of nested for 1
		}//end of for 
		
		for (int j=0; j<COLUMNS; j++) {
			for (int i=0; i<ROWS; i++) {
				System.out.print(multi[j][i] + " "); 
			}//end of nested for
		System.out.println("");     
		}//end of for
	}//end of main
}//end of class
