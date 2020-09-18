//doc: https://www.w3schools.com/java/java_regex.asp
//     https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
//     https://docs.oracle.com/javase/7/docs/api/java/util/regex/Matcher.html

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}
// Outputs Match found
