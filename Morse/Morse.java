/**
 * Mariann Szabo-Freund
 * Assignment 5
 * 11/1/2013
 *
 **/
 
 
import java.io.*;	//needed for the file
import java.util.Scanner;	//needed for user input

public class Morse
{
	public static void main(String[]args) throws IOException
	{
		String userInput;
		int choice;
		
		//creating a scanner object
		Scanner keyboard= new Scanner(System.in);
		
		do{
		
		//Display - read input
		System.out.println("Enter the text you want to be translated: ");
		userInput= keyboard.nextLine();
		
		//creating an object of the helper class and sending the input to the constructor 
		Translate newTranslate= new Translate(userInput);
		
		//This calls the loadFile Method to load the file in the arrays
		newTranslate.loadFile();
	
		//Displays 
		System.out.println("The length of your text is: "+ newTranslate.getInputSize());
		System.out.println("The code is: "+ newTranslate.getCodedText(userInput));
		System.out.println("The original text is: "+ newTranslate.getOriginal());		
		System.out.println("Translate another text press [1]"+
								 "Exit press [0]");
		
		choice=keyboard.nextInt();
		
		keyboard.nextLine();
		
		}while(choice == 1);
		
		
	}//end of main class
}//end of class