
/*

 * This program demonstrates cloning.
 * @version 1.10 2002-07-01
 * @author Cay Horstmann
 #######################################################################
  Object Cloning

  The Clone() belongs to the Object class. In this section, we discuss the Cloneable interface that indicates that a class has
  provided a safe clone method. Since cloning is not all that common, and the details
  are quite technical, you may just want to glance at this material until you need it.
  To understand what cloning means, recall what happens when you make a copy
  of a variable holding an object reference. The original and the copy are references
  to the same object (see Figure 6.1). This means a change to either variable also
  affects the other.

  Employee original = new Employee("John Public", 50000);
  Employee copy = original;
  copy.raiseSalary(10); // oops--also changed original

  If you would like copy to be a new object that begins its life being
  Employee copy = original.clone();
  copy.raiseSalary(10); // OK--original unchanged

  The default cloning operation is
  “shallow”—it doesn’t clone objects that are referenced inside other objects.
  Does it matter if the copy is shallow? It depends. If the subobject shared between
  the original and the shallow clone is immutable, then the sharing is safe. This certainly
  happens if the subobject belongs to an immutable class, such as String. Alternatively,
  the subobject may simply remain constant throughout the lifetime of
  the object, with no mutators touching it and no methods yielding a reference to it.
  Quite frequently, however, subobjects are mutable, and you must redefine the
  clone method to make a deep copy that clones the subobjects as well.

  NOTE: The clone method is declared protected in the Object class, so that your
  code can’t simply call anObject.clone().

  For every class, you need to decide whether
  1. The default clone method is good enough;
  2. The default clone method can be patched up by calling clone on the mutable
  subobjects; and
  3. clone should not be attempted.
  The third option is actually the default. To choose either the first or the second
  option, a class must
  1. Implement the Cloneable interface; and
  2. Redefine the clone method with the public access modifier.

  In this case, the appearance of the Cloneable interface has nothing to do with the
  normal use of interfaces. In particular, it does not specify the clone method—that
  method is inherited from the Object class. The interface merely serves as a tag, indicating
  that the class designer understands the cloning process. Objects are so
  paranoid about cloning that they generate a checked exception if an object requests
  cloning but does not implement that interface.

  NOTE: The Cloneable interface is one of a handful of tagging interfaces that Java
  provides. (Some programmers call them marker interfaces.) Recall that the
  usual purpose of an interface such as Comparable is to ensure that a class implements
  a particular method or set of methods. A tagging interface has no methods;
  its only purpose is to allow the use of instanceof in a type inquiry:
  if (obj instanceof Cloneable) . . .
  We recommend that you do not use tagging interfaces in your own programs.

  Even if the default (shallow copy) implementation of clone is adequate, you
  still need to implement the Cloneable interface, redefine clone to be public, and call
  super.clone().

  class Employee implements Cloneable
  {
      // raise visibility level to public, change return type
      public Employee clone() throws CloneNotSupportedException
      {
          return (Employee) super.clone();
      }
      . . .
  }

  The following is a procedure on how to perform a deep copy clone:

  The clone method that you just saw adds no functionality to the shallow copy
  provided by Object.clone. It merely makes the method public. To make a deep
  copy, you have to work harder and clone the mutable instance fields.
  Here is an example of a clone method that creates a deep copy:
  class Employee implements Cloneable
  {
  . . .
  public Employee clone() throws CloneNotSupportedException
  {
  // call Object.clone()
  Employee cloned = (Employee) super.clone();
  // clone mutable fields
  cloned.hireDay = (Date) hireDay.clone();
  return cloned;
  }
  }
  The clone method of the Object class threatens to throw a CloneNotSupportedException—it
  does that whenever clone is invoked on an object whose class does not implement
  the Cloneable interface.

  In shallow copy, only fields of primitive data type are copied while the objects references are not copied.
  Deep copy involves the copy of primitive data type as well as object references.

  NOTE: All array types have a clone method that is public, not protected.You can
  use it to make a new array that contains copies of all elements. For example:
  int[] luckyNumbers = { 2, 3, 5, 7, 11, 13 };
  int[] cloned = luckyNumbers.clone();
  cloned[5] = 12; // doesn't change luckyNumbers[5]
*/

import java.util.Date;
import java.util.GregorianCalendar;

public class Main
{
   public static void main(String[] args)
   {
      try
      {
         Employee original = new Employee("John Q. Public", 50000);
         original.setHireDay(2000, 1, 1);
         Employee copy = original.clone();
         copy.raiseSalary(10);
         copy.setHireDay(2002, 12, 31);
         System.out.println("original= " + original);
         System.out.println("copy= " + copy);
      }
      catch (CloneNotSupportedException e)
      {
         e.printStackTrace();
      }
   }
}

class Employee implements Cloneable
{
   private String name;
   private double salary;
   private Date hireDay;

   public Employee(String name, double salary)
   {
      this.name = name;
      this.salary = salary;
      hireDay = new Date();
   }

   public Employee clone() throws CloneNotSupportedException
   {
      // call Object.clone()
      Employee cloned = (Employee) super.clone();

      // clone mutable fields
      cloned.hireDay = (Date) hireDay.clone();

      return cloned;
   }

   /**
    * Set the hire day to a given date. 
    * @param year the year of the hire day
    * @param month the month of the hire day
    * @param day the day of the hire day
    */
   public void setHireDay(int year, int month, int day)
   {
      Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
      
      // Example of instance field mutation
      hireDay.setTime(newHireDay.getTime());
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   public String toString()
   {
      return "Employee[ name=" + name + "\n" + ",salary=" + salary +  "\n" + ",hireDay=" + hireDay + "]" + "\n" ;
   }
}
