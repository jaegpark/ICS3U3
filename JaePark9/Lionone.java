// The "Lionone" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Lionone extends Thread
{
    private Console c;           // The output console

    // Colour list
    Color sky = new Color (89, 172, 255);
    Color pelt = new Color (235, 228, 49);
    Color legs = new Color (235, 210, 49);
    Color mane = new Color (255, 204, 51);
    
    // draws the lion coming onto the screen
    public void lionOEnter ()
    {
	// erases the text in the clouds
	c.setColor (Color.white);
	c.fillRect (170, 55, 60, 13);
	c.fillRect (310, 115, 65, 13);
	// draws the lion coming onto the screen
	for (int i = 290 ; i > 0 ; i--)
	{
	    // erase
	    c.setColor (sky);
	    c.fillRect (160 - i, 300, 130, 100);

	    //body
	    c.setColor (pelt);
	    c.fillRect (180 - i, 320, 80, 40);
	    //legs
	    c.setColor (legs);
	    c.fillRect (180 - i, 360, 20, 39);
	    c.fillRect (240 - i, 360, 20, 39);
	    //head
	    c.setColor (pelt);
	    int x[] = {280 - i, 295 - i, 295 - i, 280 - i};
	    int y[] = {330, 330, 320, 310};
	    int n = 4;
	    c.fillPolygon (x, y, n);
	    //top of back
	    int x1[] = {220 - i, 260 - i, 260 - i};
	    int y1[] = {320, 300, 320};
	    int n1 = 3;
	    c.fillPolygon (x1, y1, n1);
	    //mane
	    c.setColor (mane);
	    c.fillRoundRect (240 - i, 300, 40, 60, 3, 3);
	    //facial features
	    c.setColor (Color.black);
	    c.drawLine (285 - i, 325, 295 - i, 325);
	    c.fillOval (284 - i, 317, 2, 2);
	    //tail
	    c.setColor (Color.black);
	    c.drawLine (167 - i, 342, 180 - i, 320);
	    c.fillOval (165 - i, 340, 4, 4);

	    //delay
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

    // draws the lion chasing the hyena away
    public void lionOChase ()
    {
	// erases the text from the hyena interaction
	c.setColor (sky);
	c.fillRect (500, 240, 100, 20);
	c.fillRect (300, 240, 40, 25);
	
	// main for loop
	for (int i = 0 ; i < 200 ; i++)
	{
	    // erase
	    c.setColor (sky);
	    c.fillRect (160 + i, 300, 130, 100);

	    //body
	    c.setColor (pelt);
	    c.fillRect (180 + i, 320, 80, 40);
	    //legs
	    c.setColor (legs);
	    c.fillRect (180 + i, 360, 20, 39);
	    c.fillRect (240 + i, 360, 20, 39);
	    //head
	    c.setColor (pelt);
	    int x[] = {280 + i, 295 + i, 295 + i, 280 + i};
	    int y[] = {330, 330, 320, 310};
	    int n = 4;
	    c.fillPolygon (x, y, n);
	    //top of back
	    int x1[] = {220 + i, 260 + i, 260 + i};
	    int y1[] = {320, 300, 320};
	    int n1 = 3;
	    c.fillPolygon (x1, y1, n1);
	    //mane
	    c.setColor (mane);
	    c.fillRoundRect (240 + i, 300, 40, 60, 3, 3);
	    //facial features
	    c.setColor (Color.black);
	    c.drawLine (285 + i, 325, 295 + i, 325);
	    c.fillOval (284 + i, 317, 2, 2);
	    //tail
	    c.setColor (Color.black);
	    c.drawLine (167 + i, 342, 180 + i, 320);
	    c.fillOval (165 + i, 340, 4, 4);

	    // delay
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

    // writes out the text of the hyena interaction
    public void text ()
    {
	c.setColor (new Color (76, 153, 0));    // sets the new text colour
	c.drawString ("We want that food!", 500, 250);
	try
	{
	    sleep (3000);       // delay so user can read the message
	}
	catch (Exception e)
	{
	}
	c.drawString ("No u.", 300, 250);
	c.drawString ("go away", 300, 260);
    }


    public Lionone (Console con)
    {
	c = con;    // assigns c to con
    }


    public void run ()
    {
	try
	{
	    sleep (2000);       // delay for allowing reader to read intro text
	}
	catch (Exception e)
	{
	}
	lionOEnter ();
	try
	{
	    text ();
	    sleep (2000);       // delay for interacting text

	}
	catch (Exception e)
	{
	}
	lionOChase ();
    }
} // Lionone class
