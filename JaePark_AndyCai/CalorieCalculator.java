// The "CalorieCalculator" class.
/*
Jae Park and Andy Cai
Mr. Rosen
2018-09-19
This program will calculate how long you need to cycle to burn off a set amount of calories
*/
import java.awt.*;
import hsa.Console;

public class CalorieCalculator
{
    static Console c;           // The output console

    // variable declaration and assignments
    public double numPizza;
    public double cycleTime;

    public CalorieCalculator ()
    {
	c = new Console ("Calculator");
    }


    public void input ()
    {
	c.print (" ", 30);
	c.println ("Calorie Burn Calculator");
	c.println ();
	c.println ("Please enter the number of pizza slices you ate: ");
	numPizza = c.readDouble ();     //gets the user input for number of pizza slices eaten

    }


    public void calculation ()
    {
	// calculation and output message
	cycleTime = (numPizza * 355) / 550;
	c.println ();
	c.println ("To burn off the calories from " + numPizza + " pizza slices, you must cycle for:");
	c.print (cycleTime, 0, 2);
	c.print (" hours total.");
    }


    public static void main (String[] args)
    {
	// main program
	CalorieCalculator d = new CalorieCalculator ();
	d.input ();
	d.calculation ();


	// Place your program here.  'c' is the output console
    } // main method
} // CalorieCalculator class
