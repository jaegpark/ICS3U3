/*
Jae Park
Mr. Rosen
2018-10-20
This class file draws the vulture coming in and out of the screen,
and interacting with the Lionone
*/

// The "Vulture" class.

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Vulture implements Runnable
{
    private Console c;           // The output console

    // colour list
    Color sky = new Color (89, 172, 255);
    Color beak = new Color (153, 153, 0);
    Color body = new Color (102, 94, 16);
    Color wing = new Color (216, 200, 58);

    // this method draws the entry of the vulture
    public void vultureEnter ()
    {
	// main for loop to draw
	for (int i = 60 ; i > -200 ; i--)
	{
	    // erase
	    c.setColor (sky);
	    c.fillRect (584 + i, 140, 54, 31);

	    // beak
	    int x[] = {585 + i, 592 + i, 592 + i};
	    int y[] = {150, 153, 147};
	    int n = 3;
	    c.setColor (beak);
	    c.fillPolygon (x, y, n);
	    // head
	    c.setColor (Color.black);
	    c.fillRoundRect (591 + i, 145, 10, 10, 2, 2);
	    // eyes
	    c.setColor (Color.yellow);
	    c.fillOval (593 + i, 145, 4, 4);
	    // main body
	    c.setColor (body);
	    c.fillOval (600 + i, 140, 30, 20);
	    // wing
	    c.setColor (wing);
	    c.fillArc (610 + i, 145, 10, 10, 180, 180);
	    // legs
	    c.setColor (Color.gray);
	    c.drawLine (610 + i, 170, 615 + i, 165);
	    c.drawLine (615 + i, 160, 615 + i, 170);
	    c.drawLine (615 + i, 165, 620 + i, 170);
	    // tail
	    int x1[] = {630 + i, 637 + i, 637 + i};
	    int y1[] = {150, 158, 142};
	    int n1 = 3;
	    c.setColor (Color.black);
	    c.fillPolygon (x1, y1, n1);

	    // delay
	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    // this method draws the vulture exiting off the screen
    public void vultureExit ()
    {
	// erases the text from lion interaction
	c.setColor (sky);
	c.fillRect (350, 190, 200, 15);
	c.fillRect (500, 340, 20, 15);

	// main for loop used to draw the vulture exiting the screen
	for (int i = -200 ; i < 60 ; i++)
	{
	    // erase
	    c.setColor (sky);
	    c.fillRect (584 + i, 140, 54, 31);

	    // beak
	    int x[] = {585 + i, 592 + i, 592 + i};
	    int y[] = {150, 153, 147};
	    int n = 3;
	    c.setColor (beak);
	    c.fillPolygon (x, y, n);
	    // head
	    c.setColor (Color.black);
	    c.fillRoundRect (591 + i, 145, 10, 10, 2, 2);
	    // eyes
	    c.setColor (Color.yellow);
	    c.fillOval (593 + i, 145, 4, 4);
	    // main body
	    c.setColor (body);
	    c.fillOval (600 + i, 140, 30, 20);
	    // wing
	    c.setColor (wing);
	    c.fillArc (610 + i, 145, 10, 10, 180, 180);
	    // legs
	    c.setColor (Color.gray);
	    c.drawLine (610 + i, 170, 615 + i, 165);
	    c.drawLine (615 + i, 160, 615 + i, 170);
	    c.drawLine (615 + i, 165, 620 + i, 170);
	    // tail
	    int x1[] = {630 + i, 637 + i, 637 + i};
	    int y1[] = {150, 158, 142};
	    int n1 = 3;
	    c.setColor (Color.black);
	    c.fillPolygon (x1, y1, n1);

	    // erase
	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    // text method that draws the text of the dialogue
    public void text ()
    {
	c.setColor (Color.black);
	c.drawString ("I'm gonna take the scraps after regardless", 350, 200);
	try
	{ // delays so that the user has time to read it
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
	c.drawString ("Ok.", 500, 350);
    }


    // text after he leaves
    public void text1 ()
    {
	// draws the text
	c.setColor (Color.black);
	c.drawString ("I hope we can eat in peace now", 400, 280);
	c.drawString ("Let's bring our cubs!", 300, 410);
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
    }


    // assigns c to con
    public Vulture (Console con)
    {
	c = con;
    }


    public void run ()
    {
	vultureEnter ();
	try
	{
	    text ();
	    Thread.sleep (5000);    // gives time for the user to read it
	}
	catch (Exception e)
	{
	}
	vultureExit ();
	text1 ();
    }
} // Vulture class
