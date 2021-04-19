/*
Andy Cai and Jae Park
Mr Rosen
09/19/18
Calculates surface area and volume of a cylinder
*/
import java.awt.*; //imports
import hsa.Console;

public class SurfaceAndVolume //class Surface and Volume
{
    static Console c;           // The output console
    final double PI = Math.PI;  // constant PI declared for ease of use
    public double height;       // height variable init
    public double radius;       // radius variable init
    
    public SurfaceAndVolume(){  // constructor
	c = new Console(); //console init
    }
    public void title(){ //prints a title
	String title = new String("Calculate Surface Area and Volume"); //automatically centers text
	c.print(' ', 40-title.length()/2);
	c.println(title);
    }
    public void getInput(){ //gets input
	c.print("Input the radius of your cylinder: ");
	radius = c.readDouble();
	c.print("Input the height of your cylinder: ");
	height = c.readDouble();
	
    }
    public void output(){ //outputs surface area and volume, shows one digit by using c.print(int x, int y, int z) where z is digits rounded to
	double surfaceArea = 2*PI*radius*height + 2*PI*Math.pow(radius, 2); //calculate surface area
	double volume = 2*PI*Math.pow(radius, 2)*height; //calculate volume
	c.println();
	c.print("The surface area of the cylinder is ");
	c.print(surfaceArea, 0, 1);
	c.print(" and the volume is ");
	c.print(volume, 0, 1);
	c.print(".");
    }
    public static void main (String[] args) //main method
    {
	SurfaceAndVolume d = new SurfaceAndVolume(); //constructor init
	//method calling
	d.title();
	d.getInput();
	d.output();
	//method calling end
	
    } 
} 
