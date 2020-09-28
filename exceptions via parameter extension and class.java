//Example 1: Exception handler via functon parameter extention
/*
Throws clause is used to declare an exception, which means it works similar to the try-catch block. ... Throw keyword is used in the method body to throw an exception, while throws is used in method signature to declare the exceptions that can occur in the statements present in the method.
*/

//Main module
public class Main {

    public static void main(String[] args)
    {
        Calc c = new Calc();
        try{c.add(9);} //surrounding this method with exception handler a requirment of this method
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

//Module 2
public class Calc {

    public int add(int number) throws Exception{ //funtion para extension via exception class
        if (number < 10) {
            throw new Exception("The number passed was smaller than 10"); //custom exception handler
        }
        return 0;
    }
}


//Example 2 : Extending the xxception handler class via a custom class
//Main module
public class Main {

    public static void main(String[] args)
    {
        Calc c = new Calc();
        try{c.add(9);} //surrounding this method with exception handler a requirment of this method
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

//Module 2
public class Calc {

    public int add(int number) throws Exception{
        if (number < 10) {
            throw new MyErrorHandler("The number passed was smaller than 10"); //reference your own error handler class
        }
        return 0;
    }
}

class MyErrorHandler extends Exception { //make sure it extends this class
    public MyErrorHandler(String message) {
        super(message + " you suck"); //initialize the message string of the exception class.
    }
}

//Note: In most cases, utilize the built-in Java exceptions. But if you wanna write your own exception handler, store it in a package


