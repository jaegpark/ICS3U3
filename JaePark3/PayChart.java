// The "PayChart" class.
/*
Jae Park
Mr. Rosen
2018-09-12
This program will output a chart of Star Wars Limited's employees' pay's
*/
import java.awt.*;
import hsa.Console;

public class PayChart
{
    static Console c;           // The output console
    public PayChart ()
    {
	c = new Console ("Star Wars Limited Employee Salary");
    }


    public void drawTitle ()
    {
	// outputs the main title
	c.print (' ', 31);
	c.println ("Star Wars Limited");
	c.println ();
    }


    public void displaySalary ()
    {
	// variable declaration and assignment
	double hrLuke = 59.50;
	double hrR2D2 = 4.25;
	double hrC3PO = 92.00;
	int hrsLuke = 2;
	int hrsR2D2 = 40;
	int hrsC3PO = 15;
	double gmsLuke = hrLuke * hrsLuke * 4;
	double gmsR2D2 = hrR2D2 * hrsR2D2 * 4;
	double gmsC3PO = hrC3PO * hrsC3PO * 4;

	// outputs headings for the chart
	c.print (' ', 4);
	c.print ("Employee");
	c.print (' ', 6);
	c.print ("Hourly Rate");
	c.print (' ', 6);
	c.print ("Total Hours Per Week");
	c.print (' ', 5);
	c.println ("Gross Monthly Salary");
	c.println ();

	//outputs luke row
	c.print (' ', 4);
	c.print ("Luke");
	c.print (' ', 13);
	c.print ("$");
	c.print (hrLuke, 0, 2);
	c.print (' ', 18);
	c.print (hrsLuke);
	c.print (' ', 21);
	c.print ("$");
	c.println (gmsLuke, 0, 2);

	//outputs R2D2 row
	c.print (' ', 4);
	c.print ("R2D2");
	c.print (' ', 13);
	c.print ("$");
	c.print (hrR2D2, 0, 2);
	c.print (' ', 19);
	c.print (hrsR2D2);
	c.print (' ', 20);
	c.print ("$");
	c.println (gmsR2D2, 0, 2);

	//outputs C3PO row
	c.print (' ', 4);
	c.print ("C3PO");
	c.print (' ', 13);
	c.print ("$");
	c.print (hrC3PO, 0, 2);
	c.print (' ', 18);
	c.print (hrsC3PO);
	c.print (' ', 20);
	c.print ("$");
	c.println (gmsC3PO, 0, 2);
    }


    public static void main (String[] args)
    {
	PayChart d = new PayChart ();    //creates new insteance of PayChart
	d.drawTitle ();
	d.displaySalary ();
	// Place your program here.  'c' is the output console
    } // main method
} // PayChart class
