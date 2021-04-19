/*
Andy Cai and Jae Park
Mr Rosen
09/19/18
Generates random number from -5 to 17 (inclusive)
*/

import java.awt.*; 
import hsa.Console; //imports 

public class RandomNumber //class RandomNumber
{
    public int randomNumber;    // The random number will be stored in this variable
    static Console c;           // The output console
    public RandomNumber(){      // constructor
	c = new Console();      // initialize Console variable
    }
    public void randomNumberGeneration(){  //method that generates random number
	
	
	randomNumber = (int)Math.floor(Math.random()*23 - 5);  //generates random number
	c.print(randomNumber); //prints random number
    }
    public static void main (String[] args) //main method
    {
	RandomNumber d = new RandomNumber();  //initializing constructor
	d.randomNumberGeneration();  //running method
	
    } 
} 
