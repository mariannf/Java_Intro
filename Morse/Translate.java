/**
 * Mariann Szabo-Freund
 * Assignment 5
 * 11/1/2013
 *
 **/

//needed for file opening and reading
import java.io.*;
import java.util.Scanner;

public class Translate
{
	private String userInput;
	
	private final int ARRAY_SIZE=36;
	private String[] letters= new String[ARRAY_SIZE];
	private String[] code= new String[ARRAY_SIZE];
	private int index=0;
	

	//constructor accepting user input
	public Translate(String userInput)
	{
		this.userInput= userInput;
	}
	
	public String getOriginal()
	{
		return userInput;
	}
	
	public void loadFile()throws IOException
	{	
		//opening the file and reading it
		File file= new File("Morse.txt");
		Scanner input= new Scanner(file);
		
		//filling up 2 paralell arrays
		while(input.hasNext() && index < letters.length)
		{
			letters[index]=input.next();
			code[index]=input.next();
			
			index++;
			
		}
		input.close();
	}
	
	//getther method 
	public int getInputSize()
	{
		int inputSize;
		
		inputSize= userInput.length();
		return inputSize;
	}
	//method accepting the user input and coding
	public String getCodedText(String userInput)
	{	
		this.userInput= userInput;
		String inputCoded= new String();		//creating a string for the coded version of the input
		
		//bracking user input to characters
		for(int i=0; i < getInputSize(); i++)
		{
			char word= userInput.charAt(i);
			String userChar= Character.toString(word);	//converting the char to String for comparing with string
			String codedChar = null;

			//searching for the correct translation
			 for(int j=0; j < ARRAY_SIZE; j++)
			 { 
			 	if(userChar.equalsIgnoreCase(letters[j]))	//comparing two strings 
				{
			 		codedChar= code[j]+" ";

				}
				else if(" ".equals(userChar))	//comparing a whitespace with a String
				{
					codedChar="   ";

				}
				
			 }
			 
			 inputCoded += codedChar;	//building the characters back to words, sentences in morse
		}
		return inputCoded;
	}
			 	

}//end of class 
