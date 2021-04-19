/*
Jae Park
Mr. Rosen
2018-11-27
This program is a file management system with the file extension .jae

Bad header file: badheader.jae
Bad extension file = badextension.jaa
Working file = workingfile.jae with value 10
*/

// The "Numbereditor" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
import hsa.Message;

public class Numbereditor
{
    // Global variable declaration
    static Console c;           // The output console
    static int userInt = 0;     // Stores the integer value of user input
    String userInput = "";      // Stores the string input of the user input
    String fileName = "Untitled";   // Stores the title name
    static String choice = "";  // Stores the user choice
    boolean saved = true;       // Stores the saved boolean to check if the value is saved or not
    static boolean newname = false; // Stores the boolean to check if the user has saved as


    public Numbereditor ()
    {
	c = new Console ();
    }


    // this method outputs the title on the  top of the screen
    public void title ()
    {
	c.clear ();
	String title = fileName + ".jae";
	c.print (' ', 40 - title.length () / 2);    // centres text
	c.println (title);
	c.println ();
    }


    // this method outputs the main menu and prompts the user for input
    public void mainMenu ()
    {
	title ();
	// List of options printed in the main menu
	c.println ("(a) New");
	c.println ("(b) Open");
	c.println ("(c) Modify");
	c.println ("(d) Display");
	c.println ("(e) Save");
	c.println ("(f) Save As");
	c.println ("(g) Quit");

	// ERRORTRAPPING
	while (true)
	{
	    c.setCursor (10, 7);
	    c.println ();
	    c.setCursor (10, 7);
	    c.print ("Please enter one of the menu choices: ");     // prompts for input
	    choice = c.readLine ();     // gets user input
	    // If not a valid choice input
	    if (!(choice.equals ("a") || choice.equals ("b") || choice.equals ("c")
			|| choice.equals ("d") || choice.equals ("e") || choice.equals ("f") || choice.equals ("g")))
	    {
		new Message ("Please enter a valid choice!", "Error!");
	    }
	    // If user has entered data and chooses to exit/open/new
	    else if (saved == false && !(choice.equals ("e") || choice.equals ("f") || choice.equals ("c") || choice.equals ("d")))
	    {
		new Message ("Please save your work!", "Error!");
	    }
	    // If user does anything but new, open, or exit when there is nothing to manipulate
	    else if (userInput.equals ("") && !(choice.equals ("a") || choice.equals ("b") || choice.equals ("g")))
	    {
		new Message ("There is nothing to do!", "Error!");
	    }
	    else
		break;
	}

    }


    // this method asks for new data for modify and new
    public void askData (boolean temp)
    {
	if (temp == true)   // checks if this askData is for a new file
	{
	    newname = false;
	    fileName = "Untitled";  // if it's for a new file, it  changes the fileename to Untitled because  it's a new file
	}
	title ();

	// ERRORTRAP
	while (true)
	{
	    try
	    {
		title ();
		c.print ("Please enter the integer you wish to store: ");
		userInput = c.readLine ();                  // reads user input
		userInt = Integer.parseInt (userInput);       // converts the user input string into an integer
		break;
	    }
	    catch (Exception e)
	    {
		new Message ("Please input an integer. Press ok", "Error!");    // error message
	    }
	}
	saved = false;      // sets saved = false because new data has been entered

    }


    // this method displays the string value of user input
    public void display ()
    {
	title ();
	c.println ("The current value is " + userInput);
	pauseProgram ();
    }


    // this method saves the current value to the file opened
    public void save ()
    {
	title ();
	PrintWriter output;
	try
	{
	    output = new PrintWriter (new FileWriter (fileName + ".jae"));
	    output.println ("% Numbereditor - v.1");
	    output.println (userInt);       // stores the user input
	    output.close ();
	}
	catch (Exception e)
	{
	}
	saved = true;       // resets saved boolean
	new Message ("Succesfully saved!");     // shows message to user

    }


    // this method does a save as save
    public void saveas (boolean t)
    {
	title ();
	PrintWriter output;
	boolean valid = true;   // this boolan is to see if the user's desired file name is valid
	if (t == true)      // if this was a redirect because user pressed save instead of save as in the beginning, it will tell the user they were redirected
	{
	    new Message ("You have been redirected to save as.", "Notice!");
	}
	while (true)
	{
	    String temp = "";   // temp string to store the filename read
	    c.setCursor (3, 10);
	    c.print ("Please enter the file name you wish to save it as: ");
	    fileName = c.readLine ();
	    // Errortrap for illegal windows keys
	    for (int i = 0 ; i < fileName.length () ; i++)  // goes throguh string to check for illegal windows keys
	    {
		if (fileName.charAt (i) == '>' || fileName.charAt (i) == '<' || fileName.charAt (i) == '"' || fileName.charAt (i) == '/' || fileName.charAt (i) == '\\'
			|| fileName.charAt (i) == '|' || fileName.charAt (i) == '?' || fileName.charAt (i) == '*' || fileName.charAt (i) == ':')
		{
		    valid = false;  // sets valid to false
		    new Message ("Please enter proper windows characters!", "Error!");  // error message
		    break;
		}
	    }
	    // Only takes the filename up to the period, if there is one
	    for (int i = 0 ; i < fileName.length () ; i++)
	    {
		if (fileName.charAt (i) != '.')
		{
		    temp += fileName.charAt (i);        // adds character to temp if there is no period
		}
		else        // once a period is found it breaks
		{
		    new Message ("Please enter a valid file name! No periods.", "Error!");
		    fileName = "Untitled";  // resets name to untitled
		    break;
		}
	    }
	    fileName = temp;    // sets filename without extension to the correct temp string
	    if (valid == true)
		break;  // breaks the while loop once everything is ok
	}
	try
	{
	    output = new PrintWriter (new FileWriter (fileName + ".jae"));
	    output.println ("% Numbereditor - v.1");
	    output.println (userInt);   // puts the new value into the new file
	    output.close ();
	}
	catch (Exception e)
	{
	}
	saved = true;       // resets saved to true
	newname = true;     // resets new name to true, because there is a new name
    }


