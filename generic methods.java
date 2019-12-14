//https://docs.oracle.com/javase/tutorial/java/generics/methods.html

import java.util.*;
class Main 
{
  public static void main(String[] args) 
  {
    Integer[] iray = {1,2,3,4};
    Character[] cray = {'b','u','c','y'};

    printMe(iray);
    printMe(cray);
  }

//generic method
//T stand for generic type. It's the standard naming convention but u may change it
public static <T> void printMe(T[] x)
{
  for (T b: x)
  System.out.printf("%s ", b);
  System.out.println();
}
}