/*
Jae Park
Mr. Rosen
2018-10-20
This class draws the components of the background
*/

// The "Background" class.

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Background
{
    private Console c;

    // main draw method
    public void draw ()
    {
	// LIST OF LOCAL COLOUR VARIABLES FOR THE BACKGROUND
	Color skyblue = new Color (89, 172, 255);       // sky
	Color oceanblue = new Color (0, 116, 232);      // water
	Color ground = new Color (198, 176, 36);        // ground

	// draws the sky
	for (int i = 0 ; i < 640 ; i++)
	{
	    c.setColor (skyblue);
	    c.drawRect (0, 0, i, 400);
	}

	// draws the ground
	for (int i = 0 ; i < 640 ; i++)
	{
	    c.setColor (ground);
	    c.drawRect (0, 400, i, 500);
	}

	// draws the sun
	for (int i = 0 ; i < 160 ; i++)
	{
	    c.setColor (Color.yellow);
	    c.drawOval (-80, -80, i, i);
	    c.drawOval (-81, -81, i, i);
	    c.drawOval (-81, -80, i, i);
	}

	// draws the suns rays
	// declaration of the coordinate arrays for the polygons
	c.setColor (Color.orange);
	int x1[] = {0, 22, 38};
	int x2[] = {38, 62, 69};
	int x3[] = {69, 90, 80};
	int x4[] = {80, 100, 80};
	int y1[] = {80, 82, 66};
	int y2[] = {66, 62, 40};
	int y3[] = {40, 35, 10};
	int y4[] = {10, 0, 0};
	int n1 = 3;
	int n2 = 3;
	int n3 = 3;
	int n4 = 3;
	//draws the polygons (rays) and fills them
	c.fillPolygon (x1, y1, n1);
	c.fillPolygon (x2, y2, n2);
	c.fillPolygon (x3, y3, n3);
	c.fillPolygon (x4, y4, n4);

	// draws the lines coming out of sun "sunlight"
	c.setColor (Color.red);
	c.drawLine (32, 92, 45, 110);
	c.drawLine (55, 72, 70, 89);
	c.drawLine (80, 50, 100, 65);
	c.drawLine (93, 25, 110, 42);

	// draws the clouds on top layer
	for (int i = 0 ; i < 41 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawOval (160 + i, 40, 80 - 2 * i, 40);
	    c.drawOval (320 + i, 20, 80 - 2 * i, 40);
	    c.drawOval (500 + i, 30, 80 - 2 * i, 40);
	}


	// draws the bottom two clouds
	for (int i = 0 ; i < 61 ; i++)
	{
	    c.setColor (Color.white);
	    //1
	    c.drawOval (80 + i, 120, 120 - i * 2, 40);

	    //2
	    c.drawOval (280 + i, 100, 120 - 2 * i, 40);
	}

	// draws the lake
	for (int i = 0 ; i < 181 ; i++)
	{
	    c.setColor (oceanblue);
	    c.drawOval (460 + i, 420, 360 - 2 * i, 150);
	}

	// draws the corpse of the prey
	for (int i = 0 ; i < 31 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawOval (40 + i, 460, 60 - 2 * i, 40);
	}
	for (int i = 0 ; i < 11 ; i++)
	{
	    c.drawRoundRect (100 + i, 470, 20 - 2 * i, 10, 2, 2);
	}
	for (int i = 0 ; i < 4 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawOval (35 + i, 475, 6 - 2 * i, 6);
	}
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


	// writes the text that is in the clouds
	c.setTextColor (Color.black);
	c.drawString ("MyCreation", 170, 65);
	c.drawString ("By: Jae Park", 310, 125);

    }


    public Background (Console con)
    {
	c = con;
	draw ();

    }


    // main method
} // Background class
