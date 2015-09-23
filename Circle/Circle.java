/**
 * Mariann Szabo-Freund
 * ITCS-1213
 * 9/11/2013
 * Assignment 2
 *
 **/

public class Circle
{
	//declaring fields
	private double radius;
	private final double PI = 3.14159;
	
	//constructor accepts arguments for radius
	public Circle(double r)
	{
		
		radius= r;
	}
	//the setRadius method accepts arguments for radius
	public void setRadius(double r)
	{
		radius = r;
	}
	//the getRadius method returns radius
	public double getRadius()	
	{
		return radius;
	}
	//the getArea method returns the circle's area
	public double getArea()
	{
		return PI*radius*radius;
	}
	//the getDiameter method returns the circle's diameter
	public double getDiameter()
	{
		return radius*radius;
	}
	//the getCircumference method returns the circle's circumference
	public double getCircumference()
	{
		return 2*PI*radius;
	}
}
