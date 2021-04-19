// The "ForProblem2" class.
/*
Jae Park
Mr. Rosen
2018-09-29

This program will take a character input and use it as the character to draw a cursive capital A.
    The window will take the user input, clear the screen, and display the resulting image.

		VARIABLES
    NAME        TYPE        DESCRIPTION
    -------------------------------------------------------------------------------------------------------------------------
    userLetter  char        This variable stores the character entered by the user.


*/
import java.awt.*;
import hsa.Console;

public class ForProblem2
{
    static Console c;           // The output console

    // Variable declaration
    char userLetter;

    public ForProblem2 ()
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
    public void title ()  //prints title
    {
	String title = new String ("Character Design Gnerator");
	c.print (' ', 40 - title.length () / 2);    // Centres the text
	c.println (title);
	c.println ();
    }


    /*
    This method centres and displays the introduction text below the title in the console.
    --------------------------------------------------------------------------------------------------------------------------
    Local Variables: message.
    Global Variables Used: none.
    --------------------------------------------------------------------------------------------------------------------------
    No input/logic/loop is used
    */
    public void intro ()    // prints the introduction message
    {
	String message = new String ("This program will sketch a cursive 'A' with a user input character");
	c.print (' ', 40 - message.length () / 2);  // Centres the text
	c.println (message);
	c.println ();
    }


    /*
    This method prompts the user to enter their desired character.
    --------------------------------------------------------------------------------------------------------------------------
    Local Variables: none.
    Global Variables Used: none.
    --------------------------------------------------------------------------------------------------------------------------
    Input is obtained here.
    */
    public void askData ()
    {
	c.print ("Please enter the character: ");
	userLetter = c.readChar ();
    }


    /*
    This overloaded method takes in the number of spaces and number of characters, and outputs the design accordingly
    --------------------------------------------------------------------------------------------------------------------------
    Local Variables: numSpace, numChar
    Global Variables Used: userLetter
    --------------------------------------------------------------------------------------------------------------------------
    Two for loops and user input are used.
    */
    private void output (int numSpace, int numChar)
    {
	for (int i = 0 ; i < numSpace ; i++)    // This for loop prints the number of spaces
	{
	    c.print (" ");
	}
	for (int i = 0 ; i < numChar ; i++)     // This for loop prints the number of characters
	{
	    c.print (userLetter);
	}
    }


    /*
    This overloaded method calles output(int, int) and adds a new line, so that the next line can be drawn.
    --------------------------------------------------------------------------------------------------------------------------
    Local Variables: numSpace, numChar
    Global Variables Used: none.
    --------------------------------------------------------------------------------------------------------------------------
    No input/logic/loop is used
    */
    private void output (int numSpace, int numChar, boolean newLine)
    {
	output (numSpace, numChar);             // Calls the output method to display the spaces and characters
	c.println ();                           // Adds a new line
    }


    /*
    This method clears the window and calls the two overloaded methods accordingly to design
    --------------------------------------------------------------------------------------------------------------------------
    Local Variables: none.
    Global Variables Used: none.
    --------------------------------------------------------------------------------------------------------------------------
    No input/logic/loop is used
    */
    public void displayDesign ()
    {
	c.clear ();         // Clears input/intro/title window
	// Line number indicated on the first calling of the overloaded methods
	output (45, 3, true);       //1
	output (44, 4, true);       //2
	output (43, 5, true);       //3
	output (43, 5, true);       //4
	output (42, 2);             //5
	output (1, 3, true);
	output (42, 2);             //6
	output (1, 3, true);
	output (42, 2);             //7
	output (1, 3, true);
	output (41, 3);             //8
	output (1, 3, true);
	output (41, 2);             //9
	output (2, 3, true);
	output (40, 3);             //10
	output (2, 3, true);
	output (36, 2);             //11
	output (1, 3);
	output (3, 3, true);
	output (35, 7);             //12
	output (3, 3, true);
	output (34, 2);             //13
	output (3, 2);
	output (4, 3, true);
	output (34, 2);             //14
	output (2, 4);
	output (3, 3, true);
	output (35, 2);             //15
	output (1, 4);
	output (3, 3, true);
	output (35, 2);             //16
	output (1, 2);
	output (1, 2);
	output (2, 3, true);
	output (35, 4);             //17
	output (2, 3);
	output (1, 3, true);
	output (36, 3);             //18
	output (3, 2);
	output (1, 3, true);
	output (36, 3);             //19
	output (4, 5, true);
	output (35, 5);             //20
	output (3, 5, true);
	output (35, 2);             //21
	output (2, 2);
	output (3, 4, true);
	output (34, 3);             //22
	output (2, 3);
	output (3, 3, true);
	output (34, 2);             //23
	output (4, 8, true);
	output (33, 3);             //24
	output (7, 5);
    }


    /*
    This is the main method that creates a new instance of the class dd
    --------------------------------------------------------------------------------------------------------------------------
    Local Variables: none.
    Global Variables Used: none.
    --------------------------------------------------------------------------------------------------------------------------
    No input/logic/loop is used
    */
    public static void main (String[] args)
    {
	ForProblem2 dd = new ForProblem2 ();
	dd.title ();
	dd.intro ();
	dd.askData ();
	dd.displayDesign ();

	// Place your program here.  'c' is the output console
    } // main method
} // ForProblem2 class
