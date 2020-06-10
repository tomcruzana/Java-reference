/*
https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
 
Different ways of Reading a text file in Java

There are multiple ways of writing and reading a text file. this is required while dealing with many applications.

There are several ways to read a plain text file in Java e.g. you can use FileReader, BufferedReader or Scanner to read a text file. Every utility provides something special e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.

We can also use both BufferReader and Scanner to read a text file line by line in Java. Then Java SE 8 introduces another Stream class java.util.stream.Stream which provides a lazy and more efficient way to read a file
*/


// Java Program to illustrate reading from FileReader 
// Example 1: using BufferedReader 
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

//Example 2: 
import java.io.*;

public class Main
{
    public static void main(String[] args){
        //C:\Users\tomcr\Desktop\test.txt
        FileExplorer fe = new FileExplorer("C:\\Users\\tomcr\\Desktop\\test.txt"); //instantiate the class
        fe.readFile(); 
    }
}

class FileExplorer{
    private String path = null;
    private File f;
    private FileReader fr;
    private BufferedReader br;

    public FileExplorer(String path) {
        this.path = path;
    }

    public void readFile(){
        try{ //error handler is needed for this implementation
            f = new File(this.path); //fetch the file
            fr = new FileReader(f); //read the file
            br = new BufferedReader(fr); //create a buffer to make the reading more efficient

            String line = br.readLine(); //read the first line

            while(line != null){ //loop until there are no more lines
                System.out.println(line); //print the line
                line = br.readLine(); //read the next line
            }
        }
        catch(Exception e){
            System.out.println("An error occurred " + e);
        }
        finally {
            try{ //error handler is needed for this implementation
                br.close(); //close the stream
            }
            catch (Exception e){
                System.out.println("An error occurred " + e);
            }
        }
    }
}
