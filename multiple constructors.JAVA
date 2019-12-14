public class Main 
{
  public static void main(String[] args) 
  {
      
      Book Book1 = new Book();
      Book1.printBookInfo();
      
      Book Book2 = new Book("PC Repairs");
      Book2.printBookInfo();
      
      Book Book3 = new Book("Software Engineering","000-44512-99");
      Book3.printBookInfo();
      
      
  }
}

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