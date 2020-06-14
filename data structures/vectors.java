/*
Vectors are thread safe!!!

docs: https://www.geeksforgeeks.org/java-util-vector-class-java/

The Vector class implements a growable array of objects. Vectors basically fall in legacy classes but now it is fully compatible with collections.

    Vector implements a dynamic array that means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index
    They are very similar to ArrayList but Vector is synchronised and have some legacy method which collection framework does not contain.
    It extends AbstractList and implements List interfaces.

Constructor:

    Vector(): Creates a default vector of initial capacity is 10.
    Vector(int size): Creates a vector whose initial capacity is specified by size.
    Vector(int size, int incr): Creates a vector whose initial capacity is specified by size and increment is specified by incr. It specifies the number of elements to allocate each time that a vector is resized upward.
    Vector(Collection c): Creates a vector that contains the elements of collection c.

Important points regarding Increment of vector capacity:
If increment is specified, Vector will expand according to it in each allocation cycle but if increment is not specified then vector’s capacity get doubled in each allocation cycle. Vector defines three protected data member:


    int capacityIncreament: Contains the increment value.
    int elementCount: Number of elements currently in vector stored in it.
    Object elementData[]: Array that holds the vector is stored in it.

*/

// Java code illustrating clear() method
import java.util.*;
class Vector_demo {
    public static void main(String[] arg)
    {

        // create default vector
        Vector v = new Vector();

        v.add(0, 1); //note index param is optional
        v.add(1, 2);
        v.add(2, "geeks");
        v.add(3, "forGeeks");
        v.add(4, 3);

        System.out.println("Vector is: " + v);

        // clearing the vector
        v.clear();

        // checking vector
        System.out.println("after clearing: " + v);
    }
}
