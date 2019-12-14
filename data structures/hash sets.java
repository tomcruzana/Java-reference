import java.util.*;
class Main {
  public static void main(String[] args) {
    String[] things = {"apple", "bob", "ham", "bob", "bacon"};
    List<String> list = Arrays.asList(things); //convert thing array into a list

    System.out.printf("%s",list);
    System.out.println();

    Set<String> set = new HashSet<String>(list); //removes duplicates
   System.out.printf("%s",set);
  }
}