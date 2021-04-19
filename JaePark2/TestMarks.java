/*
Jae Park
Mr. Rosen
2018-09-11
This program will output the marks and averages for three students
*/
import java.awt.*;
import hsa.Console;

public class TestMarks
{
    static Console c;           // The output console

    public TestMarks ()
    {
	c = new Console ();        // Creates a new console window
    }


    public void drawTitle ()
    {
	// Draws the title
	c.print (" ", 5);
	c.print ("Student");
	c.print (" ", 14);
	c.print ("Test 1");
	c.print (" ", 10);
	c.print ("Test 2");
	c.print (" ", 20);
	c.println ("Test Average");

    }


    public void displayMarks ()
    {
	//First row of marks for goofy
	c.println (" ");
	c.print (" ", 5);
	c.print ("Goofy");
	c.print (79, 18);
	c.print (60, 16);
	c.print ((79.00 + 60) / 2, 29, 2);
	//Second row of marks for sneezy
	c.println (" ");
	c.print (" ", 5);
	c.print ("Sneezy");
	c.print (50, 17);
	c.print (40, 16);
	c.print ((50.00 + 40.00) / 2, 29, 2);
	//Third row of marks for sleepy
	c.println (" ");
	c.print (" ", 5);
	c.print ("Sleepy");
	c.print (92, 17);
	c.print (93, 16);
	c.print ((92.00 + 93.00) / 2, 29, 2);

    }


    public static void main (String[] args)
    {
	TestMarks d;            // creates insteace of variable in my designs
	d = new TestMarks ();
	d.drawTitle ();
	d.displayMarks ();
	// Place your program here.  'c' is the output console
    } // main method
} // TestMarks class
