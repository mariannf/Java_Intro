import java.util.Scanner;

/**
 * Mariann Szabo-Freund
 * ITCS-1213
 * 8/28/2013
 * Assignment 1
 *
 **/

//This porgram is calculating the Paris Hotel's occupancy rate

public class Hotel
{
	public static void main(String[] args)
	{
		double oRate,			//Occupancy rate for the hotel
				 fORate;			//Occupancy rate per floors
		double nFloors,		//number of floors
			 nRooms,			//number of room
			 oRooms,			//number of Occupied rooms 
			 vRooms;			//number of vacant rooms
			 
		double counter = 0,	//counter for total number of rooms
			    oCounter = 0;	//counter for vacant number of rooms
		 
		 Scanner keyboard = new Scanner(System.in);
		 
		 
		 //Using do-while loop for avoiding the input of less than 1 for the number of floors
		 do {
		 
		 System.out.print("Please enter the number of floors the hotel has:");
		 
		 nFloors = keyboard.nextInt();	//Get an integer for input
		 
		 }while(nFloors<1);
		 
		
		 int i;
		  
		 //beginig of for loop
		 for(i = 1; i <= nFloors; i++)
		 	{
			
			// Using the do-while loop to avoid the less than 10 number of rooms for input
			do {
			
			System.out.print("Enter the number of rooms on the floor " + i+ ":");
			nRooms = keyboard.nextInt();	//Get an integer for input
			
			 }while(nRooms<10);
		 
		 counter+= nRooms;	//counter for the number of rooms	
		 	 
		 System.out.print("Enter the number of occupied rooms: ");
		 
		 oRooms= keyboard.nextInt();	//Get an integer for input
		 oCounter += oRooms;	//counter for the number of ocuupied rooms
		 
		 oRate=(oCounter/counter)*100;	//calculating the occupancy rate for the hotel
		 fORate= (oRooms/nRooms)*100;		//calculating the occupancy rate per floor
		 
		 System.out.println("The ocupancy rate for this floor is: "+(int)fORate + "%");
		 
		 
			}
		 vRooms = counter-oCounter;	//calculating the number of vacant rooms
		 oRate = (oCounter/ counter)*100;	//declering a variable for the occupancy rate
		 
		 //Displaying the results
		 System.out.println("The total number of rooms is: " +(int) counter);
		 System.out.println("The number of occupied rooms is: "+ (int)oCounter);
		 System.out.println("The number of vacant rooms is: " + (int)vRooms);
		 System.out.println("The occupancy rate for the hotel is: " +(int) oRate + "%");
	}
	
}

