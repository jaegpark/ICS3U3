/*
Jae Park
Mr. Rosen
2018-10-20
This class draws the crocodile and its interactions
*/

// The "Crocodile" class.

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Crocodile extends Thread
{
    private Console c;           // The output console

    // colour list
    Color oceanblue = new Color (0, 116, 232);
    Color skin = new Color (76, 153, 0);
    Color tail = new Color (51, 102, 0);
    Color legs = new Color (25, 51, 0);

    // this method draws the crocodile entering the screen
    public void crocEnter ()
    {
	// main for loop
	for (int i = 130 ; i > -20 ; i--)
	{
	    //erase
	    c.setColor (oceanblue);
	    c.fillRect (509 + i, 456, 130, 40);

	    //body
	    c.setColor (skin);
	    c.fillRect (540 + i, 470, 60, 20);
	    // mouth
	    c.fillRect (510 + i, 470, 30, 10);
	    //eye shape
	    c.fillOval (540 + i, 465, 10, 10);
	    // nose
	    c.fillOval (510 + i, 467, 10, 10);
	    // mouth line
	    c.setColor (Color.black);
	    c.drawLine (510 + i, 475, 535 + i, 475);
	    //eyeball
	    c.fillOval (543 + i, 468, 3, 3);
	    //tail
	    c.setColor (tail);
	    int x[] = {600 + i, 600 + i, 639 + i};
	    int y[] = {470, 490, 490};
	    int n = 3;
	    c.fillPolygon (x, y, n);
	    //legs
	    c.setColor (legs);
	    c.fillRect (540 + i, 490, 5, 5);
	    c.fillRect (555 + i, 490, 5, 5);
	    c.fillRect (580 + i, 490, 5, 5);
	    c.fillRect (595 + i, 490, 5, 5);

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


    // this method draws the crocodile exiting the screen
    public void crocExit ()
    {
	// erases the text from text interaction
	c.setColor (new Color (198, 176, 36));
	c.fillRect (500, 400, 100, 20);

	// main for loop
	for (int i = -20 ; i < 131 ; i++)
	{
	    //erase
	    c.setColor (oceanblue);
	    c.fillRect (509 + i, 456, 130, 40);

	    //body
	    c.setColor (skin);
	    c.fillRect (540 + i, 470, 60, 20);
	    // mouth
	    c.fillRect (510 + i, 470, 30, 10);
	    //eye shape
	    c.fillOval (540 + i, 465, 10, 10);
	    // nose
	    c.fillOval (510 + i, 467, 10, 10);
	    // mouth line
	    c.setColor (Color.black);
	    c.drawLine (510 + i, 475, 535 + i, 475);
	    //eyeball
	    c.fillOval (543 + i, 468, 3, 3);
	    //tail
	    c.setColor (tail);
	    int x[] = {600 + i, 600 + i, 639 + i};
	    int y[] = {470, 490, 490};
	    int n = 3;
	    c.fillPolygon (x, y, n);
	    //legs
	    c.setColor (legs);
	    c.fillRect (540 + i, 490, 5, 5);
	    c.fillRect (555 + i, 490, 5, 5);
	    c.fillRect (580 + i, 490, 5, 5);
	    c.fillRect (595 + i, 490, 5, 5);

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


    // this method draws the text
    public void text ()
    {
	c.setColor (new Color (51, 51, 0));
	c.drawString ("Can I have just a bit?", 500, 415);
	try
	{
	    sleep (2000);   // delay so the user can read the message
	}
	catch (Exception e)
	{
	}
	c.drawString ("No u, all ours", 300, 450);
    }


    public Crocodile (Console con)
    {
	c = con;
    }


    public void run ()
    {
	try
	{
	    sleep (17000);      // delay so that the thread only runs after the other animations
	}
	catch (Exception e)
	{
	}
	crocEnter ();
	try
	{
	    text ();
	    sleep (3000);       // delay so user can read the text
	}
	catch (Exception e)
	{
	}
	crocExit ();
    }
} // Crocodile class
