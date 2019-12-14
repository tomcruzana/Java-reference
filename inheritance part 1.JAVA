 class Main 
{
  public static void main(String[] args) 
  {
    Food food1 = new Food();
    Chicken chicken1 = new Chicken();

    food1.eat();
    chicken1.eat();
  }
}

class Food
{
  public void eat()
  {
    System.out.printf("I'm eating food right now!\n");
  }
}

class Chicken extends Food //when inheriting from a super class use the extends keyword
{
  public void eat()
  {
    System.out.printf("I'm eating chicken right now!\n");
  }
}

