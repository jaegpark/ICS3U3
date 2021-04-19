/*
Jae Park
Mr. Rosen
2018-10-20
This class is a thread that does the actions of the female lion
*/

// The "Liontwo" class.

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Liontwo extends Thread
{
    private Console c;           // The output console

    // colour list
    Color pelt = new Color (235, 228, 49);
    Color legs = new Color (235, 210, 49);
    Color mane = new Color (255, 204, 51);
    Color ground = new Color (198, 176, 36);

    //This method draws the lion coming in from the bottom
    public void lionTEnter ()
    {
	// main for loop
	for (int i = 100 ; i > 0 ; i--)
	{
	    //erase
	    c.setColor (ground);
	    c.fillRect (158, 413 + i, 130, 100);

	    // body
	    c.setColor (pelt);
	    c.fillRect (180, 420 + i, 80, 40);
	    // head
	    c.fillRoundRect (260, 420 + i, 20, 20, 5, 5);
	    // ears
	    c.setColor (mane);
	    c.fillOval (255, 415 + i, 8, 8);
	    // tail
	    c.setColor (Color.black);
	    c.drawArc (165, 425 + i, 20, 35, 60, 120);
	    c.fillOval (163, 438 + i, 4, 4);
	    // mouth
	    c.drawLine (266, 435 + i, 279, 435 + i);
	    // eye
	    c.fillOval (264, 424 + i, 2, 2);
	    // legs
	    c.setColor (legs);
	    c.fillRect (180, 460 + i, 20, 39);
	    c.fillRect (240, 460 + i, 20, 39);
	    c.fillRect (200, 490 + i, 10, 9);
	    c.fillRect (260, 490 + i, 10, 9);

	    // delay
	    try
	    {
		sleep (15);
	    }
	    catch (Exception e)
	    {
	    }

	}
    }


    // this method draws the lion going out to chase the crocodile
    public void lionTChase ()
    {
	// main for loop
	for (int i = 0 ; i < 100 ; i++)
	{
	    //erase
	    c.setColor (ground);
	    c.fillRect (158 + i, 413, 130, 100);

	    // body
	    c.setColor (pelt);
	    c.fillRect (180 + i, 420, 80, 40);
	    // head
	    c.fillRoundRect (260 + i, 420, 20, 20, 5, 5);
	    // ears
	    c.setColor (mane);
	    c.fillOval (255 + i, 415, 8, 8);
	    // tail
	    c.setColor (Color.black);
	    c.drawArc (165 + i, 425, 20, 35, 60, 120);
	    c.fillOval (163 + i, 438, 4, 4);
	    // mouth
	    c.drawLine (266 + i, 435, 279 + i, 435);
	    // eye
	    c.fillOval (264 + i, 424, 2, 2);
	    // legs
	    c.setColor (legs);
	    c.fillRect (180 + i, 460, 20, 39);
	    c.fillRect (240 + i, 460, 20, 39);
	    c.fillRect (200 + i, 490, 10, 9);
	    c.fillRect (260 + i, 490, 10, 9);

	    // delay
	    try
	    {
		sleep (15);
	    }
	    catch (Exception e)
	    {
	    }

	}
    }


    // this method draws the lion returning closer to
    // its initial position on screen
    public void lionTReturn ()
    {
	// main for loop
	for (int i = 100 ; i > 0 ; i--)
	{
	    //erase
	    c.setColor (ground);
	    c.fillRect (158 + i, 413, 130, 100);

	    // body
	    c.setColor (pelt);
	    c.fillRect (180 + i, 420, 80, 40);
	    // head
	    c.fillRoundRect (260 + i, 420, 20, 20, 5, 5);
	    // ears
	    c.setColor (mane);
	    c.fillOval (255 + i, 415, 8, 8);
	    // tail
	    c.setColor (Color.black);
	    c.drawArc (165 + i, 425, 20, 35, 60, 120);
	    c.fillOval (163 + i, 438, 4, 4);
	    // mouth
	    c.drawLine (266 + i, 435, 279 + i, 435);
	    // eye
	    c.fillOval (264 + i, 424, 2, 2);
	    // legs
	    c.setColor (legs);
	    c.fillRect (180 + i, 460, 20, 39);
	    c.fillRect (240 + i, 460, 20, 39);
	    c.fillRect (200 + i, 490, 10, 9);
	    c.fillRect (260 + i, 490, 10, 9);

	    // delay
	    try
	    {
		sleep (35);
	    }
	    catch (Exception e)
	    {
	    }

	}

    }


    public Liontwo (Console con)
    {
	c = con;    // assigns c to con so it is on the same output
    }


    public void run ()
    {
	try
	{
	    sleep (2000);   // timed delay so that user has chance to see background and intro text
	}
	catch (Exception e)
	{
	}
	lionTEnter ();
	try
	{
	    sleep (19000);      // timed delay to wait for lionone interaction to finish
	}
	catch (Exception e)
	{

	}
	lionTChase ();


    }
} // Liontwo class
