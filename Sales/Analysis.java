/**
 * Mariann Szabo-Freund
 * ITCS-1213
 * 10/22/2013
 * Assignment 4
 *
 **/
 
 import java.util.Scanner;
 import java.io.*;
 
 public class Analysis
 {
 	public static void main(String[]args)throws IOException
	{
		
 		String fileInput; //holds the name of the file that needs to be loaded
 		Scanner keyboard = new Scanner(System.in);
 		Sales newSales = new Sales();
 		
 		System.out.println("Please enter the name of the file (Monthly.txt): ");
 		fileInput = keyboard.nextLine();
 		
 		//loads the files into the array in the newSales object
 		newSales.loadFile(fileInput);
 		

		//prints stats about sales
		System.out.println("The total sales amnt is $" + newSales.getTSales());
		System.out.println("The sales average is $" + newSales.getAverage());
		
		//Prints the highest sales
		newSales.getHighest();
		
		//Prints the lowest sales
		newSales.getLowest();
		System.out.println();
		
		//Prints the name of the salesperson with above average sales.
		System.out.println("Salespersons with above average sales:");
		newSales.getAboveAvg();
		
		//Prints the name of the salesperson with below average sales.
		System.out.println();
		System.out.println("Salespersons with below average sales:");
		newSales.getBelowAvg();
	}
 }
