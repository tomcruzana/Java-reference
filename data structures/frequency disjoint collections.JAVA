import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    //convert stuff array to a list
    String[] stuff = {"ham", "beef", "banana", "turkey"};

    List<String> list1 = Arrays.asList(stuff);

    ArrayList<String> list2 = new ArrayList<String>();

    list2.add("youtube");
    list2.add("facebook");
    list2.add("google");

    for (String x : list2)
    {
      System.out.printf("%s ", x);
    }

    Collections.addAll(list2, stuff); //destination, source
    System.out.println();
    for (String x : list2)
    {
      System.out.printf("%s ", x);
    }

    //frequency
    System.out.println(Collections.frequency(list2, "facebook")); //should return 1

    boolean trueOrFalse = Collections.disjoint(list1, list2); //returns true if the have items in common (1 or 0)
    System.out.println(trueOrFalse);

  }
}