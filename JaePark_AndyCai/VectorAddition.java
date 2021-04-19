// The "VectorAddition" class.
/*
Jae Park
Mr. Rosen
2018-09-21
This program will add two vectors based on user input
*/
import java.awt.*;
import hsa.Console;

public class VectorAddition
{
    static Console c;           // The output console
    // variable declaration
    public double mag1, mag2, ang1, ang2, choice;

    public VectorAddition ()
    {
	c = new Console ();
    }


    public void title ()  //prints title
    {
	String title = new String ("Round Number"); //automatically centers text
	c.print (' ', 40 - title.length () / 2);
	c.println (title);
    }


    public void getInput ()
    {
	//recieves all input variables
	c.print ("Input the magnitude of the first vector: ");
	mag1 = c.readDouble ();
	c.print ("Input the angle of the first vector: ");
	ang1 = c.readDouble ();
	c.print ("Input the magnitude of the second vector: ");
	mag2 = c.readDouble ();
	c.print ("Input the angle of the second vector: ");
	ang2 = c.readDouble ();
	c.print ("Input accuracy of the answer (e.g. 10 to round to tens)");
	choice = c.readDouble ();
    }


    public void calculation ()
    {
	// calculates the magnitude of the final vector
	ang1 = Math.toRadians (ang1);
	ang2 = Math.toRadians (ang2);
	double magAnswer = Math.sqrt (Math.pow ((mag1 * Math.sin (ang1) + mag2 * Math.sin (ang2)), 2) + Math.pow ((mag1 * Math.cos (ang1) + mag2 * Math.cos (ang2)), 2));
	double magAnswerRounded = (Math.round (magAnswer / choice) * choice);
	c.print (magAnswerRounded, 0, -((int) (Math.log (choice) / Math.log (10)) - 1));
	c.println (" is the magnitude of the final vector");

	// calculates the angle of the final vector
	double angAnswer = (180 / Math.PI) * Math.asin ((mag1 * Math.sin (ang1) + mag2 * Math.sin (ang2)) / magAnswer);
	double angAnswerRounded = (Math.round (angAnswer / choice) * choice);
	c.print (angAnswerRounded, 0, -((int) (Math.log (choice) / Math.log (10)) - 1));
	c.print (" is the angle of the final vector");
    }


    public static void main (String[] args)
    {
	// main program
	VectorAddition d = new VectorAddition ();
	d.title ();
	d.getInput ();
	d.calculation ();

	// Place your program here.  'c' is the output console
    } // main method
} // VectorAddition class
