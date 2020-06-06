
/*	
An interface is a completely "abstract class" that is used to group related methods with empty bodies:
	
To access the interface methods, the interface must be "implemented" (kinda like inherited) by another 	class with the implements keyword (instead of extends). The body of the interface method is provided by 	the "implement" class:


Notes on Interfaces:

    Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
    Interface methods do not have a body - the body is provided by the "implement" class
    On implementation of an interface, you must override all of its methods
    Interface methods are by default abstract and public
    Interface attributes are by default public, static and final
    An interface cannot contain a constructor (as it cannot be used to create objects)

Why And When To Use Interfaces?

1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).

Side note:
Use abstract class when you want to extend a comman base and where you want to provide a default implementation to the abstract method. Use interface when you want to exactly implement all the abstract methods to the class implementaing the interface and no default body to a method can be provided.
*/

import java.io.*; 

interface Vehicle { 
	
	// all are the abstract methods. 
	void changeGear(int a); 
	void speedUp(int a); 
	void applyBrakes(int a); 
} 

class Bicycle implements Vehicle{ 
	
	int speed; 
	int gear; 
	
	// to change gear 
	@Override
	public void changeGear(int newGear){ 
		
		gear = newGear; 
	} 
	
	// to increase speed 
	@Override
	public void speedUp(int increment){ 
		
		speed = speed + increment; 
	} 
	
	// to decrease speed 
	@Override
	public void applyBrakes(int decrement){ 
		
		speed = speed - decrement; 
	} 
	
	public void printStates() { 
		System.out.println("speed: " + speed 
			+ " gear: " + gear); 
	} 
} 

class Bike implements Vehicle { 
	
	int speed; 
	int gear; 
	
	// to change gear 
	@Override
	public void changeGear(int newGear){ 
		
		gear = newGear; 
	} 
	
	// to increase speed 
	@Override
	public void speedUp(int increment){ 
		
		speed = speed + increment; 
	} 
	
	// to decrease speed 
	@Override
	public void applyBrakes(int decrement){ 
		
		speed = speed - decrement; 
	} 
	
	public void printStates() { 
		System.out.println("speed: " + speed 
			+ " gear: " + gear); 
	} 
	
} 
class GFG { 
	
	public static void main (String[] args) { 
	
		// creating an inatance of Bicycle 
		// doing some operations 
		Bicycle bicycle = new Bicycle(); 
		bicycle.changeGear(2); 
		bicycle.speedUp(3); 
		bicycle.applyBrakes(1); 
		
		System.out.println("Bicycle present state :"); 
		bicycle.printStates(); 
		
		// creating instance of bike. 
		Bike bike = new Bike(); 
		bike.changeGear(1); 
		bike.speedUp(4); 
		bike.applyBrakes(3); 
		
		System.out.println("Bike present state :"); 
		bike.printStates(); 
	} 
} 
