/*
Converting linked list into an array and vice versa
*/

import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    String[] stuff = {"shampoo", "deodorant"};

    LinkedList<String> stuffList = new LinkedList<String>(Arrays.asList(stuff)); //convert array to a linked asList

    //add items into the linked list
    stuffList.add("panty liner");
    stuffList.addFirst("crayons");

    //convert the linked list back into an array
    stuff = stuffList.toArray(new String[stuffList.size()]);
    
    for (String x: stuff)
    {
      System.out.println(x);
    }
  }
}