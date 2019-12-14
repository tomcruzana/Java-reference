//DOCUMENTATION about Java iterator: https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
//Code improved by Tom (2019).
import java.util.*;

class Main {
  private static String[] things= {"eggs", "fuck", "toilet", "crap"};  
  private static String[] morethings = {"lasers", "hats", "eggs"};
  private static List<String> list1 = new ArrayList<String>(); //list collection 1
  private static  List<String> list2 = new ArrayList<String>(); //list collection 2

  public static void main(String[] args) 
  {
    add(things, list1); //add the the array elements of things into the list1 collection
    add(morethings, list2); //add the the array elements of morethings  into the list2collection
    
    print(); //print out list 1

    editlist(list1, list2); //call editlist method with 2 collection params
    System.out.println(); //just a simple new line
    
    print(); //print out list 1

  }

  public static void add(String arr[], Collection<String> list) //takes  2 args (an array and a collection)
  {
    for(String y: arr) //adds element for a list collection from morethings array
    {
      list.add(y);
    }
  }

  public static void editlist(Collection<String> l1, Collection<String> l2)
  {
    Iterator<String> it = l1.iterator();//goes through each list item by item! 
    while(it.hasNext())//lopp through until you reach the end of the hasNext
    {
      if(l2.contains(it.next())) //if the list2 contains anything that it(l1) has, it will remove it
      it.remove();
    }
  }

  public static void print()
  {
    //print out list 1
    for(int i = 0; i < list1.size(); i++)
    {
      System.out.printf("%s ", list1.get(i));
    }
  }
}