/*
This code will show you how to kinda initialize an constructor with an array argument.
This will also show you how to use the buil-in string methods startsWith and endsWith to 
manipulate strings. 
*/

class Main 
{
  public static void main(String[] args) 
  {
    String myArray[] = {"chunk", "fuck", "baconator", "funny"};

    StringControls sc = new StringControls(myArray);

    sc.startsWith();
    
  }
    
}


class StringControls
{
  private String[] words;

  public StringControls(String[] w)
  {
    this.words = w;
  }

  public void startsWith()
  {
    for (String placeHolder: words)
    {
      //starts with
      if(placeHolder.startsWith("fu"))
      System.out.println(placeHolder + " starts with fu");
      else
      System.out.println(placeHolder + " doesn't start with fu");
    }
  }

  public void endsWith()
  {
    for (String placeHolder: words)
    {
    //ends with
      if(placeHolder.endsWith("unk"))
      System.out.println(placeHolder + " ends with unk");
      else
      System.out.println(placeHolder + " doesn't end with unk");
    }
  }
}