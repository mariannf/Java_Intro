/**
 * Mariann Szabo-Freund
 * ITCS-1213
 * 10/22/2013
 * Assignment 4
 *
 **/

import java.util.Scanner;
import java.io.*;

public class Sales {
	private String fileName;
	private String firstName; 
	private String lastName; 
	private String[] name;

	private double[] salesAmnt;
	private final int ARRAY_SIZE = 38;
	

	//add the file name in the param
	public void loadFile(String fileName) throws IOException {
		this.fileName = fileName;
		name = new String[ARRAY_SIZE];
		
		salesAmnt = new double[ARRAY_SIZE];
		//Creates the File object
		File myFile = new File(fileName);
		Scanner inputFile = new Scanner(myFile);

		int index = 0;

		while (inputFile.hasNext()) {
			
			//Read the first two words
			firstName = inputFile.next();
			lastName = inputFile.next();
			//add the two words in a String and add to the Array
			name[index] = firstName + " " + lastName;
			salesAmnt[index] = inputFile.nextDouble();
			index++;


		}
		inputFile.close();

	}

	public double getTSales() {
		double tSalesAmnt = 0.0;

		for (double value : salesAmnt)
			tSalesAmnt += value;

		return tSalesAmnt;
	}
	
	public double getAverage(){
		//return the Average of all sales
		double tSale = getTSales();
		return tSale / ARRAY_SIZE;
	}
	

	//Returns the lowest sales from the array
	public void getLowest(){
		 double min = salesAmnt[0];
		 int counter;
		 String sName = "";
		 for (counter = 1 ; counter < salesAmnt.length; counter++){
			 if (salesAmnt[counter] < min){
				 min = salesAmnt[counter];
				 sName = name[counter];
			 }
		 }//end for loop
		 
		 System.out.println("Lowest sales is by " + sName + " $" + min);
	}
	
	//this returns the highest sales from the array 
	public void getHighest(){
		 double max = salesAmnt[0];
		 int counter;
		 String sName = "";
		 for (counter = 1 ; counter < salesAmnt.length; counter++){
			 if (salesAmnt[counter] > max){
				 max = salesAmnt[counter];
				 sName = name[counter];
			 }
		 }//end for loop
		 
		 System.out.println("Highest sales is by " + sName + " $" + max);
	}
	
	//This prints the sales results that are above the average
	public void getAboveAvg(){
		double sAvg = getAverage();
		for (int i = 0 ; i < ARRAY_SIZE; i++){
			if(salesAmnt[i] > sAvg){
				System.out.println(name[i] + " " + salesAmnt[i]);
			}
		}//end for loop
		
	}
	
	//This prints the sales results that are below the average
	public void getBelowAvg(){
		double sAvg = getAverage();
		for (int i = 0 ; i < ARRAY_SIZE; i++){
			if(salesAmnt[i] < sAvg){
				System.out.println(name[i]+ " " + salesAmnt[i]);
			}
		}
	}
	
	

}
