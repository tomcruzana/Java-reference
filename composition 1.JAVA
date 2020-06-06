/*
https://en.wikipedia.org/wiki/Composition_over_inheritance
The composition principle enables a programmer to model a (part-of) relationship between classes. As an example:  Part of a laptop is a processor (CPU) so, a laptop class can have an instance of a processor class as its member. 

I think it's worth mentioning that the composition and aggregation principles are subsets of association. There is a subtle difference between composition and aggregation. Aggregation indicates that a child class can exist independently of the parent class.  Composition demonstrates that a child class can't survive if the parent class is deleted. As an example: Part-of a computer motherboard is a processor. Hence, in OOP, a Motherboard class can have an instance of a Processor class as its member.

class Motherboard
{
Processor amd = new Processor();
//code goes here
} 

If there is a need for communication among classes, there must be a connection between them. An association connector can represent the link. For example, a doctor can associate with multiple patients.  Bus passengers can associate with a bus driver. 

Read more: https://abhiandroid.com/java/composition 
*/

class Bike
{

  // declaring data members and methods

  private String color;

  private int wheels;

  public void bikeFeatures()

  {

    System.out.println("Bike Color= "+color + " wheels= " + wheels);

  }

  public void setColor(String color)

  {

    this.color = color;

  }

  public void setwheels(int wheels)

  {

    this.wheels = wheels;

  }

}


class Honda extends Bike

{

  //inherits all properties of bike class

  public void setStart()

  {

    HondaEngine e = new HondaEngine();

    e.start();

  }

}

class HondaEngine

{

  public void start()

  {

    System.out.println("Engine has been started.");

  }

  public void stop()

  {

    System.out.println("Engine has been stopped.");

  }

}

class CompositionDemo

{

  public static void main(String[] args)

  {

    Honda h = new Honda();

    h.setColor("Black");

    h.setwheels(2);

    h.bikeFeatures();

    h.setStart();

  }

}