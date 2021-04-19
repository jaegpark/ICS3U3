/*
Jae Park
2018-11-01
Mr. Rosen
This program will take in user input of two variables of double value in the equation grade = rise/run, and calculate the third variable

The window will take the user choice if they wish to proceed, ask for a calculation option, calculate and display the value, and promt the user if they wish to continue to calculate

		VARIABLES
    NAME        TYPE        DESCRIPTION
    -------------------------------------------------------------------------------------------------------------------------
    menuChar    char        This variable stores the decision to use the program, entered by the user
    choice      char        This variable takes in the menu option of the user in askData
    grade       double      This variable stores the double value of the grade, that CAN be given by user input
    rise        double      This variable stores the rise value of the rise, that CAN be given by user input
    run         double      This variable stores the run value of the run, that CAN be given by user input

*/

// The "Equation" class.
import java.awt.*;
import hsa.Console;
import hsa.Message;

public class Equation
{

    static Console c;           // The output console

    // global variable declaration
    static char menuChar;
    char choice;
    double grade;
    double rise;
    double run;

    public Equation ()
    {
	c = new Console ();
    }


    /*
	This method centres and displays the title text at the top of the console.
	--------------------------------------------------------------------------------------------------------------------------
	Local Variables: title.
	Global Variables Used: none.
	--------------------------------------------------------------------------------------------------------------------------
	No input/logic/loop is used
    */
    public void title ()
    {
	c.clear ();
	String title = new String ("Grade Calculator");
	c.print (' ', 40 - title.length () / 2);    // Centres the text
	c.println (title);
	c.println ();
    }


    /*
	This method displays instructions to continue, and pauses the program temporarily
	--------------------------------------------------------------------------------------------------------------------------
	Local Variables: pauseChar.
	Global Variables Used: none.
	--------------------------------------------------------------------------------------------------------------------------
	input: readChar
    */
    public void pauseProgram ()
    {
	char pauseChar;
	c.print ("Please press any key to continue...");
	pauseChar = c.readChar ();
    }


    /*
	This method displays the intro message to the user, and promts for the choice to continue
	--------------------------------------------------------------------------------------------------------------------------
	Local Variables: none.
	Global Variables Used: menuChar
	--------------------------------------------------------------------------------------------------------------------------
	Input: getChar
    */
    public void intro ()
    {
	title ();
	c.println ("This program will calculate the missing value in the equation grade = rise/run.");
	c.println ("Press c to continue. Press any other key to exit.");
	menuChar = c.getChar ();                    // displays message and gets character choice
    }


