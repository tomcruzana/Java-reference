//Collections interface documentation: https://www.geeksforgeeks.org/collections-in-java-2/
//https://www.geeksforgeeks.org/collections-in-java-2/
//Using generic/primitive types for list: https://stackoverflow.com/questions/18021218/create-a-list-of-primitive-int
/*
Advantages of Collection Framework:

    Consistent API : The API has a basic set of interfaces like Collection, Set, List, or Map. All classes (ArrayList, LinkedList, Vector, etc) that implement these interfaces have some common set of methods.
    Reduces programming effort: A programmer doesn’t have to worry about the design of Collection, and he can focus on its best use in his program.
    Increases program speed and quality: Increases performance by providing high-performance implementations of useful data structures and algorithms.

Collection : Root interface with basic methods like add(), remove(), 
             contains(), isEmpty(), addAll(), ... etc.
 
Set : Doesn't allow duplicates. Example implementations of Set 
      interface are HashSet (Hashing based) and TreeSet (balanced
      BST based). Note that TreeSet implements SortedSet.

List : Can contain duplicates and elements are ordered. Example
       implementations are LinkedList (linked list based) and
       ArrayList (dynamic array based)

Queue : Typically order elements in FIFO order except exceptions
        like PriorityQueue.  

Deque : Elements can be inserted and removed at both ends. Allows
        both LIFO and FIFO. 

Map : Contains Key value pairs. Doesn't allow duplicates.  Example
      implementation are HashMap and TreeMap. 
      TreeMap implements SortedMap.        

The difference between Set and Map interface is that in Set we 
have only keys, whereas in Map, we have key, value pairs.
*/


//Created by Thomas - 8/6/19

import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Main 
{
  public static void main(String[] args) 
  {
    Tasks t = new Tasks();
    t.add();
  }
}

class Tasks
{
  private String action;
  private Scanner myInput = new Scanner(System.in); //create obj instance of Scanner
  private static List<String> myList = new ArrayList<String>(); //lists are dynamic
  
  public void add()
  {
    System.out.println("Add a task\n"); //ask for the input
    action = myInput.nextLine(); //assigns a task to the action variable
    myList.add(action); //append the string into the list collection
    verifyUser();
  }

  public void menu()
  {
    //main menu code
  }

  public void delete()
  {
    int number = 0;
    System.out.println("Enter the number of the task you would like to delete\n");  number = myInput.nextInt();//ask for the input
    myList.remove(number-1); //make it look normal to the user
    print();
  }

  public void verifyUser()
  {
    String answer;
    System.out.println("Would you like to add another task? (Y or N)\n");
    answer = myInput.nextLine();
    if (answer.equals("Y") || answer.equals("y"))
    {
      add();
    }
    else if(answer.equals("N") || answer.equals("n"))
    {
      //this method is not yet final
      print();
    }
    else
    {
      System.out.println("Invalid response\n");
      verifyUser();
    }
  }

  public void print()
  {
    int ctr = 1; //human counter for the list
    System.out.println("Here are your listed task(s):\n");
    for (int i=0; i<myList.size(); i++) //loop through the list
    {
      
      System.out.printf("%d %s\n", ctr++, myList.get(i));
    }
    delete();
    verifyUser();
  }    
  
}

//Side note: List<Integer> fuck = new ArrayList<>(); Java 7 syntax. Use Integer obejct which is the wrapper of primitive int. Remember, collections must be object types.




