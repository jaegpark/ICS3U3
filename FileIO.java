// The "FileIO" class.
import java.awt.*;
import hsa.Console;
import java.io.*;

public class FileIO
{
    static Console c;           // The output console

    public FileIO ()
    {
	c = new Console ();
    }


    public void writeFile ()
    {
	PrintWriter output;
	String fileName;

	c.println ("Saving a File in Java!");
	c.print ("Enter file name: ");
	fileName = c.readLine ();

	try
	{
	    output = new PrintWriter (new FileWriter (fileName));
	    c.println ("This message is outputting to your moneitor.");
	    output.println ("This message is saving to a file");
	    output.close ();
	}
	catch (IOException e)
	{
	}
    }


    public void readFile ()
    {
	String fileName, line = "";
	BufferedReader input;

	c.println ("Reading a Filein Java!");
	c.print ("Enter file name: ");
	fileName = c.readLine ();

	try
	{
	    input = new BufferedReader (new FileReader (fileName));
	    line = input.readLine ();
			
	}
	catch (IOException e)
	{
	}
	c.println ("The line in the file " + fileName + " is: " + line);
    }


    public static void main (String[] args)
    {
	FileIO d = new FileIO ();
	d.writeFile ();
	d.readFile ();
	// Place your program here.  'c' is the output console
    } // main method
} // FileIO class