    // this method opens the file
    public void open ()
    {
	String temp = "";       // this string stores the header value
	boolean valid = true;   // this boolean is to check if it's a valid file name
	BufferedReader input;

	title ();
	// ERRORTRAP
	while (true)
	{
	    valid = true;   // sets valid to true
	    c.setCursor (3, 10);
	    c.println ();
	    c.setCursor (3, 10);
	    c.print ("Enter file name, including the extension .jae: ");  // prompts input
	    fileName = c.readLine ();

	    if (fileName.length () < 4) // check if the file name input is too short
	    {
		new Message ("Not a valid file name!", "Error!");
	    }
	    else    // otherwise
	    {
		if (!((fileName.substring (fileName.length () - 4)).equals (".jae")))   // if the extension is not included/valid in the unput
		{
		    new Message ("Invalid file extension!", "Error!");
		}
		else    // otherwise
		{
		    for (int i = 0 ; i < fileName.length () ; i++)  // checks for illegal windows keys
		    {
			if (fileName.charAt (i) == '>' || fileName.charAt (i) == '<' || fileName.charAt (i) == ':'
				|| fileName.charAt (i) == '"' || fileName.charAt (i) == 92 || fileName.charAt (i) == '/'
				|| fileName.charAt (i) == '|' || fileName.charAt (i) == '?' || fileName.charAt (i) == '*')
			{
			    valid = false;
			    break;      // breaks the for loop
			}
		    }
		    if (valid == false) // final check for valid, if false generic error message
		    {
			new Message ("Invalid file name!", "Error!");
		    }
		    else        // otherwise break the while loop
			break;
		}
	    }
	}

	try
	{
	    input = new BufferedReader (new FileReader (fileName));
	    temp = input.readLine ();   // gets the header value
	    userInput = input.readLine ();      // gets the string value of the number inside the file
	    if (temp.equals ("% Numbereditor - v.1"))   // checks if good header
	    {
		c.println ();
		c.println ("The integer value in the file " + fileName + " is: " + userInput);           // output message if valid
		fileName = fileName.substring (0, fileName.length () - 4);      // sets filename without extension for the new mainmenu title
		saved = true;       // resets saved to true
		newname = true;     // resets newname to true
		pauseProgram ();        // pauses program so user can see the file inside
	    }
	    else
	    {
		new Message ("This type of file cannot be opened with this program. Bad header!", "Error!");    // error message for bad header
		fileName = "Untitled";      // resets file name
	    }
	}
	catch (IOException e)
	{
	    fileName = "Untitled";
	    new Message ("File does not exist!", "Error!"); // file doesn't exist if nothing is found
	}

    }


    // this method pauses the program by getting a key
    public void pauseProgram ()
    {
	char key;
	c.print ("Press any key to continue...");           // pauses program
	key = c.getChar ();
    }


    // this method shows the goodbye message
    public void goodbye ()
    {
	title ();
	c.println ("Thanks for using this program!");
	c.println ("By: Jae Park");     // prints the goodbye message
	pauseProgram ();
	c.close ();             // closes the ouput window
    }


    // main method controls the directory
    public static void main (String[] args)
    {
	Numbereditor d = new Numbereditor ();
	while (true)
	{
	    d.mainMenu ();
	    // Directory
	    if (choice.equals ("a"))
	    {
		d.askData (true);
	    }
	    else if (choice.equals ("b"))
	    {
		d.open ();
	    }
	    else if (choice.equals ("c"))
	    {
		d.askData (false);
	    }
	    else if (choice.equals ("d"))
	    {
		d.display ();
	    }
	    else if (choice.equals ("e"))
	    {
		// If the user has entered data and presses save instead of save as, it redirects the user to save as instead of save
		if (newname == false)
		{
		    d.saveas (true);
		}
		else
		    d.save ();
	    }
	    else if (choice.equals ("f"))
	    {
		d.saveas (false);
	    }
	    else if (choice.equals ("g"))
		break;
	}
	d.goodbye ();

	// Place your program here.  'c' is the output console
    } // main method
} // Numbereditor class


