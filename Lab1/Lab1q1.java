
// Student Name 	: Oisin Cawley
// Student Id Number: 
// Date 			: Nov-2015
// Purpose 			: My first class implementation

public class Lab1q1
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method
		
		Double tempB;

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		Thermometer thermB = new Thermometer();		//create a second instance of Thermometer class
		
		thermB.setCelsius(10.0);		//setting value
		tempB = thermB.getCelsius();	//getting value and storing it
		System.out.println("Temp. of Thermometer B is " + tempB);
		
	} // end main
} // end class ThermTest
