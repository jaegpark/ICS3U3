// The "TrapIntError" class.
import java.awt.*;
import hsa.Console;
import hsa.Message;

public class TrapIntError
{
    static Console c;           // The output console

    int num1;
     
    public TrapIntError ()
    {
	c = new Console ();
    }


    public void askData ()
    {
	String numstr;
	while (true)
	{
	    try
	    {
		c.print ("Enter a number: ");
		numstr = c.readLine ();
		num1 = Integer.parseInt (numstr);
		break;
	    }
	    catch (NumberFormatException e)
	    {
		new Message ("Bad integer. Try again");
	    }
	}
	c.println ("The integer number is: " + num1);

    }


    public static void main (String[] args)
    {
	TrapIntError e = new TrapIntError ();
	e.askData ();
	// Place your program here.  'c' is the output console
    } // main method
} // TrapIntError class


