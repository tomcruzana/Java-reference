/*
docs: https://docs.oracle.com/javase/tutorial/java/generics/types.html
A generic type is a generic class or interface that is parameterized over types.

By convention, type parameter names are single, uppercase letters. This stands in sharp contrast to the variable naming conventions that you already know about, and with good reason: Without this convention, it would be difficult to tell the difference between a type variable and an ordinary class or interface name.

The most commonly used type parameter names are:

    E - Element (used extensively by the Java Collections Framework)
    K - Key
    N - Number
    T - Type
    V - Value
    S,U,V etc. - 2nd, 3rd, 4th types

In Java SE 7 and later, you can replace the type arguments required to invoke the constructor of a generic class with an empty set of type arguments (<>) as long as the compiler can determine, or infer, the type arguments from the context. This pair of angle brackets, <>, is informally called the diamond. 
*/

//Main module
class Main{
    public static void main(String[] args) {
        Student<String, Integer> s = new Student("Thomas", 29);
        System.out.println(s.toString());
    }
}

//Student module
public class Student <i1, i2>{
    private i1 name;
    private i2 grade;

    public Student(i1 name, i2 grade) {
        super();
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s/%d", name, grade);
    }
}
