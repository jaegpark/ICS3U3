/*
Jae Park
Mr. Rosen
2018-09-06
This program will output a shapes using letters
*/
import java.awt.*;
import hsa.Console;

public class MyDesigns
{
    static Console c;           // The output console
    public void drawTitle ()            // Draw title method
    {
	// commands to draw the title
	c.println ();
	c.print (' ', 37);
	c.println ("Designs");
	c.println ();
    }


   public void drawParallelogram ()       // Draw parallelogram method
    {
	// commands to draw the parallelogram
	c.println ();
	c.print (' ', 34);
	c.print ("PARALLELO");
	c.println ();
	c.print (' ', 35);
	c.print ("A");
	c.print (' ', 7);
	c.print ("G");
	c.println ();
	c.print (' ', 36);
	c.print ("R");
	c.print (' ', 7);
	c.print ("R");
	c.println ();
	c.print (' ', 37);
	c.print ("A");
	c.print (' ', 7);
	c.print ("A");
	c.println ();
	c.print (' ', 38);
	c.print ("LLELOGRAM");
    }


    public void drawDiamond ()      //Draw diamond method
    {
	//commands to draw the diamond
	c.print (' ', 40);
	c.print ("D");
	c.println ();
	c.print (' ', 39);
	c.print ("III");
	c.println ();
	c.print (" ", 38);
	c.print ("AAAAA");
	c.println ();
	c.print (' ', 37);
	c.print ("MMMMMMM");
	c.println ();
	c.print (' ', 38);
	c.print ("OOOOO");
	c.println ();
	c.print (' ', 39);
	c.print ("NNN");
	c.println ();
	c.print (' ', 40);
	c.print ("D");
	c.println ();
    }


    public MyDesigns ()
    {
	c = new Console ();     //creates a new console window
    }


    public static void main (String[] args)
    {
	MyDesigns d;        //creates insteance of variable myDesigns
	d = new MyDesigns ();
	d.drawTitle ();
	d.drawDiamond ();
	d.drawParallelogram ();
	// Executes all methods and constructs my design object

    } // main method
} // MyDesigns class
