/*
Jae Park
Mr. Rosen
2018-10-20
This class controls the entire animation. The animation will show a story about lions
interacting with other animals over their food, which is sketched into the background.
*/

// The "MyCreation" class.

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class MyCreation
{
    Console c;           // The main output console

    // This method creates a new class constructor for Background
    public void background ()
    {
	Background b = new Background (c);
    }


    // This method creates a new class constructor for Hyena, and starts the thread
    public void hyena ()
    {
	Hyena h = new Hyena (c);
	h.start ();
    }


    // This method creates a new class constructor for Lionone, and starts the thread
    public void lionone ()
    {
	Lionone l = new Lionone (c);
	l.start ();
    }


    // This method creates a new class constructor for Liontwo, and starts the thread
    public void liontwo ()
    {
	Liontwo ll = new Liontwo (c);
	ll.start ();
    }


    // This method creates a new class constructor for Crocodile, and starts the thread
    public void crocodile ()
    {
	Crocodile cc = new Crocodile (c);
	cc.start ();

	// joins the crocodile thread to the vulture runnable
	try
	{
	    cc.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    // This method creates a new class constructor for Vulture, and runs it
    public void vulture ()
    {
	Vulture v = new Vulture (c);
	v.run ();
    }


    // This method creates a new class constructor for Cubs- these are the overloaded methods
    public void cubs ()
    {
	Color ground = new Color (198, 176, 36);
	Cubs c2 = new Cubs (c, Color.red);
	c2.start ();
	try
	{
	    Thread.sleep (5000);        // delay so that there is room for the other cub to come in at same y coord
	}
	catch (Exception e)
	{
	}
	Cubs c1 = new Cubs (c);
	c1.start ();
	Cubs c3 = new Cubs (c, Color.orange, 450, ground);
	c3.start ();
    }


    // Names the window title and defines c
    public MyCreation ()
    {
	c = new Console ("Everyday Savannah Things");
    }


    // might need to be run several times in order for RTP to not mess up colours during animation
    // If you see something irregular please run it at least 3 times
    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.background ();
	z.lionone ();
	z.liontwo ();
	z.hyena ();
	z.crocodile ();
	z.vulture ();
	z.cubs ();

	// Place your program here.  'c' is the output console
    } // main method
} // MyCreation class


