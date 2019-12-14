/*
https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
 
Different ways of Reading a text file in Java

There are multiple ways of writing and reading a text file. this is required while dealing with many applications.

There are several ways to read a plain text file in Java e.g. you can use FileReader, BufferedReader or Scanner to read a text file. Every utility provides something special e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.

We can also use both BufferReader and Scanner to read a text file line by line in Java. Then Java SE 8 introduces another Stream class java.util.stream.Stream which provides a lazy and more efficient way to read a file
*/


import java.io.*;
import java.lang.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
    	readfile f = new readfile();
    	f.openFile();
    	f.readFile();
    	f.closeFile();
    }
}

class readfile 
{
	private Scanner x;

	public void openFile()
	{
		try
		{
			x = new Scanner(new File("chinese.txt"));
			
		}
		catch(Exception e)
		{
			System.out.println("No file to read!");
		}
	}
	
	public void readFile()
	{
		
		
		while(x.hasNext()) //next line
		{
			String a = x.next(); //get next character
			String b = x.next(); //get next character
			String c = x.next(); //get next character
			System.out.printf("%s %s %s\n", a,b,c); //print
		}
	}
	
	public void closeFile()
	{
		x.close(); //close the file
	}	
}