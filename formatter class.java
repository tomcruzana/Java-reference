//This is a simple overview of the file class in Java
//COMPLETE DOCUMENTATION: https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
import java.util.Formatter;

public class Main {

    public static void main(String[] args) 
    {
    	final Formatter x; //Formatter object variable  
    	//A Formatter outputs string into a file. It's pretty much like a printf but instead of writing the output into the console, it writes its output into a file
    	
    	try
    	{
    		x = new Formatter("fred.txt"); //create instance of Formatter with a constructor of 
    		System.out.println("You created a file");
    	}
    	catch(Exception e)
    	{
    		System.out.println("You got an error!");
    	}
    	
    }
}
