import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) 
    {
    	Createfile f = new Createfile();
    	f.openFile();
    	f.addRecords();
    	f.closeFile();
    }
}


class Createfile 
{
	private Formatter x;
	
	public void openFile() //create the file
	{
		try
		{
			x = new Formatter("chinese.txt");
			System.out.println("File Created!");
		}
		catch(Exception e)
		{
			System.out.println("You have an error!");
		}
	}
	
	public void addRecords() //add contents into the file
	{
		x.format("%s%s%s", "20 ", "bucky ", "roberts");
	}
	
	public void closeFile()
	{
		x.close(); //close the file
	}
	
}