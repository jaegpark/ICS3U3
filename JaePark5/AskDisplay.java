// The "AskDisplay" class.
/*
Jae Park
Mr. Rosen
2018-09-14
This program will store and output user information
*/
import java.awt.*;
import hsa.Console;

public class AskDisplay
{
    // declaration of variables
    public String username;
    public String password;
    public String hint;

    static Console c;           // The output console

    public AskDisplay ()
    {
	c = new Console ("User Information");
    }


    public void askData ()
    {
    
	c.println ("Please enter your username: ");
	username = c.readLine ();                   // gets the user input for the username
	c.println ("Please enter your password: ");
	password = c.readLine ();                   // gets the user input for the password
	c.println ("Please enter a hint to remember your password: ");
	hint = c.readLine ();                       // gets the user input for the hint
    }


    public void displayData ()
    {
	c.println ("So, " + username + ", your password is " + password + ", and your hint is " + hint + ".");      // final output message to confirm data
    }


    public static void main (String[] args)
    {
	AskDisplay d = new AskDisplay ();       
	d.askData ();       
	d.displayData ();       
	// Place your program here.  'c' is the output console
    } // main method
} // AskDisplay class
