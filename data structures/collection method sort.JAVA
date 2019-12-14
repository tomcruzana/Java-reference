/*
Collection method sort
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    String[] crap = {"lemom", "geese", "jojo", "star", "lobo"};

    List<String> l1 = Arrays.asList(crap);

    Collections.sort(l1); //sort the list
    System.out.printf("%s\n", l1);

    Collections.sort(l1, Collections.reverseOrder()); //sort the list in reverse order
    System.out.printf("%s\n", l1);
  }
}