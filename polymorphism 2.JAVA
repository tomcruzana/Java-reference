class Main 
{
  public static void main(String[] args) 
  {
    Animal[] theList = new Animal[2];
    Dog d = new Dog();
    Fish f = new Fish();

    theList[0] = d;
    theList[1] = f;

    for (Animal x: theList) //enhanced for loop. Declare an animal type variable
    {
    x.noise();
    }
  }
}

class Animal
{
  public void noise()
  {
    System.out.println("Animals done make noise!");
  }
}

class Fish extends Animal
{
  public void noise()
  {
    System.out.println("Glurp slurp");
  }
}

class Dog extends Animal
{
  public void noise()
  {
    System.out.println("Ruff!");
  }
}