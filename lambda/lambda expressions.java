/*
docs: https://www.geeksforgeeks.org/functional-interfaces-java/

A functional interface is an interface that contains only one abstract method.
They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
A functional interface can have any number of default methods. Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
Before Java 8, we had to create anonymous inner class objects or implement these interfaces.

Java lambda expressions are Java's first step into functional programming.
A Java lambda expression is thus a function which can be created without belonging to any class. ...
Java lambda expressions are commonly used to implement simple event listeners / callbacks, or in functional programming with the Java Streams API.
*/

class Main{
    public static void main(String[] args) {
        MyLambda lambda = () -> { //syntax interface varibale = () ->{..code here}
            System.out.println("My ass boui!");
        };
        lambda.someMethod();

        Sum sum = (int x, int y) -> x + y; //if it's a one liner, you dont need to explicitly type return
        System.out.println(sum.add(15, 12));

        genericInterface printMe = (Object message) -> {
            return message;
        };

        System.out.println(printMe.worker("Fuck you"));
    }
}

//A functional interface has only one method signature. Explicitly defining @FunctionalInterface prevent you from adding a second method
@FunctionalInterface
interface genericInterface<T> {
    public T worker(T t);
}

@FunctionalInterface
interface MyLambda {
    public void someMethod();
}

@FunctionalInterface
interface Sum {
    public int add(int x, int y);
}


