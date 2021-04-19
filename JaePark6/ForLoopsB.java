// The "ForLoopsB" class.
/*
Jae Park
Mr. Rosen
2018-09-21
This program will output a 21 row staircase of *'s, and have my name printed at the bottom
*/
import java.awt.*;
import hsa.Console;

public class ForLoopsB
{
    static Console c;           // The output console
    public ForLoopsB ()
    {
	c = new Console ("* stairs");
    }


    public void output ()       // The output method
    {
	for (int i = 1 ; i < 22 ; i++)  // this for loop prints 21 lines of *s
	{
	    c.print (" ", i);
	    c.println ("* * * * *");
	}
	c.print (" ", 72);
	c.print ("Jae Park");           // writes my name at the foot of the staircase
    }



    public static void main (String[] args)
    {
	// main program
	ForLoopsB d = new ForLoopsB ();
	d.output ();

	// Place your program here.  'c' is the output console
    } // main method
} // ForLoopsB class
