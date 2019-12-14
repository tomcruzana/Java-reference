//https://www.geeksforgeeks.org/linked-list-in-java/
import java.util.*;
import java.util.Iterator;

public class Main 
{
  private static LinkedList<String> object = new LinkedList<String>();
  private static LinkedList<String> object2 = new LinkedList<String>();

  public static void main(String[] args) 
  {
    object2.add("creep");
    object2.add("Fuck");

    for(int i = 0; i < 5; i++)
    {
      object.add("Fuck"); //adds fuck 10x
    }
    object.addFirst("Grapes");
    object.add("You!");
    printMe(object);
    
    removeStuff(object, 2,5);
    printMe(object);

    reverseMe(object);
  }

  public static void printMe(LinkedList<String> l)//print list
  {
    System.out.println(object);
    System.out.println(object.getFirst());
    System.out.println(object.getLast());
    System.out.println();//new line
  }

  public static void removeStuff(LinkedList<String> l, int from, int to)//remove list
  {
    l.subList(from, to).clear();//give it a list, a portion, and clear it
  }

  public static void reverseMe(LinkedList<String> l) //reverse the list
  {
   // Obtaining Iterator
    ListIterator<String> it = l.listIterator(l.size());
    // Iterating the list in forward direction
    System.out.println("LinkedList elements:");
    
    while(it.hasPrevious())
    {
       System.out.println(it.previous());

    }
  }
  
}



