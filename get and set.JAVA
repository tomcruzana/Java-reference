/*
Getter and Setter - Encapsulation
https://www.w3schools.com/java/java_encapsulation.asp

You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public getter and setter methods.

The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:
*/

/*
Example explained

The get method returns the value of the variable name.

The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.

However, as the name variable is declared as private, we cannot access it from outside this class:
*/
public class Main 
{
  public static void main(String[] args) 
  {
    Person Person1 = new Person();
    //Person1.name = "John";  // error since you are directly accessing the private field
    //System.out.println(Person1.name); // You must use the setter

    Person1.setName("Tom");
    System.out.println(Person1.getName());
  }
} 

class Person 
{
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
} 