    /*
	This method asks the user for choice of calculation, and corresponding data in string.
	It then converts string to double and calculates the result and calls display()
	--------------------------------------------------------------------------------------------------------------------------
	Local Variables: riseS, runS, gradeS.
	Global Variables Used: rise, run, grade, choice
	--------------------------------------------------------------------------------------------------------------------------
	Input: readString, readDouble
	Loop: none
	Logic: switch(choice), try catch structure of Double.parseDouble
    */
    public void askData ()
    {
	String riseS;
	String runS;
	String gradeS;
	title ();
	c.println ("Please choose one of the following options by entering the number that ");  // prompts the user for choice
	c.println ("corresponds to it: ");
	c.print (" ", 10);
	c.println ("1. Calculate the rise");
	c.print (" ", 10);
	c.println ("2. Calculate the run");
	c.print (" ", 10);
	c.println ("3. Calculate the grade");
	c.print (" ", 10);
	c.println ("Enter any character to exit");
	choice = c.getChar ();
	// conditions of action based on choice
	switch (choice)
	{
	    case '1':
		c.println ("Please enter the grade:");
		gradeS = c.readString ();
		try
		{
		    grade = Double.parseDouble (gradeS);    // attemps to covert string to double
		}
		catch (NumberFormatException e)
		{
		    Message m = new Message ("Please enter a valid input!");        // if not successful, it will send error message and ask for data again
		    askData ();                                                     // reasks for data
		}
		c.println ("Please enter the run:");
		runS = c.readString ();
		try
		{
		    run = Double.parseDouble (runS);        // attempts to convert string to double
		}
		catch (NumberFormatException e)
		{
		    Message m = new Message ("Please enter a valid input!");        // if not successful, it will send error message and ask for data again
		    askData ();                                                     // reasks for data
		}
		rise = grade * rise;
		display ();
		break;

	    case '2':
		c.println ("Please enter the grade:");
		gradeS = c.readString ();
		try
		{
		    grade = Double.parseDouble (gradeS);        // attempts to convert string to double
		}
		catch (NumberFormatException e)
		{
		    Message m = new Message ("Please enter a valid input!");        // if not successful, it will send error message and ask for data again
		    askData ();                                                     // reasks for data
		}
		c.println ("Please enter the rise:");
		riseS = c.readString ();
		try
		{
		    rise = Double.parseDouble (riseS);        // attempts to convert string to double
		}
		catch (NumberFormatException e)
		{
		    Message m = new Message ("Please enter a valid input!");        // if not successful, it will send error message and ask for data again
		    askData ();                                                     // reasks for data
		}
		run = rise / grade;
		display ();
		break;

	    case '3':
		c.println ("Please enter the rise:");
		riseS = c.readString ();
		try
		{
		    rise = Double.parseDouble (riseS);        // attempts to convert string to double
		}
		catch (NumberFormatException e)
		{
		    Message m = new Message ("Please enter a valid input!");        // if not successful, it will send error message and ask for data again
		    askData ();                                                     // reasks for data
		}
		c.println ("Please enter the run:");
		runS = c.readString ();
		try
		{
		    run = Double.parseDouble (runS);        // attempts to convert string to double
		}
		catch (NumberFormatException e)
		{
		    Message m = new Message ("Please enter a valid input!");        // if not successful, it will send error message and ask for data again
		    askData ();                                                     // reasks for data
		}
		grade = rise / run;
		display ();
		break;
	    default:    // does nothing for exit condition so it goes to goodbye
	}
    }


    /*
	This method displays the calculated result to the user, based on which case it was given
	--------------------------------------------------------------------------------------------------------------------------
	Local Variables: none.
	Global Variables Used: choice
	--------------------------------------------------------------------------------------------------------------------------
	Logic: switch(choice)
    */
    public void display ()
    {
	title ();
	switch (choice)     // outputs message based on user input
	{
	    case '1':
		c.print ("The rise with grade " + grade + " and run " + run + " is equal to ");
		c.println (rise, 0, 2);
		break;
	    case '2':
		c.print ("The run with grade " + grade + " and rise " + rise + " is equal to ");
		c.println (run, 0, 2);
		break;
	    case '3':
		c.print ("The grade with rise " + rise + " and run " + run + " is equal to ");
		c.println (grade, 0, 2);
		break;
	}
	pauseProgram ();
	askData ();
    }


    /*
	This method displays the goodbye text in the console window.
	--------------------------------------------------------------------------------------------------------------------------
	Local Variables: none.
	Global Variables Used: none.
	--------------------------------------------------------------------------------------------------------------------------
	No input/logic/loop is used
    */
    public void goodbye ()
    {
	title ();
	// animation/drawing
	for (int i = 0 ; i < 30 ; i++)
	{
	    // erase
	    c.setColor (Color.white);
	    c.fillOval (300, 251 - i, 81, 81);
	    //draw
	    c.setColor (Color.yellow);
	    c.fillOval (300, 250 - i, 80, 80);
	    c.setColor (Color.black);
	    c.fillOval (320, 270 - i, 10, 10);
	    c.fillOval (350, 270 - i, 10, 10);
	    c.drawArc (320, 290 - i, 40, 20, 180, 180);
	    // delay
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.println ("Thanks for using this program!");   // goodbye message
	c.println ("By: Jae Park");
	pauseProgram ();
	c.close ();
    }


    /*
    This is the main method that creates a new instance of the class e
    --------------------------------------------------------------------------------------------------------------------------
    Local Variables: none.
    Global Variables Used: none.
    --------------------------------------------------------------------------------------------------------------------------
    Logic:if
    Loop: while
    */
    public static void main (String[] args)
    {
	Equation e = new Equation ();
	e.intro ();
	if (menuChar == 'c' || menuChar == 'C') // only runs the askdata if conditions are met
	{
	    e.askData ();
	}
	e.goodbye ();
	// Place your program here.  'c' is the output console
    } // main method
} // Equation class


