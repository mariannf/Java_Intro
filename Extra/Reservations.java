/*
 *Mariann Szabo-Freund
 *Extra Credit Assignment
 *
 **/


import java.util.Scanner;

public class Reservations
{
	public static void main(String[]args)
	{
		int check;
		int counter=0;
		//Creating array 
		int seat[]= {0,0,0,0,0,0,0,0,0,0};
		
		
		//Cretaing and object of the scanner class
		Scanner keyboard= new Scanner(System.in);
		
		do{
		
		System.out.print("\nThe seats available are: ");
		//for loop to print avaliable seats
		for(int i =0; i<10; i++)
		{
			if(seat[i]!=1)
			System.out.print(i);
			
		}
		//Displaying- accepting user input
		System.out.print("\nPlease enter the seat requested:");
		check= keyboard.nextInt();
		
		
		//Check if the seat is avaliable or not
		if (seat[check]==1)
		{
			System.out.println("\n**** This seat is taken! ****");
			
		}
		else{
			//set the selected seats value to 1, also using a counter 
			seat[check]=1;
			System.out.println("Your seat is #"+ check);
			counter++;
		
			}
			//System.out.println("The counter is" + counter);
		
		}while(counter!=10);
		System.out.println("\n*** All seats are taken!! ***");
		
		}//end of main class
	}//end of class
