/*
https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
 
Different ways of Reading a text file in Java

There are multiple ways of writing and reading a text file. this is required while dealing with many applications.

There are several ways to read a plain text file in Java e.g. you can use FileReader, BufferedReader or Scanner to read a text file. Every utility provides something special e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.

We can also use both BufferReader and Scanner to read a text file line by line in Java. Then Java SE 8 introduces another Stream class java.util.stream.Stream which provides a lazy and more efficient way to read a file

Using FileReader class: Convenience class for reading character files. The constructors of this class assume that the default character encoding and the default byte-buffer size are appropriate.
Constructors defined in this class are:

// Creates a new FileReader, given the
// File to read from.
FileReader(File file)

// Creates a new FileReader, given the
// FileDescriptor to read from.
FileReader(FileDescriptor fd)

// Creates a new FileReader, given the
// name of the file to read from.
FileReader(String fileName)
*/

// Java Program to illustrate reading from 
// FileReader using FileReader 
import java.io.*; 
public class ReadingFromFile 
{ 
public static void main(String[] args) throws Exception 
{ 
	// pass the path to the file as a parameter 
	FileReader fr = 
	new FileReader("C:\\Users\\pankaj\\Desktop\\test.txt"); 

	int i; 
	while ((i=fr.read()) != -1) 
	System.out.print((char) i); 
} 
} 



