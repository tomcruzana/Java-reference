/*
https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
 
Different ways of Reading a text file in Java

There are multiple ways of writing and reading a text file. this is required while dealing with many applications.

There are several ways to read a plain text file in Java e.g. you can use FileReader, BufferedReader or Scanner to read a text file. Every utility provides something special e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.

We can also use both BufferReader and Scanner to read a text file line by line in Java. Then Java SE 8 introduces another Stream class java.util.stream.Stream which provides a lazy and more efficient way to read a file
*/


// Java Program to illustrate reading from FileReader 
// using BufferedReader 
import java.io.*; 
public class ReadFromFile2 
{ 
	public static void main(String[] args)throws Exception 
	{ 
		// We need to provide file path as the parameter: 
		// double backquote is to avoid compiler interpret words 
		// like \test as \t (ie. as a escape sequence) 
		File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 

		BufferedReader br = new BufferedReader(new FileReader(file)); 

		String st; 
		while ((st = br.readLine()) != null) 
			System.out.println(st); 
	} 
} 
