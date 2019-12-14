import java.util.*;

class Main {
  public static void main(String[] args) 
  {
    //create an array and covert to list
    Character[] ray = {'p','w','n'};
    List<Character> l = Arrays.asList(ray);
    System.out.println("List is: ");
    output(l);

    //reverse and print out list
    Collections.reverse(l);
    System.out.println("After reverse: ");
    output(l);

    //create a new array and list
    Character[] newRay = {'p','w','n'};
    List<Character> listCopy = Arrays.asList(newRay);

    //copy contents of list to listCopy
    Collections.copy(listCopy, l); //destination & copy
    System.out.println("Copy of List: ");
    output(listCopy);

    //fill collection with crap
    Collections.fill(l, 'X'); //src, new elements to replace the l chars
    System.out.println("After filling the List: ");
    output(l);
  }

  private static void output(List<Character> theList) //output method
  {
    for(Character thing: theList)
    {
      System.out.printf("%s ", thing);
    }
    System.out.println();
  }
}