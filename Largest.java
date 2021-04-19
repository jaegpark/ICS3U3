/*
Jae Park
Mr. Rosen
2018-10-23
This program takes in 3 integers and outputs the largest integer
*/

// The "Smallest" class.

import java.awt.*;
import hsa.Console;

public class Largest
{
    static Console c;           // The output console
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;

    public Largest ()
    {
	c = new Console ();
    }


    public void askData ()
    {
	drawTitle ();
	c.print ("Enter the first value: ");
	num1 = c.readInt ();
	c.print ("Enter the first value: ");
	num2 = c.readInt ();
	c.print ("Enter the first value: ");
	num3 = c.readInt ();
    }


    public void displayData ()
    {
	if (num1 > num2 && num1 > num3)
	    c.println ("The largest value is " + num1);
	else if (num2 > num3 && num2 > num1)
	    c.println ("The largest value is " + num2);
	else
	    c.println ("The largest value is " + num3);
    }


    private void drawTitle ()
    {
	c.print ("", 30);
	c.print ("Largest Integer");
	c.println ();
    }



    public static void main (String[] args)
    {
	Largest d = new Largest ();
	d.askData ();
	d.displayData ();
	// Place your program here.  'c' is the output console
    } // main method
} // Smallest class


