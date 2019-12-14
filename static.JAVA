/*
When we want the variable or function value to be shared between all instances of the class ,we can declare the variable or method to be static. Also static variable are associated with a class rather than particular objects so they are assigned value once and remains the same throughout the lifetime.
*/

class Main {
  public static void main(String[] args) 
  {
    Tank tank1 = new Tank("M1 Abrams");
    tank1.fire(); //calling the static field totalFire
    Tank tank2 = new Tank("T14 Armata");
    tank2.fire(); //calling the static field totalFire
    Tank tank3 = new Tank("T-90");
    tank3.fire(); //calling the static field totalFire

    System.out.println("Total tanks in the arena: " + Tank.getTotalTanks()); //notice that we didn't use an object/instance here, we invoked the static method directly from the class Tank.
    
  }
}

//NEW FILE

class Tank
{
  private String name;
  private static int totalFires = 0;
  private static int totalTanks = 0;

  public Tank(String name)
  {
    this.name = name;
    this.totalFires++;
    this.totalTanks++;
  }

  public void fire()
  {
    System.out.printf("Tank buster %s launched a ballistic missile!\nTotal fires: %s\n", name, totalFires);
  }

  public static int getTotalTanks()
  {
    return totalTanks;
  }
}

