/*
https://stackoverflow.com/questions/3615721/how-to-use-the-tostring-method-in-java
ANYTIME YOU WANNA TURN AN OBJECT INTO A STRING, USE THE toString method
*/
public class Main 
{

  public static void main(String[] args) 
  {
    Potpie potObject = new Potpie(4,5,6);
  }
}

class Potpie
{
  private int month;
  private int day;
  private int year;

  public Potpie(int m, int d, int y)
  {
    month = m;
    day = d;
    year = y;

    System.out.printf("The constructor for this is %s\n", this); //this is a reference to the current object. Which is the %s
  }

  public String toString()
  {
    return String.format("%d/%d/%d", month, day, year);
  }
}
