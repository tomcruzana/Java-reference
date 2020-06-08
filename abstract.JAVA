/*
    Abstract classes allows us to create classes that cannot be instantiated, but can only be inherited.
    Abstract classes can also have final methods (methods that cannot be overridden).
*/

abstract class Base {
    private int x;

    public Base(int x) { //an abstract class can contain constructors in Java.
        this.x = x;
    }

    abstract void fun(); //This is an abstract method and it can't have a body

    public String giveLove(){
        return "Giving you some love."; //we can have an abstract class without any abstract type method
    }
}
class Derived extends Base {
    public Derived(int x) {
        super(x);
    }

    void fun() { System.out.println("Derived fun() called"); }
}
class Main {
    public static void main(String args[]) {

        // Uncommenting the following line will cause compiler error as the 
        // line tries to create an instance of abstract class. 
        //Base b = new Base(); 

        // We can have references of Base type. 
        Base b = new Derived(1);
        b.fun();
    }
} 
