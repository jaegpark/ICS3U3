/*
Jae Park
Mr. Rosen
2018-10-20
This class draws the hyena and all its interactions
*/
// The "Hyena" class.

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Hyena extends Thread
{
    private Console c;           // The output console

    // colour list
    Color sky = new Color (89, 172, 255);
    Color pelt = new Color (172, 131, 36);
    Color legs = new Color (115, 91, 24);
    Color mane = new Color (81, 52, 18);

    // this method draws the hyena entering the screen
    public void hyenaEnter ()
    {
	// main for loop
	for (int i = 120 ; i > -80 ; i--)
	{
	    // erase
	    c.setColor (sky);
	    c.fillRect (529 + i, 321, 110, 80);

	    // head
	    c.setColor (legs);
	    c.fillRoundRect (520 + i, 330, 40, 20, 3, 3);
	    // body
	    c.setColor (pelt);
	    c.fillRect (560 + i, 330, 60, 40);
	    // legs
	    c.setColor (legs);
	    c.fillRect (565 + i, 370, 5, 25);
	    c.fillRect (580 + i, 370, 5, 25);
	    c.fillRect (600 + i, 370, 5, 25);
	    c.fillRect (615 + i, 370, 5, 25);
	    // tail
	    c.fillRect (620 + i, 340, 10, 8);
	    // tail tip
	    c.setColor (Color.black);
	    c.fillOval (630 + i, 340, 6, 6);
	    // feet
	    c.fillRect (565 + i, 395, 5, 4);
	    c.fillRect (580 + i, 395, 5, 4);
	    c.fillRect (600 + i, 395, 5, 4);
	    c.fillRect (615 + i, 395, 5, 4);
	    // facial features
	    c.drawLine (520 + i, 340, 540 + i, 341);
	    c.drawLine (540 + i, 341, 521 + i, 344);
	    c.fillOval (545 + i, 338, 4, 4);
	    // mane
	    c.setColor (mane);
	    int[] x = {550 + i, 560 + i, 570 + i};
	    int[] y = {330, 320, 330};
	    int[] x1 = {570 + i, 580 + i, 590 + i};
	    int[] y1 = {330, 320, 330};
	    int[] x2 = {590 + i, 600 + i, 610 + i};
	    int[] y2 = {330, 320, 330};
	    int n = 3;
	    c.fillPolygon (x, y, n);
	    c.fillPolygon (x1, y1, n);
	    c.fillPolygon (x2, y2, n);

	    //delay
	    try
	    {
		sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    // this method draws the hyena exiting
    public void hyenaExit ()
    {
	// for loop to get the hyena off the screen
	for (int i = 0 ; i < 201 ; i++)
	{
	    // erase
	    c.setColor (sky);
	    c.fillRect (439 + i, 321, 120, 80);
	    
	    // head
	    c.setColor (legs);
	    c.fillRoundRect (440 + i, 330, 40, 20, 3, 3);
	    // body
	    c.setColor (pelt);
	    c.fillRect (480 + i, 330, 60, 40);
	    // legs
	    c.setColor (legs);
	    c.fillRect (485 + i, 370, 5, 25);
	    c.fillRect (500 + i, 370, 5, 25);
	    c.fillRect (520 + i, 370, 5, 25);
	    c.fillRect (535 + i, 370, 5, 25);
	    // tail
	    c.fillRect (540 + i, 340, 10, 8);
	    // tail tip
	    c.setColor (Color.black);
	    c.fillOval (550 + i, 340, 6, 6);
	    // feet
	    c.fillRect (485 + i, 395, 5, 4);
	    c.fillRect (500 + i, 395, 5, 4);
	    c.fillRect (520 + i, 395, 5, 4);
	    c.fillRect (535 + i, 395, 5, 4);
	    // facial features
	    c.drawLine (440 + i, 340, 460 + i, 341);
	    c.drawLine (460 + i, 341, 441 + i, 344);
	    c.fillOval (465 + i, 338, 4, 4);
	    // mane
	    c.setColor (mane);
	    int[] x = {470 + i, 480 + i, 490 + i};
	    int[] y = {330, 320, 330};
	    int[] x1 = {490 + i, 500 + i, 510 + i};
	    int[] y1 = {330, 320, 330};
	    int[] x2 = {510 + i, 520 + i, 530 + i};
	    int[] y2 = {330, 320, 330};
	    int n = 3;
	    c.fillPolygon (x, y, n);
	    c.fillPolygon (x1, y1, n);
	    c.fillPolygon (x2, y2, n);

	    //delay
	    try
	    {
		sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Hyena (Console con)
    {
	c = con;
    }


    public void run ()
    {
	try
	{
	    sleep (2000);   // delay so user can read the intro text
	}
	catch (Exception e)
	{
	}
	hyenaEnter ();
	try
	{
	    sleep (6000);   // delay to wait for lion to start chasing
	}
	catch (Exception e)
	{
	}

	hyenaExit ();

    }
} // Hyena class
