//https://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html
//here we use compareTo method for string data
//compareTo https://beginnersbook.com/2013/12/java-string-compareto-method-example/

import java.util.*;
class Main 
{
  public static void main(String[] args) 
  {
      System.out.println(max(23,42,1));
      System.out.println(max("Shit", "crap","pee"));
  }
    
//T means, it will return generic data
public static <T extends Comparable<T>> T max(T a, T b, T c)
{
  T m = a; //think of the T as a data taype. Well it is, except that it's a generic type
  if(b.compareTo(a) > 0) //if b 
    m = b;
  
  if(c.compareTo(m) > 0)
    m =c;

  return m;
}
}