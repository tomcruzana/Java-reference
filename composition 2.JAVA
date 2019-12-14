public class Main 
{
  public static void main(String[] args) 
  {
    Motherboard motherboard1 = new Motherboard();
    motherboard1.powerOn();
  }
}


//create a new file since this will be public
public class Processor
{
  private String brand;
  private double speed;

  public Processor(String brand, double speed) //constructor that accepts 2 arguments
  {
      this.brand = brand; //syntax: this brand refers to the main brand field of THIS object and the brand refers to the argument of the constructor
      this.speed = speed;
  }

  public void showProcessorInfo()
  {
    System.out.println("Processor brand: " + brand
                        + "\n" + "Processor speed: " + speed); //prints out the brand and the clock speed of the CPU
  }
}

//create a new file since this will be public
public class Motherboard
{
  public void powerOn()
  {
    Processor processor1 = new Processor("AMD", 3.60); //composition: the motherboard "has-a" processor. In other words, has a is a composition-type relationship. So we create an instance of the processor class inside this Motherboard class.
    
    System.out.println("The computer is now running...");
   

    processor1.showProcessorInfo(); //prints out the processor info
  }
}

