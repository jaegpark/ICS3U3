// The "ForLoops1" class.
/*
Jae Park
Mr. Rosen
2018-09-24
This program will output a twleve line 8 times table based on user input
*/
import java.awt.*;
import hsa.Console;

public class ForLoops1
{
    static Console c;           // The output console
    // variable declaration
    int num;

    public ForLoops1 ()
    {
	c = new Console ();
    }


    public void title ()        // title method
    {
	String title = new String ("8 Times Table");
	c.print (" ", 40 - title.length () / 2);        // correctly centres title
	c.println (title);
	c.println ();
    }


    public void intro ()        // introduction message method
    {   
	c.println ("This program will create a twelve line 8 times table based on user input for the middle value");        // intro message
	c.println ();
    }


    public void input ()    // method to retrieve user input
    {
	c.print ("Please enter the middle number: ");       // prompts user for input
	num = c.readInt ();
	c.println ();
    }


    public void output ()   // method to output to user
    {
	// displays the 3 headings for the chart
	c.print (" ", 14);
	c.print ("First Number");
	c.print (" ", 9);
	c.print ("Middle Number");
	c.print (" ", 12);
	c.println ("Product");

	for (int x = num - 5 ; x <= num + 6 ; x++)  // chart creating for loop
	{
	    c.print (8, 20);
	    c.print (" ", 10);
	    c.print ("x");
	    c.print (x, 11);
	    c.print (" ", 20);
	    c.print ("= ");
	    c.println (8 * x);
	}
    }


    public static void main (String[] args)
    {
	// main program
	ForLoops1 d = new ForLoops1 ();
	// runs all the methods
	d.title ();
	d.intro ();
	d.input ();
	d.output ();


	// Place your program here.  'c' is the output console
    } // main method
} // ForLoops1 class
