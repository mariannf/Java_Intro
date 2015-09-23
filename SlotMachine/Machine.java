/**
 * Mariann Szabo-Freund
 * ITCS-1213
 * 9/27/2013
 * Assignment 3
 *
 **/

import java.util.Random;	//Needed for the random class

public class Machine
{	
	//declaring fields
	private int num0;
	private int num1;
	private int num2;
	
	private String symbol;
	private String symbol1;
	private String symbol2;
	private double amntWon;
	private double moneyIn;
	
// creating an object from the random class
Random randomNumbers = new Random();
   
	//constructor
	public Machine(double m)
	{
		moneyIn=m;

	}
	
	//mutator method
	public void setMoney(double m)
	{
		moneyIn=m;
	}
	
	//accessor method
	public double getMoney()
	{
		return moneyIn;
	}
	
	//accessor method for the first random number
	public String getRandom0()
	{
		num0= randomNumbers.nextInt(6);
		
		//using the switch method with 5 cases
		switch (num0)
		{
		case 0:
		symbol="Cherries ";
		break;
		
		case 1:
		symbol="Oranges ";
		break;
		
		case 2:
		symbol="Plums ";
		break;
		
		case 3:
		symbol="Bells ";
		break;
		
		case 4:
		symbol="Melons ";
		break;
		
		case 5:
		symbol="Bars ";
		break;
		}
		return symbol;
	
	}
	
	//accessor method for the second random number
	public String getRandom1()
	{
		num1= randomNumbers.nextInt(6);
		
		//using the switch method with 5 cases
		switch (num1)
		{
		case 0:
		symbol1="Cherries ";
		break;
		
		case 1:
		symbol1="Oranges ";
		break;
		
		case 2:
		symbol1="Plums ";
		break;
		
		case 3:
		symbol1="Bells ";
		break;
		
		case 4:
		symbol1="Melons ";
		break;
		
		case 5:
		symbol1="Bars ";
		break;
		}		
		return symbol1 ;
	}
	
	//accesor method for the third random number
	public String getRandom2()
	{
		num2= randomNumbers.nextInt(6);
		
		switch (num2)
		{
		case 0:
		symbol2="Cherries ";
		break;
		
		case 1:
		symbol2="Oranges ";
		break;
		
		case 2:
		symbol2="Plums ";
		break;
		
		case 3:
		symbol2="Bells ";
		break;
		
		case 4:
		symbol2="Melons ";
		break;
		
		case 5:
		symbol2="Bars ";
		break;
		}
		return symbol2;
		
		}
		//accesor method 
		public double getLucky()
		
		{
		//using if -else if statements to get the results
		if(num0==num1 || num0==num2 || num1==num2)
		{
		amntWon= moneyIn*2;
		System.out.println("\n\nYou won!!");
		}
		else if(num0==num1 && num1==num2)
		{
		amntWon= moneyIn*3;
		System.out.println("\n\nJackPot!!");
		
		}
		else 
		{
		amntWon=0;
		System.out.println("\n\nMore luck next time!!");
		}return amntWon; 
			}
	}//end of class
	
	
	
		
	
	
	
	

