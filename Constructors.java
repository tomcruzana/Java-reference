/*
https://stackoverflow.com/questions/30995942/do-constructors-always-have-to-be-public



Constructors can be public, private, protected or default(no access modifier at all).

Making something private doesn't mean nobody can access it. It just means that nobody outside the class can access it. So private constructor is useful too.

One of the uses of a private constructor is to serve singleton classes. A singleton class is one which limits the number of objects creation to one. Using private constructor we can ensure that no more than one object can be created at a time.
*/

//Example #1

class Sample
{
   private String title;
   private int quantity;

   public Sample() { //this is an empty constructor, and you don't have to declare this be default
     //code here
   }

   public Sample() { //this is constructor with default values.
     this("No title", 40)
     //code here
   }

   public Sample(String title, int quantity) { //this is constructor with parameters.
      this.title = title;
      this.quantity = quantity; 
   }
}


//Example #2

class Book
{
    private String title;
    private String isbn;

    public Book()
    {
      this("Default Title");
    }
    
    public Book(String title)
    {
      this.title = title;
    }
    
    public Book(String title, String isbn)
    {
      this.title = title;
      this.isbn = isbn;
    }
    
    public void printBookInfo()
    {
        System.out.println(title + "\n" + isbn);
    }
}