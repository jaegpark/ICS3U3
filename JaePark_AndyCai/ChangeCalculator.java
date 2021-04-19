// The "ChangeCalculator" class.
/*
Jae Park and Andy Cai
2018-09-21
Mr. Rosen
This program will output the change needed to pay back
*/
import java.awt.*;
import hsa.Console;

public class ChangeCalculator
{
    static Console c;           // The output console

    // variable declaration and assignments
    public double cost;
    public double paid;


    public ChangeCalculator ()
    {
	c = new Console ("Change Making Program");
    }


    public void input ()
    {
	c.print (" ", 30);
	c.println ("Change Calculator");
	c.println ();
	c.print ("Please enter the total purchase: ");
	cost = c.readDouble ();     // gets the cost of purchase
	c.print ("Please enter the amount tendered: ");
	paid = c.readDouble ();     // gets the tendered of purchase
    }


    public void calculations ()
    {
	int tenBill, fiveBill, twoCoin, loonie, quarters, nickel, pennies;
	int change = (int) (100 * paid - 100 * cost);
	// calculates the change to be paid
	c.print ("The change will be $");
	c.println (change, 0, 2);
	// calculates most efficient way to give change, by dividing and resetting change value to the remainder, after the highest bill has been taken away
	tenBill = change / 1000;
	change = change % 1000;
	fiveBill = change / 500;
	change = change % 500;
	twoCoin = change / 200;
	change = change % 200;
	loonie = change / 100;
	change = change % 100;
	quarters = change / 25;
	change = change % 25;
	nickel = change / 5;
	change = change % 5;
	pennies = change / 1;
	//output messages
	c.println ("To make up this amount you will need:");
	c.println (tenBill + " ten-dollar bill");
	c.println (fiveBill + " five-dollar bill");
	c.println (twoCoin + " two-dollar coin");
	c.println (loonie + " loonie");
	c.println (quarters + " quarters");
	c.println (nickel + " nickel");
	c.println (pennies + " pennies");
    }


    public static void main (String[] args)
    {
	ChangeCalculator d = new ChangeCalculator ();
	d.input ();
	d.calculations ();


	// Place your program here.  'c' is the output console
    } // main method
} // ChangeCalculator class
