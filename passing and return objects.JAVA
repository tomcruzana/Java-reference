//https://www.geeksforgeeks.org/passing-and-returning-objects-in-java/

// Java program to demonstrate objects 
// passing to methods. 
class ObjectPassDemo 
{ 
    int a, b; 
  
    ObjectPassDemo(int i, int j) 
    { 
        a = i; 
        b = j; 
    } 
  
    // return true if o is equal to the invoking 
    // object notice an object is passed as an 
    // argument to method 
    boolean equalTo(ObjectPassDemo o) 
    { 
        return (o.a == a && o.b == b); 
    } 
} 
  
// Driver class 
public class Test 
{ 
    public static void main(String args[]) 
    { 
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22); 
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22); 
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1); 
  
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2)); 
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3)); 
    } 
} 

//-------------ANOTHER EXAMPLE-------------------------------//
/*
Defining a constructor that takes an object of its class as a parameter

One of the most common uses of object parameters involves constructors. Frequently, in practice, there is need to construct a new object so that it is initially the same as some existing object. To do this, either we can use Object.clone() method or define a constructor that takes an object of its class as a parameter. The second option is illustrated in below example:
*/
// Java program to demonstrate one object to 
// initialize another 
class Box 
{ 
	double width, height, depth; 

	// Notice this constructor. It takes an 
	// object of type Box. This constructor use 
	// one object to initialize another 
	Box(Box ob) 
	{ 
		width = ob.width; 
		height = ob.height; 
		depth = ob.depth; 
	} 

	// constructor used when all dimensions 
	// specified 
	Box(double w, double h, double d) 
	{ 
		width = w; 
		height = h; 
		depth = d; 
	} 

	// compute and return volume 
	double volume() 
	{ 
		return width * height * depth; 
	} 
} 

// driver class 
public class Test 
{ 
	public static void main(String args[]) 
	{ 
		// creating a box with all dimensions specified 
		Box mybox = new Box(10, 20, 15); 

		// creating a copy of mybox 
		Box myclone = new Box(mybox); 

		double vol; 

		// get volume of mybox 
		vol = mybox.volume(); 
		System.out.println("Volume of mybox is " + vol); 

		// get volume of myclone 
		vol = myclone.volume(); 
		System.out.println("Volume of myclone is " + vol); 
	} 
} 
