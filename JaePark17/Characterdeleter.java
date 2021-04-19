/*
Jae Park
2018-11-22
Mr. Rosen
This program will take in a string where the user can delete the specific
occurence of a character they input.

	GLOBAL VARIABLES
    NAME        TYPE        DESCRIPTION
    ------------------------------------------------------------------------------------
    mainS       String      This variable stores the main string the user will manipulate
    replace     char        This variable stores the character the user wants to replace
    occurence   int         This variable stores the occurence number of the character

*/
// The "Characterdeleter" class.
import java.awt.*;
import hsa.Console;
import hsa.Message;

public class Characterdeleter
{
    static Console c;           // The output console

    // Variable Declaration
    String mainS;
    char replace;
    int occurence;

    public Characterdeleter ()
    {
	c = new Console ("Character Deleter");
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
	String t = "Character Deleter";
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
	c.print (' ', 27);
	c.print ("Press any key to continue...");           // pauses program
	key = c.getChar ();
    }


    /*
    This method displays the title, draws a splashart, and prompts the user to continue
    ----------------------------------------------------------------------------------------
    Local Variables: none.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    No input/logic/loop is used
    */
    public void splashScreen ()
    {
	Font f = new Font ("Comic Sans MS", Font.BOLD, 36);
	// drawing
	c.setColor (Color.black);
	c.fillRect (0, 250, 640, 500);      // background
	c.setColor (Color.yellow);
	c.fillOval (100, 100, 200, 200);    // face
	c.setColor (Color.black);
	c.fillOval (150, 150, 20, 20);      //facial features
	c.fillOval (230, 150, 20, 20);
	c.drawArc (160, 210, 80, 40, 180, 180);
	c.setFont (f);                  // new font
	c.drawString ("H llo = Hllo", 400, 200);
	c.drawString ("e", 440, 160);
	c.drawLine (440, 170, 435, 180);
	c.setColor (Color.white);
	c.drawString ("Character Deleter", 200, 400);
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
	c.println ("1. Run Program");
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
	title ();   // prompts instructions
	c.println ("This program will delte the specific occurence of a character from a location");
	c.println ("within a string, based on user input.");
	c.println ("You will input the original string, the character you wish to replace, and the");
	c.println ("occurence number.");
	pauseProgram ();
	mainMenu ();
    }


    /*
    This method asks the user to enter the inputs for the global variables. This will be errortrapped
    ----------------------------------------------------------------------------------------
    Local Variables: String snum.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    While loops are used to errortrap the user input
    A try catch structure is used to errortrap integer input
    String input is taken with readLine(), and integers are converted with Integer.parseInt();
    */
    public void askData ()
    {
	String snum;
	while (true)
	{
	    c.setCursor (10, 3);
	    c.println ();                           // clears line
	    c.setCursor (10, 3);
	    c.println ("Please enter the string you wish to operate on:");      // prompts input
	    mainS = c.readLine ();                  // obtains main string value
	    if (mainS.length () == 0)               // errortrap for empty string
	    {
		new Message ("Please input a non-empty string. Press OK");     // default error message
	    }
	    else
		break;
	}

	c.setCursor (12, 3);
	c.println ();                           // clears line
	c.setCursor (12, 3);
	c.println ("Please enter the character you wish to delete:");           // prompts input
	replace = c.getChar ();                 // obtains char (no errortrap needed)

	while (true)
	{
	    try
	    {
		c.setCursor (14, 3);
		c.println ();                           // clears line
		c.setCursor (14, 3);
		c.println ("Please enter the specific occurence of the character"); //promps input
		snum = c.readString ();             // gets string input
		occurence = Integer.parseInt (snum);          // attempts to convert into int
		break;
	    }
	    catch (Exception e)
	    {
		new Message ("Please input an integer! Press ok.");     // default error message
	    }
	}
	display ();

    }


    /*
    This method centres and displays the final string after manipulating the string
    This method uses the blackbox method
    ----------------------------------------------------------------------------------------
    Local Variables: none.
    Global Variables Used: mainS, replace, occurence
    ----------------------------------------------------------------------------------------
    No input/logic/loop is used
    */
    public void display ()
    {
	title ();
	c.println ("The resulting string, after taking away the " + occurence + " occurence of " + replace + " is");
	c.println (charDelete (mainS, replace, occurence));     // calls blackbox to output manipulated string
	pauseProgram ();
	mainMenu ();            // goes back to main program
    }


    /*
    This blackbox method removes the specific occurence of a character inside a string
    ----------------------------------------------------------------------------------------
    Local Variables: String ans, int counter.
    Global Variables Used: none.
    ----------------------------------------------------------------------------------------
    The manipulated string is rerturned
    */
    private static String charDelete (String mainStr, char findChar, int intOccurence)
    {
	String ans = "";            // blank string to store answer
	int counter = 0;            // counter of coutning occurence
	for (int i = 0 ; i < mainStr.length () ; i++)       // goes through the main string
	{
	    // checks if it is a character (not case sensitive) and if its equal to the char the user wants to find (not case sensitive)
	    if ((mainStr.charAt (i) == findChar || mainStr.charAt (i) == findChar - 32 || mainStr.charAt (i) == findChar + 32)
		    && ((findChar <= 'z' && findChar >= 'a') || (findChar <= 'Z' && findChar >= 'A')))
	    {
		counter++;      // adds one to counter
		if (counter != intOccurence)
		{
		    ans += mainStr.charAt (i);      // adds the character of mainStr if it isnt the specific occurence of the findchar
		}
	    }
	    else if (mainStr.charAt (i) == findChar)    // sees if the character of mainStr is equal to findchar (for non alphabet)
	    {
		counter++;          // adds one to ocunter
		if (counter != intOccurence)        // adds the character of mainStr if it isnt the specific occurence of the findchar
		{
		    ans += mainStr.charAt (i);
		}
	    }
	    else
	    {
		ans += mainStr.charAt (i);      // if none are equal it just copies the mainStr character
	    }
	}
	return ans;     // returns ans
    }


    /*
    Thismethod displays the goodbye message and closes the program after the user reads it
    ----------------------------------------------------------------------------------------
    LocalVariables: none.
    GlobalVariables Used: none.
    ----------------------------------------------------------------------------------------
    Noinput/logic/loop is used
    */
    public void goodbye ()
    {
	title ();
	c.print (' ', 25);
	c.println ("Thanks for using this program!");        // goodbye message
	c.println ();
	c.print (' ', 34);
	c.println ("By: Jae Park");
	pauseProgram ();
	c.close ();
    }


    public static void main (String[] args)
    {
	Characterdeleter d = new Characterdeleter ();
	d.splashScreen ();
	d.goodbye ();
	// Place your program here.  'c' is the output console
    } // main method
} // Characterdeleter class
