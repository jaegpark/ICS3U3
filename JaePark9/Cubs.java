/*
Jae Park
Mr. Rosen
2018-10-20
This class draws the overloaded methods of the cubs with different
colours and y coordinates
*/
// The "Cubs" class.

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Cubs extends Thread
{
    private Console c;           // The output console

    // colour and ycoord variable
    private Color cubColor = Color.white;
    private int ycoord = 350;
    private Color eraseC = new Color (89, 172, 255);

    // this method draws the cub based on conditions passed onto the method
    public void draw ()
    {
	// main draw for loop
	for (int i = -90 ; i < 150 ; i++)
	{

	    // erase of background and redrawing of the dead animal
	    c.setColor (eraseC);
	    c.fillRect (i - 1, ycoord - 1, 82, 51);
	    if (ycoord < 350 || ycoord > 350 && i > -80)
	    {
		// body
		c.setColor (Color.white);
		c.fillOval (40, 460, 60, 40);
		// head
		c.fillRoundRect (100, 470, 20, 10, 2, 2);
		//eye
		c.setColor (Color.black);
		c.fillOval (35, 475, 6, 6);
		// legs
		c.drawLine (47, 450, 47, 470);
		c.drawLine (60, 440, 60, 461);
		c.drawLine (80, 440, 80, 461);
		c.drawLine (93, 450, 93, 470);
		// mouth
		c.drawLine (110, 473, 120, 473);
		// dead eyes
		c.drawLine (103, 473, 107, 477);
		c.drawLine (103, 477, 107, 473);
	    }

	    //body
	    c.setColor (cubColor);
	    c.fillRect (20 + i, ycoord + 10, 40, 30);
	    //head
	    c.fillRoundRect (60 + i, ycoord, 20, 20, 5, 5);
	    //legs
	    c.setColor (Color.orange);
	    c.fillRect (20 + i, ycoord + 40, 10, 9);
	    c.fillRect (50 + i, ycoord + 40, 10, 9);
	    // ears
	    c.fillOval (53 + i, ycoord + 3, 10, 10);
	    // facial features
	    c.setColor (Color.black);
	    c.drawLine (70 + i, ycoord + 15, 80 + i, ycoord + 15);
	    c.fillOval (65 + i, ycoord + 3, 4, 4);
	    //tail
	    c.drawArc (7 + i, ycoord + 20, 26, 10, 90, 90);
	    c.fillOval (3 + i, ycoord + 25, 5, 5);

	    // checks if the white cub will pass the red cub and overlap
	    if (cubColor == Color.white && i == 70)
	    {
		break;      // if so, the for loop will end for the white cub so it doesnt
		//overlap the red cub
	    }
	    // delay of the animation
	    try
	    {
		sleep (30);
	    }
	    catch (Exception e)
	    {
	    }

	}
	c.setColor (Color.black);
	c.drawString ("YAY, FOOD!", 100, 420);          // prints out the cub's message
    }


    // basic cub
    public Cubs (Console con)
    {
	c = con;
    }


    // cub with a color parameter
    public Cubs (Console con, Color n)
    {
	c = con;
	cubColor = n;
    }


    // cub with a color parameteer, a new y coordinate, and an erase colour specification
    public Cubs (Console con, Color n, int y, Color g)
    {
	c = con;
	cubColor = n;
	ycoord = y;
	eraseC = g;
    }


    public void run ()
    {
	draw ();
    }
} // Cubs class


