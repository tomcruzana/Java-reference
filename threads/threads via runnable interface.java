//https://www.geeksforgeeks.org/main-thread-java/
//In this example, instead of creating a class that extends the Thread class, we just implement the runnable interface
//this is just another way of creating multi-threaded applications

import java.util.*;

public class Main 
{ 
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Tuna("one"));
		Thread t2 = new Thread(new Tuna("two"));
		Thread t3 = new Thread(new Tuna("three"));
		Thread t4 = new Thread(new Tuna("Four"));

		t1.start(); //call the run method
		t2.start();
		t3.start();
		t4.start();
	}
} 


public class Tuna implements Runnable
{
	String name;
	int time;
	Random r = new Random();
	
	public Tuna(String x)
	{
		name = x;
		time = r.nextInt(999);
	}
	
	public void run()
	{
		try 
		{
			System.out.printf("%s us sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}
		catch (Exception e)
		{
			
		}
	}

}
