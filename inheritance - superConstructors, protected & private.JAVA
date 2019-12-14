//https://docs.oracle.com/javase/tutorial/java/IandI/super.html
//https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
//https://stackoverflow.com/questions/19843021/access-a-private-variable-from-the-superclass-java

/*
*A subclass inherits all the members (fields, methods, and nested classes) from its superclass depending on the access modifier.
*A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods for accessing its private fields (AKA getter and setters), these can also be used by the subclass. 
*Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
*/

public class Main 
{
  public static void main(String[] args) 
  {
    Puta p = new Puta("Rowena");
    p.show();

    Tanga t = new Tanga("Angela");
    t.show();
  }
}

class Puta
{
  //super class has 2 fields
  protected String name;
  private int age;
  
  //super class' main constructor
  public Puta(String name)
  {
    this.name = name; 
  }

  //setter for private age variable
  public int setAge(int newAge) //setter to access the private age variable
  {
    this.age = newAge;
    return newAge;
  }

  //print to screen method
  public void show()
  {
    System.out.println("Your bitch's name is " + name);
  }

}

class Tanga extends Puta
{
  
  public Tanga(String name)
  {
    super(name); //explicitly define the super class's constructor or else you'll get an error. Check out the documentation above for an explanation for this.
  }
  
  //override
  public void show()
  {
    System.out.printf("Your bitch's name is %s", name); //access super class' protected name field
    System.out.printf("Your bitch's age is %d", setAge(22)); //access super class' private age field using the setter
  }
}