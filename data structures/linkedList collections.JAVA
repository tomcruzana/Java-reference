//https://www.geeksforgeeks.org/linked-list-in-java/
import java.util.LinkedList;

public class Main 
{
  public static void main(String[] args) 
  {

    LinkedList<String> object = new LinkedList<String>();
    for(int i = 0; i < 10; i++)
    {
      object.add("Fuck"); //adds fuck 10x
    }
    object.addFirst("Grapes");
    object.add("You!");

    System.out.println(object);
    System.out.println(object.getFirst());
    System.out.println(object.getLast());
  }
}



