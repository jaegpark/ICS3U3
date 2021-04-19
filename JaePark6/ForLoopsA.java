// The "ForLoopsA" class.
/*
Jae Park
Mr. Rosen
2018-09-21
This program will output a chart of numbers
*/
import java.awt.*;
import hsa.Console;

public class ForLoopsA
{
    static Console c;           // The output console

    public ForLoopsA ()
    {
	c = new Console ("Number Chart");
    }


    public void title ()        // this method outputs the title
    {
	c.print (" ", 36);
	c.println ("Number Chart");
	c.println ();
    }


    public void chart ()        // this method creates the chart
    {
	for (int i = 1 ; i < 6 ; i++)
	{
	    // different columns based on term values created from i
	    c.print (i, 5);
	    c.print (i + 2, 10);
	    c.print (i * 12, 20);
	    c.print (-i - 3, 15);
	    c.print (30 - i + 1, 20);
	    c.println (8 + i, 10);
	}
    }


    public static void main (String[] args)
    {
	// main program
	ForLoopsA d = new ForLoopsA ();
	d.title ();
	d.chart ();

	// Place your program here.  'c' is the output console
    } // main method
} // ForLoopsA class
