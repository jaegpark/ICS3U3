/*
Andy Cai and Jae Park
Mr Rosen
09/19/18
Calculates area of a rectangle based on length and width
*/
import java.awt.*; //imports
import hsa.Console;

public class AreaRectangle //class AreaRectangler
{
    static Console c;       // The output console
    public double length;   // length variable init
    public double width;    // width variable init
    
    public AreaRectangle(){ // constructor
	c = new Console("Calculate Area of Rectangle");  // initialize Console 
    }
    public void title(){ //prints a title
	String title = new String("Calculate Area of Rectangle"); //automatically centers text
	c.print(' ', 40-title.length()/2);
	c.println(title);
    }
    public void getInput(){ //gets the input
	c.print("Insert length of rectangle here: ");
	length = c.readDouble();
	c.print("Insert width of rectangle here: ");
	width = c.readDouble();
    }
    
    public void output(){ //outputs the area, calculations done in here
	c.println();
	double area = length*width;
	c.print("The area of the rectangle is " + area + ".");
    
    }
    
    public static void main (String[] args) //main method
    {
	AreaRectangle d = new AreaRectangle(); //initialize constructor
	//calling methods
	d.title(); 
	d.getInput();
	d.output();
	//calling methods end
	
    } 
} 

