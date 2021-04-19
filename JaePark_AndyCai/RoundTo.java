/*
Andy Cai and Jae Park
Mr Rosen
09/19/18
Rounds number to 1s, 10s, 100s, or 1000s
*/
import java.awt.*; //imports
import hsa.Console;

public class RoundTo //class RoundTo
{
    static Console c;           // The output console
    public double numberInput;  // The number variable init
    public double roundDigit;   // The digit being rounded to init
    public RoundTo ()  //constructor
    {
	c = new Console ("Round Number"); //init console
    }


    public void title () //prints title
    {
	String title = new String ("Round Number"); //automatically centers text
	c.print (' ', 40 - title.length () / 2);
	c.println (title);
    }


    public void getInput () //gets the number and the digit being rounded to
    {
	c.print ("Input number: ");
	numberInput = c.readDouble ();
	c.print ("Round to nearest: ");
	roundDigit = c.readDouble ();
    }


    public void output () //outputs the rounded number
    {
	int rounded = (int) (Math.round (numberInput / roundDigit) * roundDigit);
	c.print ("Your rounded number is " + rounded + ".");
    }


    public static void main (String[] args) //main method
    {
	RoundTo d = new RoundTo (); //init constructor
	//method calling
	d.title();
	d.getInput ();
	d.output ();
	//method calling end

    }
}
