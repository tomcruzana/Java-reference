import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    StringControls sc = new StringControls();
    sc.findTheIndexOf();
  }
    
}

class StringControls
{
  private Scanner myInput;
  private String word;
  private String stringToFind;
 
  public StringControls()
  {
    //empty constructor
  }

  public void findTheIndexOf()
  {
    myInput = new Scanner(System.in);
    System.out.println("Type a word \n");
    word = myInput.nextLine(); //ask for the word

    System.out.println("Type a word that you want to find the index of\n");
    stringToFind = myInput.nextLine(); //ask for the word to find

    System.out.println(word.indexOf(stringToFind)); // look up (indexOf(stringToFind, x) x can be the starting point of the search
  }
}