/**
 * Mariann Szabo-Freund
 * ITCS-1213
 * 9/27/2013
 * Assignment 3
 *
 **/
import java.util.Scanner;	//needed for the Scanner class

public class Slot
{
	public static void main(String[]args)
	{	
		//declaring variables
		double amount;
		double amountWon=0;
		double totalAmnt=0;
		int again;
		
		//creating an object from Scanner class
		Scanner keyboard= new Scanner(System.in);
		
		//beginning of a do- while loop
		do{
		// display
		System.out.print("\n\nPlease enter the amount of money :$ ");
		amount= keyboard.nextDouble();
		
		//creating an object from the Machine class
		Machine myMachine= new Machine(amount);
		
		//setting the amount in the in the object
		myMachine.setMoney(amount);
		
		//accumulator
		totalAmnt=totalAmnt+amount;
				
		//Display by calling informations from the objct
		System.out.print("\n"+myMachine.getRandom0());
		System.out.print(myMachine.getRandom1());
		System.out.print(myMachine.getRandom2());
		System.out.print("\n$"+myMachine.getLucky());
		amountWon=myMachine.getLucky()+amountWon;
		
		
		System.out.print("\n\nPlay again? Enter 1 to play again or 0 to escape!");
		again= keyboard.nextInt();
		
		
		}
		while(again==1);
		
		//Display
		System.out.println("The total amount you entered is $"+totalAmnt);
		
		
		
		
		System.out.println("The total amount you won is $"+amountWon);
		
	}
}//end of class.