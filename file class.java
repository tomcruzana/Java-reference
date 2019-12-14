//This is a simple overview of the file class in Java
import java.io.File;

public class Main {

    public static void main(String[] args) 
    {
       File x = new File("C:\\Temp\\test.txt"); //constructor arg will take the path of the file
       
       if(x.exists())
       {
    	   System.out.println(x.getName() + " exist!"); //getName is a built-in method that will capture the name 
       }
       else
       {
    	   System.out.println("This shit doesn't exist");
       }
    }
}
