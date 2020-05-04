//See reference for rules: https://www.geeksforgeeks.org/overloading-in-java/
/*
This is a basic example of polymorphism.

Method Overloading is static polymorphism : Same method name is overloaded with different type or number of parameters in same class (different signature). Targeted method call is resolved at compile time

Same name but different params. Can also be implemented in child classes.
*/


public class Sum { 

	// Overloaded sum(). This sum takes two int parameters 
	public int sum(int x, int y) 
	{ 
		return (x + y); 
	} 

	// Overloaded sum(). This sum takes three int parameters 
	public int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	// Overloaded sum(). This sum takes two double parameters 
	public double sum(double x, double y) 
	{ 
		return (x + y); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Sum s = new Sum(); 
		System.out.println(s.sum(10, 20)); 
		System.out.println(s.sum(10, 20, 30)); 
		System.out.println(s.sum(10.5, 20.5)); 
	} 
} 
