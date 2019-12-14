/*
In the Java programming language, the final keyword is used in several contexts to define an entity that can only be assigned once. Once a final variable has been assigned, it always contains the same value. Technically, it's a constant entity.

Read more: https://www.geeksforgeeks.org/final-keyword-java/
final keyword is used in different contexts. First of all, final is a non-access modifier applicable only to a variable, a method or a class.Following are different contexts where final is used.

FINAL VARIABLE > TO CREATE CONSTANT VARIABLES
FINAL METHODS > PREVENT METHOD OVERRIDING
FINAL CLASSES > PREVENT INHERITANCE
*/

final int THRESHOLD = 5
static final double EULERCONSTANT;
------------------------------------------------

final class A
{
     // methods and fields
}
// The following class is illegal.
class B extends A 
{ 
    // COMPILE-ERROR! Can't subclass A
}
------------------------------------------------
class A 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}

class B extends A 
{
    void m1()
    { 
        // COMPILE-ERROR! Can't override.
        System.out.println("Illegal!");
    }
}


