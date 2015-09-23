/**
 * Mariann Szabo-Freund
 * ITCS-1213
 * 9/11/2013
 * Assignment 2
 *
 **/

import java.util.Scanner;



public class CircleDemo
{
	public static void main(String[]args)
	{
		double radius;	// to hold the radius
		
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Get the radius
		System.out.println("Enter the radius of the circle: ");
		radius = keyboard.nextDouble();
		
		// Create an instance of the Circle class 
		// and passing the data that was enetered as arguments to the constructor.
		Circle myCircle = new Circle(radius);

		myCircle.setRadius(radius);
		
		//Get data from myCircle and display it.
		System.out.println("The area of the circle is: "+ myCircle.getArea());
		System.out.println("The diameter of the circle is: "+ myCircle.getDiameter());
		System.out.println("The circumference of the circle is: "+myCircle.getCircumference()); 
		
		
		
		
	}
	
}
