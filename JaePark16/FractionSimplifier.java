/*
Jae Park
2018-11-13
Mr. Rosen
This program will take in the numerator and denominator of a fraction and output its
simplified mixed number. The window will give the user a main menu to navigate, take
in user input, and display the correct data.

	GLOBAL VARIABLES
    NAME        TYPE        DESCRIPTION
    ------------------------------------------------------------------------------------
    num         int         This variable stores the value of the user input numerator
    dum         int         This variable stores the value of the user input denominator

*/

// The "FractionSimplifier" class.
import java.awt.*;
import hsa.Console;
import hsa.Message;

public class FractionSimplifier
{
    static Console c;           // The output console

    // Variable Declaration
    int num, dum;

    public FractionSimplifier ()
    {
	c = new Console ();
    }


    /*
    This method centres and displays the title text at the top of the console.
    ----------------------------------------------------------------------------------------
    Local Variables: String t.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    No input/logic/loop is used
    */
    public void title ()
    {
	c.clear ();
	String t = "Fraction Simplifier";
	c.print (' ', 40 - ((t.length () - 1) / 2));        // centres text
	c.println (t);
	c.println ();
    }


    /*
    This method pauses the program, by asking the user to press any key to continue
    ----------------------------------------------------------------------------------------
    Local Variables: char key.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    getChar() is used to retrieve the key the user entered
    */
    public void pauseProgram ()
    {
	char key;
	c.print ("Press any key to continue...");           // pauses program
	key = c.getChar ();
    }


    /*
    This method displays the title, draws a splashart, and prompts the user to continue
    ----------------------------------------------------------------------------------------
    Local Variables: none.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    For loops are used to draw the splashart
    */
    public void splashScreen ()
    {
	Font f = new Font ("Comic Sans MS", Font.BOLD, 36);
	title ();
	// drawing
	c.setColor (Color.yellow);
	c.fillOval (100, 100, 200, 200);
	c.fillArc (400, 100, 200, 200, 90, 180);
	c.setFont (f);
	c.setColor (Color.black);
	c.drawString ("3/2 = 1 1/2", 220, 400);
	pauseProgram ();
	mainMenu ();
    }


    /*
    This method centres and displays the main menu on the console
    ----------------------------------------------------------------------------------------
    Local Variables: char choice.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    Input is taken through getChar()
    An if structure determines where the user is next directed to
    */
    public void mainMenu ()
    {
	char choice;
	title ();
	c.print (" ", 3);
	c.println ("Choose one of the following menu options by inputing the corresponding key:");
	c.println ();
	c.print (" ", 20);                          // prompts the user for their choice
	c.println ("1. Calculate");
	c.print (" ", 20);
	c.println ("2. Instructions");
	c.print (" ", 20);
	c.println ("Press any other key to exit");
	choice = c.getChar ();
	if (choice == '1')                          // directory
	{
	    askData ();
	}


	else if (choice == '2')
	{
	    instructions ();
	}
    }


    /*
    This method centres and displays the instructions of how to use the program
    ----------------------------------------------------------------------------------------
    Local Variables: none.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    No input/logic/loop is used
    */
    public void instructions ()
    {
	title ();
	c.println ("Enter the numerator and the denominator of the fraction you want to simplify");
	c.println ("in the calculation window. To return to the main menu,");
	pauseProgram ();
	mainMenu ();
    }


    /*
    This method asks the user to enter the values of the numerator and denominator. It is
    errortrapped and will only accept valid inputs
    ----------------------------------------------------------------------------------------
    Local Variables: String snum, sdum.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    While loops are used to errortrap the user input
    A try catch structure is used to errortrap
    Input is taken with readString(), and converted with Integer.parseInt();
    */
    public void askData ()
    {
	String snum, sdum;                  // local string input variables
	while (true)
	{
	    try
	    {
		c.setCursor (10, 3);
		c.println ();                           // clears line
		c.setCursor (10, 3);
		c.print ("Please enter your numerator:");
		snum = c.readString ();
		num = Integer.parseInt (snum);          // attempts to convert into int
		break;
	    }
	    catch (Exception e)
	    {
		new Message ("Please input an integer! Press ok.");     // default error message
	    }
	}


	while (true)
	{
	    try
	    {
		c.setCursor (11, 3);
		c.println ();                           // clears line
		c.setCursor (11, 3);
		c.print ("Please enter your denominator:");
		sdum = c.readString ();
		dum = Integer.parseInt (sdum);          // attempts to convert into int
		if (dum == 0)
		{ // more specific error message
		    new Message ("Please input a non zero integer value! Press ok.");
		}
		else
		    break;
	    }
	    catch (Exception e)
	    {
		new Message ("Please input an integer! Press ok.");     // default error message
	    }
	}


	display ();                                                     // runs display
    }


    /*
    This method centres and displays the final answer of the reduced mixed number.
    It first simplifies the fraction by the GCD, and outputs it based on what is left
    ----------------------------------------------------------------------------------------
    Local Variables: int ansNum, ansDum, wholeNum.
    Global Variables Used: num, dum.
    ----------------------------------------------------------------------------------------
    An if structure is used to determine how the output should look like
    */
    public void display ()
    {
	int ansNum, ansDum, wholeNum;                   // local variable declaration to store answer values
	title ();

	ansNum = num / reducedFraction (num, dum);      // divides original numerator by the GCD
	ansDum = dum / reducedFraction (num, dum);      // divides original denominator by the GCD
	wholeNum = ansNum / ansDum;                     // gets the value of the whole number for the mixed number
	ansNum = ansNum - wholeNum * ansDum;            // gets the new value of the numerator after taking
	// away the mixednumber
	// output message
	c.println ("The simplified mixed fraction with numerator " + num + " and denominator " + dum + " is");
	// selects which case to output
	if (ansNum == 0)                // case where the numerator of the remaining fraction is 0, so no fractional output
	{
	    c.println (wholeNum);       // only prints whole number
	}


	else if (wholeNum == 0)         // case where the total value is <1, so no whole value output
	{
	    c.println (ansNum + "/" + ansDum);      // only prints the fraction
	}


	else                            // case where both are needed
	    c.println (wholeNum + " " + ansNum + "/" + ansDum);     // outputs all

	pauseProgram ();
	mainMenu ();
    }


    /*
    This blackbox method centres and displays the title text at the top of the console.
    ----------------------------------------------------------------------------------------
    Local Variables: t.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    The GCD or GCF is returned.
    */
    private static int reducedFraction (int n, int d)       // is given the numerator and denominator
    {
	if (d == 0)                             // returns the GCD once the given number reaches 0 (after recursive subtraction)
	    return n;
	return reducedFraction (d, n - d * (n / d));    // returns recusively, the highest common factor
	// inputs (d, n%d)
    }


    /*
    This method displays the goodbye message and closes the program after the user reads it
    ----------------------------------------------------------------------------------------
    Local Variables: none.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    No input/logic/loop is used
    */
    public void goodbye ()
    {
	title ();
	c.println ("Thanks for using this program");        // goodbye message
	c.println ("By: Jae Park");
	pauseProgram ();
	c.close ();
    }


    public static void main (String[] args)
    {
	FractionSimplifier d = new FractionSimplifier ();
	d.splashScreen ();
	d.goodbye ();
	// Place your program here.  'c' is the output console
    } // main method
} // FractionSimplifier class
