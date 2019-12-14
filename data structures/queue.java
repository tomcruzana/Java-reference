//Queue operates in FIFO order
//https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
//https://www.geeksforgeeks.org/queue-interface-java/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    PriorityQueue<String> q = new PriorityQueue<String>();

    q.offer("first");
    q.offer("second");
    q.offer("third");

    System.out.printf("%s ", q); //print the whole queue
    System.out.println();

    System.out.printf("%s ", q.peek()); //peeks at the very top element
    System.out.println();

    q.poll(); //removes the element on top
    System.out.printf("%s ", q);
    System.out.println();

    q.remove("third"); //removes a specific element
    System.out.printf("%s ", q);
    System.out.println();


  }
}

//////////////////

// Java orogram to demonstrate working of Queue 
// interface in Java 
import java.util.LinkedList; 
import java.util.Queue; 

public class QueueExample 
{ 
public static void main(String[] args) 
{ 
	Queue<Integer> q = new LinkedList<>(); 

	// Adds elements {0, 1, 2, 3, 4} to queue 
	for (int i=0; i<5; i++) 
	q.add(i); 

	// Display contents of the queue. 
	System.out.println("Elements of queue-"+q); 

	// To remove the head of queue. 
	int removedele = q.remove(); 
	System.out.println("removed element-" + removedele); 

	System.out.println(q); 

	// To view the head of queue 
	int head = q.peek(); 
	System.out.println("head of queue-" + head); 

	// Rest all methods of collection interface, 
	// Like size and contains can be used with this 
	// implementation. 
	int size = q.size(); 
	System.out.println("Size of queue-" + size); 
} 
} 
