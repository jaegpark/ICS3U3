/*
Jae Park
Mr. Rosen
2018-09-13
This program will do
*/
// The "NameDisplay" class.
import java.awt.*;
import hsa.Console;

public class NameDisplay
{
    static Console c;           // The output console
    
    public NameDisplay ()
    {
	c = new Console ("Name Output");

    }


    public void drawTitle ()
    {
	c.print (" ", 35);
	c.println ("Name Displayer");
    }


    public void displayData ()
    {
	String fN = "Jae";
	String lN = "Park";

	c.println (fN.toUpperCase ());
	c.println (lN.toLowerCase ());
    }


    public void displayName ()
    {
	String fN = "Jae";

	c.println (fN.charAt (0));
	c.println (fN.charAt (1));
	c.println (fN.charAt (2));
    }


    public static void main (String[] args)
    {
	NameDisplay d;
	d = new NameDisplay ();
	d.drawTitle ();
	d.displayData ();
	d.displayName ();
	// Place your program here.  'c' is the output console
    } // main method
} // NameDisplay class
