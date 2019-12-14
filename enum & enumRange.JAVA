/*
REFERENCES:
https://www.w3schools.com/java/java_enums.asp

An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

Difference between Enums and Classes

An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
Why And When To Use Enums?

Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
*/
public enum Employees
{
  TOM("Software Developer", 28),
  HAROLD("Network Administrator", 27),
  GERALD("Lead Software Developer", 30),
  PAUL("IT Asset Manager", 26),
  RR("Scammer", 29),
  JANETH("Restaurant Manager", 31);

  private final String description;
  private final int age;

  Employees(String description, int age)
  {
    this.description = description;
    this.age = age;
  }

  public String getDescription()
  {
    return description;
  }

  public int getAge()
  {
    return age;
  }
}

//NEW FILE-----------------------------------

import java.util.EnumSet; //import the enumset lib

class Main {
  public static void main(String[] args) 
  {
    //The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
    for (Employees myEmployeeList : Employees.values()) 
    {
        System.out.printf("%s\t%s\t%s\n", myEmployeeList, myEmployeeList.getDescription(), myEmployeeList.getAge());
    }

    System.out.println("\n");
    //set range
     for (Employees myEmployeeList : EnumSet.range(Employees.TOM, Employees.GERALD)) 
    {
        System.out.printf("%s\t%s\t%s\n", myEmployeeList, myEmployeeList.getDescription(), myEmployeeList.getAge());
    }
  }
}